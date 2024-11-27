import java.util.ArrayList;

public class client {

	private String nom;
	private String prenom;
	private int genre;
	private String dateN;
	private String categ;
	private String adresse;
	private String telephone;
	private String email;
	private ArrayList<compte> lstCpt = new ArrayList<compte>();

	public client(String nom, String prenom, int genre, String dateN, String categ, String adresse, String telephone,
			String email, ArrayList<compte> lstCpt) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.genre = genre;
		this.dateN = dateN;
		this.categ = categ;
		this.adresse = adresse;
		this.telephone = telephone;
		this.email = email;
		this.lstCpt = lstCpt;
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

	public int getGenre() {
		return genre;
	}

	public void setGenre(int genre) {
		this.genre = genre;
	}

	public String getDateN() {
		return dateN;
	}

	public void setDateN(String dateN) {
		this.dateN = dateN;
	}

	public String getCateg() {
		return categ;
	}

	public void setCateg(String categ) {
		this.categ = categ;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	 public ArrayList<compte> getLstCpt() {
		return lstCpt;
	}

	public void setLstCpt(ArrayList<compte> lstCpt) {
		this.lstCpt = lstCpt;
	}

	public void INFO_COMPTE() {
		 int i;
		 String var;
		 if (genre==1) {
			 var = "M.";
		 }
		 else {
			 var = "Mme.";
		 }
		 
		 System.out.println("Liste des comptes de "+ var+" "+nom+" "+prenom);
		 
		 for (i=0;i<lstCpt.size();i++) {
			 lstCpt.get(i).Decrire();
		 }
		 
	 }
}
