
public class Client {

	private String cin;
	private String nom;
	private String prenom;
	private String telephone;
	
	public Client(String cin, String nom, String prenom, String telephone) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
	}

	public String getCni() {
		return cin;
	}

	public void setCni(String cin) {
		this.cin = cin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public void afficher() {
		System.out.println("Le CIN est "+cin);
		System.out.println("Le nom est "+nom);
		System.out.println("Le prénom est "+prenom);
		System.out.println("Le numéro de téléphone est "+telephone);
	}
}
