
import java.util.Scanner;

public class mainlivre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner masaisie = new Scanner(System.in);
		
		Livre livre1;
		Livre livre2;
		
		System.out.println("Livre 1:");
		System.out.println("Donner le titre: ");
		String titre=masaisie.nextLine();
		
		System.out.println("Donner l'auteur: ");
		String auteur=masaisie.nextLine();
		
		System.out.println("Donner le prix: ");
		String prix =masaisie.nextLine();
		
		livre1= new Livre(titre,auteur,prix);
		livre1.affichage();
		System.out.println("Titre: "+titre+", Auteur: "+auteur+", Prix: "+prix);
		
	}

}
