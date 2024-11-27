import java.util.Scanner;

public class mainlivre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner masaisie = new Scanner(System.in);
		livre livre1;
		livre livre2;
		String titre1,code1;
		String titre2,code2;
		adherent adherent1;
		String nom1,prenom1;
		int age1;
		
		System.out.println("Veuillez saisir le titre du livre 1: ");
		titre1=masaisie.nextLine();
		System.out.println("Veuillez saisir le code du livre 1: ");
		code1=masaisie.nextLine();
		livre1=new livre(titre1, code1, 1);
		
		System.out.println("Veuillez saisir le titre du livre 2: ");
		titre2=masaisie.nextLine();
		System.out.println("Veuillez saisir le code du livre 2: ");
		code2=masaisie.nextLine();
		livre2=new livre(titre2,code2,1);
		
		livre1.setDispo(0);
		
		System.out.println("Veuillez saisir votre nom: ");
		nom1=masaisie.nextLine();
		System.out.println("Veuillez saisir votre prénom: ");
		prenom1=masaisie.nextLine();
		System.out.println("Veuillez saisir votre age: ");
		age1=masaisie.nextInt();
		adherent1=new adherent(nom1,prenom1,age1);
		
		livre1.afficher();
		adherent1.afficheradherent();
		System.out.println("--------------");
		livre2.afficher();
		
	}

}
