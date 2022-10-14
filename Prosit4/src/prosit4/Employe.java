/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prosit4;

/**
 *
 * @author ASUS
 */
public class Employe {
    
    private int id;
    private String nom;
    private String adresse;
    private int nbr_h;

    public Employe(int id, String nom, String adresse, int nbr_h) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.nbr_h = nbr_h;
    }

    
    
    @Override
    public String toString() {
        return "Employe{" + "id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", nbr_h=" + nbr_h + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNbr_h() {
        return nbr_h;
    }

    public void setNbr_h(int nbr_h) {
        this.nbr_h = nbr_h;
    }
    
 
    
}
