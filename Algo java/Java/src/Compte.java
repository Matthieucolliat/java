
public class Compte {

	private float solde;
	private int code;
	private Client client;
	
	public Compte(float solde, int code, Client client) {
		super();
		this.solde = solde;
		this.code = code;
		this.client = client;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public void crediter(float credit) {
		solde=(solde + credit);
	}
	
	public void debiter(float credit) {
		solde=(solde - credit);
	}
	
	public void crediter(Compte c, float montant) {
		crediter(montant);
		c.debiter(montant);
		
	}
	
	public void debiter(Compte c, float montant) {
		debiter(montant);
		c.crediter(montant);	
	}
	
	public void afficher() {
		System.out.println("*******************");
		System.out.println("Numéro de compte: 1");
		System.out.println("Solde du compte: "+solde);
		System.out.println("Propriétaire du compte : ");
		client.afficher();
	}
}
