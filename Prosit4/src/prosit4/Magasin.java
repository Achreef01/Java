/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prosit4;

import java.util.Vector;

/**
 *
 * @author ASUS
 */
public class Magasin {
    
    int id;
    String nom;
    String adr;
    
    int cap;
    Vector<Produit> produits = new Vector<Produit>(49);
     Vector<Employe> employe = new Vector<Employe>(19);
    
    
     public Magasin(){
         
  } 

    public Magasin(int id, String adr, int cap, Produit p) {
        this.id = id;
        this.adr = adr;
        this.cap = cap;
        produits.add(p);
    }
    
    
    
      public Magasin(int id, String nom, String adr) {
        this.id = id;
        this.nom = nom;
        this.adr = adr;

    }
      
        public Magasin(int id, String nom, String adr, Employe emp) {
        this.id = id;
        this.nom = nom;
        this.adr = adr;
        employe.add(emp);

    }
     

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    public Vector getProduits() {
        return produits;
    }

    public void setProduits(Produit p) {
        this.produits.addElement(p);
    }
    
     public int getSize() {
        return produits.size();
    }

    @Override
    public String toString() {
        return "Magasin{" + "id=" + id + ", adr=" + adr + ", cap=" + cap + ", Produits=" + produits + '}';
    }
    
     public void afficher() {
         System.out.println("Magasin{" + "id=" + id + ", adresse=" + adr + ", capacité=" + cap);
         System.out.println("List des produits :- "); 
  for(int i=0; i<produits.size(); i++)
         {
         	System.out.println ("Nom Produit: "+produits.get(i).getLibelle()+" prix: "+produits.get(i).getPrix());
                
         }
  afficherEmp();
    
}
      public void afficherEmp() {
         System.out.println("Caracteristiques employes");
          
  for(int i=0; i<employe.size(); i++)
         {
         	System.out.println (employe.get(i).toString());
         }
    
}
     
    
  
}
