public class Livre {

	private String titre;
	private String auteur;
	private String prix;
	
	public Livre(String titre, String auteur, String prix) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getPrix() {
		return prix;
	}

	public void setPrix(String prix) {
		this.prix = prix;
	}
	
	public void affichage() {
		System.out.println("Le titre est "+titre);
		System.out.println("L'auteur est "+auteur);
		System.out.println("Le prix est "+prix);
	}
	
}
