/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author ASUS
 */
public class ListProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant(2, "Ochi", "Mohamed");
        Etudiant e2 = new Etudiant(3, "Ochi", "mounir");
        Etudiant e3 = new Etudiant(1, "Ochi", "Achref");

        EspritVector espritUniversity = new EspritVector();
        espritUniversity.ajouterEtudiant(e1);
        espritUniversity.ajouterEtudiant(e2);
        espritUniversity.ajouterEtudiant(e3);

        System.out.println("PRESENCE : " + espritUniversity.rechercherEtudiant(new Etudiant(3, "", "")));
        espritUniversity.displayEtudiants();

        System.out.println("PRESENCE PAR NOM : " + espritUniversity.rechercherEtudiant("Ali"));

        espritUniversity.trierEtudiantsParId();
        
        espritUniversity.displayEtudiants();
        
        espritUniversity.trierEtudiantsParNom();
        
        espritUniversity.displayEtudiants();

    }

}
