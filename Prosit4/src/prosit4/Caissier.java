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
public class Caissier extends Employe {
    
    Integer numeroDeCaisse ;
    
    public Caissier(int id, String nom, String adresse, int nbr_h, int numeroDeCaisse){
        
        super(id,nom,adresse,nbr_h);
        this.numeroDeCaisse= numeroDeCaisse;
        
    }

    @Override
    public String toString() {
        return "Caissier{"+ "id=" + getId() + ", nom=" + getNom() + ", adresse=" + getAdresse() + ", nbr_h= " + getNbr_h()  + " numeroDeCaisse= " + numeroDeCaisse + '}';
    }
    
    
     public void salaire(){
         int   nb_h_sup=0;
       if(getNbr_h()>180) { 
        nb_h_sup=getNbr_h()-180;}
       
     
     Double total= ((getNbr_h())*5)+(nb_h_sup*5)*0.15;
        System.out.println("Salaire = "+total);
        
    }
    
}
