
public class livre {

	private String code;
	private String titre;
	private int dispo;
	private adherent adherent;
	
	public livre(String code, String titre, int dispo) {
		super();
		this.code = code;
		this.titre = titre;
		this.dispo = 1;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public int getDispo() {
		return dispo;
	}
	public void setDispo(int dispo) {
		this.dispo = dispo;
	}
	public void afficher() {
		System.out.println("Titre du livre : "+ titre);
		System.out.println("Code du livre : "+code);
		System.out.println("Disponibilité : "+dispo);
	}
	
}
