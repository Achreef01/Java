/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ASUS
 */
public class EspritVector implements University {

    ArrayList<Etudiant> etudiants;

    public EspritVector() {
        etudiants = new ArrayList<>();
    }

    @Override
    public void ajouterEtudiant(Etudiant e) {
        this.etudiants.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return this.etudiants.contains(e);
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        for (int i = 0; i < this.etudiants.size(); i++) {
            if (this.etudiants.get(i).getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        this.etudiants.remove(e);
    }

    @Override
    public void displayEtudiants() {
        System.out.println(this.etudiants.toString());
    }

    @Override
    public void trierEtudiantsParId() {
        Collections.sort(this.etudiants);
    }

    @Override
    public void trierEtudiantsParNom() {
        
        this.etudiants.sort(new EtudiantComparatorByName());
    }

}
