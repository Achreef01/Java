/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant;

import java.util.ArrayList;
import java.util.List;
import etudiant.Etudiant;

/**
 *
 * @author ASUS
 */
public class Etud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Etudiant> list = new ArrayList<>();        

        
        list.add( new Etudiant(1,24,"Achref"));
        list.add(new Etudiant(2,22,"Mohamed"));
        list.add(new Etudiant(3,26,"Amine"));
        
        ListEtudiant l = new ListEtudiant();
        
        l.afficherEtudiants(list, t -> System.out.println(t));
        
        l.afficherEtudiantSelonFiltre(list, x -> x.getAge() >= 15 && x.getAge() <= 25, t -> System.out.println(t));
        
       System.out.println(l.afficherNomEtudiant(list, f -> f.getNom()));
    }
    
}
