package diagrammedeclasse;

import java.util.ArrayList;

public class entreprise {

    private String nom;
    private String adresse;
    private ArrayList<employe> employes;

    public entreprise(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
        this.employes = new ArrayList<>();  
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

    public void ajouterEmploye(employe employe) {
        this.employes.add(employe);
    }

    public void afficherSalaires() {
        System.out.println("Salaires des employés de l'entreprise " + this.nom + " :");
        for (employe salaire : employes) {
            System.out.println(salaire.getNom() + " : " + salaire.getSalairemensuel() + " euros par mois.");
        }
    }
    
    public void Afficher() {
        System.out.println("Nom de l'entreprise : " + this.nom);
        System.out.println("Adresse de l'entreprise : " + this.adresse);
        System.out.println("Liste des employés : ");
        for (employe employe : employes) {
            System.out.println("- " + employe.getNom() + ", Salaire Annuel : " + employe.salaireAnnuel() + " euros.");
        }
        System.out.println("---------------");
        }
    
    public float calculerMasseSalariale() {
        float masseSalariale = 0;
        for (employe masse : employes) {
            masseSalariale += masse.salaireAnnuel();
        }
        return masseSalariale;
}
}
