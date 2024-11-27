import java.util.Scanner;

public class TD2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner masaisie = new Scanner(System.in);
		String nom;
		System.out.println("Votre nom ? ");
		nom=masaisie.nextLine();
		
		procedure1(nom);
	}
	
	static void procedure1(String var) {
		System.out.println("Bonjour");
		System.out.println("Coucou "+ var);
		System.out.println("*****");
	}

	}


