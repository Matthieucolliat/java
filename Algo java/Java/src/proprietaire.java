
public class proprietaire {
	private String nom;
	private String adresse;
	private String telephone;
	public proprietaire(String nom, String adresse, String telephone) {
		this.nom = nom;
		this.adresse = adresse;
		this.telephone = telephone;
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
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public void affichage() {
		System.out.println("nom : "+ nom);
		System.out.println("adresse : "+adresse);
		System.out.println("tel : "+telephone);
	}

}
