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
import java.util.Date;


public class Produit {
     protected  String libelle;
   protected String marque;
   protected float prix;
   protected int id;

    Date date;
    public Produit(){
  
  } 
    public Produit(int pId, String pLib, String pMarq ,float prix )
  {
   
    id = pId;
    libelle = pLib;
    marque = pMarq;
    this.prix = prix;
    
    
  }         
    public void afficher() {
        if(prix!=0.0){
    System.out.println("id : " +id+ ", Libellé : " +libelle+ ", Marque : "+marque+ ", prix : "+prix);}
        else { System.out.println("id : " +id+ ", Libellé : " +libelle+ ", Marque : "+marque);}
}

    @Override
    public String toString() {
        return "Produit{" + "libelle=" + libelle + ", marque=" + marque + ", prix=" + prix + ", id=" + id + ", date=" + date + '}';
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
}
