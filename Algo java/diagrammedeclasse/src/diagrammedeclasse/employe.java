package diagrammedeclasse;

public class employe {

    private String nom;
    private String adresse;
    private String telephone;
    private String email;
    private float salairemensuel;
    private entreprise entreprise;

    public employe(String nom, String adresse, String telephone, String email, float salairemensuel, entreprise entreprise) {
        this.nom = nom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.email = email;
        this.salairemensuel = salairemensuel;
        this.entreprise = entreprise;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getSalairemensuel() {
        return salairemensuel;
    }

    public void setSalairemensuel(float salairemensuel) {
        this.salairemensuel = salairemensuel;
    }

    public entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(entreprise entreprise) {
        this.entreprise = entreprise;
    }

    public float salaireAnnuel() {
        return this.salairemensuel * 12;
    }
}
