package diagrammedeclasse;

import java.util.ArrayList;
import java.util.Scanner;

public class mainTD6 {

    public static void main(String[] args) {
        Scanner masaisie = new Scanner(System.in);
        employe employe1, employe2, employe3, employe4;
        entreprise entreprise1, entreprise2;

        entreprise1 = new entreprise("ABC", "99 impasse de java 75020 Paris");
        entreprise2 = new entreprise("DEF", "56 bd de Marseille 75016 Paris");

        employe1 = new employe("Pierre", "5 bd Descartes 77454 Champs-sur-Marne", "0148484040", "pierre@gmail.com", 3000, entreprise1);
        employe2 = new employe("Marie", "4 rue de Meaux 75001 Paris", "040404040", "marie@hotmail.com", 2000, entreprise1);
        employe3 = new employe("Julie", "53 rue Blaise Pascal 77600 Bussy-Saint-Georges", "0148494040", "julie@gmail.com", 4000, entreprise2);
        employe4 = new employe("Michel", "96 avenue des Champs-Élysées 75016 Paris", "040406440", "michel@hotmail.com", 5000, entreprise2);
        
        System.out.println(employe1.getNom());
        System.out.println(employe1.salaireAnnuel());
        System.out.println(employe2.getNom());
        System.out.println(employe2.salaireAnnuel());
        System.out.println("----------------------");

        entreprise1.ajouterEmploye(employe1);
        entreprise1.ajouterEmploye(employe2);
        entreprise2.ajouterEmploye(employe3);
        entreprise2.ajouterEmploye(employe4);

        entreprise1.Afficher();
        entreprise2.Afficher();
        
        entreprise1.afficherSalaires();
        System.out.println("----------------------");
        
        float masseSalarialeEntreprise1 = entreprise1.calculerMasseSalariale();
        float masseSalarialeEntreprise2 = entreprise2.calculerMasseSalariale();
        float masseSalarialeTotale = masseSalarialeEntreprise1 + masseSalarialeEntreprise2;
        System.out.println("Masse salariale de l'entreprise " +entreprise1.getNom()+": " + masseSalarialeEntreprise1 + " euros.");
        System.out.println("Masse salariale de l'entreprise " +entreprise2.getNom()+": "+ masseSalarialeEntreprise2 + " euros.");
        System.out.println("Masse salariale totale de toutes les entreprises : " + masseSalarialeTotale + " euros.");
        System.out.println("--------------------");
        System.out.println(employe1.getNom() + " travaille dans l'entreprise : " + employe1.getEntreprise().getNom());

    }
}
