/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;

/**
 *
 * @author ASUS
 */
public class MAP {
    public static void main(String[] args) {
        // TODO code application logic here
         Employe e1 = new Employe(16568564,"Fsqsdfqfc","achref","ochi");
        Employe e2 = new Employe(624524644,"Asdsfvdvd","mohamed","ochi");
        Employe e3 = new Employe(82445445,"bdhqddsd","amine","ochi");
        
        Departement d1 = new Departement(1,"INFINI");
        Departement d2 = new Departement(2,"DS");
        Departement d3 = new Departement(3,"NIDS");
        
        SocieteHashMap s = new SocieteHashMap();
        
        s.ajouterEmployeDepartement(e1, d1);
        s.ajouterEmployeDepartement(e2, d2);
        s.ajouterEmployeDepartement(e3, d3);
        System.out.println("************LES DEPARTEMENTS************");
                
                
        s.afficherLesDepartements();
        System.out.println("************LES EMPLOYES************");
        s.afficherLesEmployes();
        System.out.println("************LES EMPLOYESLEUS DEPARTEMENTS************");
        s.afficherLesEmployesLeursDepartements();
                
        
        
        SocieteTreeMap t = new SocieteTreeMap();
        t.ajouterEmployeDepartement(e3, d3);
        t.ajouterEmployeDepartement(e1, d1);
        t.ajouterEmployeDepartement(e2, d2);
        System.out.println("************LES EMPLOYES TREE MAP************");
        t.afficherLesEmployes();
    }
    
}


