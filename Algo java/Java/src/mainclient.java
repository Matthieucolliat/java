import java.util.Scanner;

public class mainclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner masaisie = new Scanner(System.in);
		
		Client client2;
		Client client1;
		
		Compte compte1;
		Compte compte2;
		
		System.out.println("Compte 1: ");
		System.out.println("Donner le CIN: ");
		String cin=masaisie.next();
		System.out.println("Donner le nom: ");
		String nom=masaisie.next();
		System.out.println("Donner le prénom: ");
		String prenom=masaisie.next();
		System.out.println("Donner le numéro de téléphone: ");
		String tel=masaisie.next();
		client1=new Client(cin,nom,prenom,tel);
		
		System.out.println("Veuillez rentrer le solde: ");
		float solde=masaisie.nextFloat();
		int code=1;
		
		
		System.out.println("Détails du compte: ");
		client1=new Client(cin,nom,prenom,tel);
		compte1=new Compte(solde,code,client1);
		compte1.afficher();
	}

}
