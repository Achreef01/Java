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
public class Responsable extends Employe{
    
    Double prime;
    
    public Responsable (int id, String nom, String adresse, int nbr_h,Double prime){
    
          super(id,nom,adresse,nbr_h);
        this.prime=prime;
    
    } 

    @Override
    public String toString() {
        return "Responsable{"+ "id=" + getId() + ", nom=" + getNom() + ", adresse=" + getAdresse() + ", nbr_h= "  + getNbr_h()  + " prime= " + prime + '}';
    }
    
    public void salaire(){
     int   nb_h_sup=0;
       if(getNbr_h() >160) { 
        nb_h_sup=getNbr_h() -160;}
       
     Double total= ((getNbr_h())*10)+(nb_h_sup*10)*0.2;
        System.out.println("Salaire resonsable = "+total);
        
    }
    
    
    
}
