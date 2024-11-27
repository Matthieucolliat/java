public class Adherent {
    private String num;
    private String nom;
    private String prenom;
    private String email;

    public Adherent(String num, String nom, String prenom, String email) {
        this.num = num;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
    
}
