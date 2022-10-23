/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prosit5;

import java.util.Date;

/**
 *
 * @author ASUS
 */

public class Prosit5 {


    public static void main(String[] args) {

        ProduitAliementaire produit1 = new ProduitAliementaire();
        ProduitAliementaire produit2 = new ProduitAliementaire(1021, "Lait", "Delice");
        ProduitAliementaire produit3 = new ProduitAliementaire(2510, "yaourt", "Vitalait");
        ProduitAliementaire produit4 = new ProduitAliementaire(3250, "Tomate", "Sicam", 1.200f);
        ProduitAliementaire produit44 = new ProduitAliementaire(3250, "Tomate", "Sicam", 1.200f);

    
        produit2.affecterPrix(0.7f);

        Magasin m1 = new Magasin(12345, "El ghazela");


        m1.ajouterProduit(produit1);
        m1.ajouterProduit(produit2);
        m1.ajouterProduit(produit3);
        m1.ajouterProduit(produit4);

        Magasin carrefour = new Magasin(1, "Carrefour", "Centre-ville");
        Magasin monoprix = new Magasin(2, "Monoprix", "Menzah6");


        ProduitFruit prod1 = new ProduitFruit(12.3f, "mars", 1254, "Fraise", "", 0);
        ProduitFruit prod2 = new ProduitFruit(50f, "juin", 1224, "Pastèque", "", 0);
        ProduitFruit prod3 = new ProduitFruit(25.6f, "décembre", 7896, "Mandarine", "", 0);
        ProduitLegume prod4 = new ProduitLegume(14f, "janvier", 8521, "Artichauts", "", 0);

        carrefour.ajouterProduit(prod1);
        carrefour.ajouterProduit(prod2);
        carrefour.ajouterProduit(prod3);
        carrefour.ajouterProduit(prod4);
        
        System.out.println("LE PRODUIT EST FRAIS : "+prod4.estFrais("février"));
        

        System.out.println("LE TOTAL DES FRUITS :" + carrefour.calculStock());

    }

}
