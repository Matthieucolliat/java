
public abstract class compte {
	protected String numero;
	protected float solde;
	protected String devise;
	private client titulaire;
	
	public compte(String numero, float solde, String devise, client titulaire) {
		super();
		this.numero = numero;
		this.solde = solde;
		this.devise = devise;
		this.titulaire = titulaire;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	public String getDevise() {
		return devise;
	}

	public void setDevise(String devise) {
		this.devise = devise;
	}

	public client getTitulaire() {
		return titulaire;
	}

	public void setTitulaire(client titulaire) {
		this.titulaire = titulaire;
	}
	
	public void Debiter(float var) {
		solde=solde-var;
	}
	
	public void Crediter(float var) {
		solde=solde+var;
	}
	
	public void Decrire() {
		System.out.println("n° :"+numero+ "- solde :"+solde+" "+devise);
	}
	
}
