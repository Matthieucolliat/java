
public class adherent {

	private String nom;
	private String prenom;
	private int age;
	
	public adherent(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void afficheradherent() {
		System.out.println("Nom de l'adhérent : "+ nom);
		System.out.println("Prénom de l'adhérent : "+prenom);
		System.out.println("Age de l'adhérent : "+age);
	}
	
}
