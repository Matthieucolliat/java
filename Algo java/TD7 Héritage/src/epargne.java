public class epargne extends compte {

	private float interet;

	public epargne(String numero, float solde, String devise, client titulaire, float interet) {
		super(numero, solde, devise, titulaire);
		this.interet = interet;
	}

	public float getInteret() {
		return interet;
	}

	public void setInteret(float interet) {
		this.interet = interet;
	}
	
	public void Decrire() {
		System.out.println("Compte Épargne");
		super.Decrire();
		System.out.println("taux intérêt ="+ (interet*100)+ "%");
	}
	
	public void Ajouter_Interet() {
		if (super.solde>0) {
			super.solde=(super.solde*interet)+super.solde;
		}
	}
}
