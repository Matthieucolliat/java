public class comptecourant extends compte {
	private int numeroCB;
    private float decouvertMax;

    public comptecourant(String numero, client titulaire, float solde, String devise, float decouvertMax) {
        super(numero, solde, devise, titulaire);
        this.decouvertMax = decouvertMax;
    }

    public void Debiter(float montant) {
        if (solde - montant >= -decouvertMax) {
            solde -= montant;
        } else {
            System.out.println("Débit refusé, dépassement du découvert autorisé.");
        }
    }

    public void Decrire() {
        System.out.println("Compte Courant n° : " + numero + " - solde : " + solde + " " + devise); 
    }
}
