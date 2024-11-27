
public class voiture {
	private String couleur;
	private int annee;
	private String etat;
	private String immatriculation;
	private String marque;
	private int km;
	private String model;
	private proprietaire proprietaire;

	public voiture(String couleur, int annee, String etat, String immatriculation, String marque, int km,
			String model, proprietaire proprietaire) {
		this.couleur = couleur;
		this.annee = annee;
		this.etat = etat;
		this.immatriculation = immatriculation;
		this.marque = marque;
		this.km = km;
		this.model = model;
		this.proprietaire = proprietaire;
	}
	public voiture() {
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public String getImmatriculation() {
		return immatriculation;
	}
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void addkm(int distance) {
		km= km + distance;
	}
	public proprietaire getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(proprietaire proprietaire) {
		this.proprietaire = proprietaire;
	}
	public void affichage() {
		System.out.println("------------");
		System.out.println("marque : "+marque);
		System.out.println("modèle : "+model);
		System.out.println("km : "+km);
		System.out.println("état : "+etat);
		System.out.println("immatriculation : "+immatriculation);
		System.out.println("couleur : "+couleur);
		if (proprietaire==null) {
			System.out.println("La voiture n'est pas vendue");
		}
		else {
			proprietaire.affichage();
		}
		System.out.println("------------");
	}

}



