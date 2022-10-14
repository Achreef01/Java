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
public class Vendeur extends Employe{
    
    int tauxDeVente;
    
      public Vendeur (int id, String nom, String adresse, int nbr_h,int tauxDeVente){
    
         super(id,nom,adresse,nbr_h);
        this.tauxDeVente=tauxDeVente;
    
}

    @Override
    public String toString() {
        return "Vendeur{" + "id=" + getId() + ", nom=" + getNom() + ", adresse=" + getAdresse() + ", nbr_h= " + getNbr_h() + " tauxDeVente= " + tauxDeVente + '}';
    }
    
     public void salaire(){
     float  total;
     float taux= (this.tauxDeVente)/100;
     total=450 * taux;
        System.out.println("Salaire vendeur = "+total);
        
    }

}