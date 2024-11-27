import java.util.Scanner;

public class Algo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner masaisie = new Scanner(System.in);
		/*System.out.print("Entrez un nombre pour calculer la factorielle : ");
		int n = masaisie.nextInt();
		int result= factoriel(n);
		System.out.println("La factorielle de " + n + " est : " + result);

	}

	//Exercice 1 

	static int factoriel(int n) {
		int total=1;
		for (int i=n; i!=1; i--) {
			total = total*i;
		}
		return total; 
		}


		//Exercice 2
		System.out.println("Veuillez entrer la table souhaitée : ");
		int n=masaisie.nextInt();
		System.out.println("A quel nombre souhaitez-vous arrêter ? ");
		int nb=masaisie.nextInt();
		System.out.println("Table des "+n);
		table(n,nb);
	}

	static void table(int n, int nb) {
		for (int i=1; i!=nb+1; i++) {
			int total = i*n;
			System.out.println(n+" * "+i+ " = "+ total);
		}*/

		//Exercice 3
		String relance="";
		while (relance == "O") {
			System.out.println("Que souhaitez-vous faire (1: factorielle; 2: multiplication)");
			int calcul=masaisie.nextInt();
			if (calcul == 1) {
				System.out.print("Entrez un nombre pour calculer la factorielle : ");
				int n = masaisie.nextInt();
				int result= factoriel(n);
				System.out.println("La factorielle de " + n + " est : " + result);
			} else if (calcul==2){
				System.out.println("Veuillez entrer la table souhaitée : ");
				int t=masaisie.nextInt();
				System.out.println("A quel nombre souhaitez-vous arrêter ? ");
				int nb=masaisie.nextInt();
				System.out.println("Table des "+t);
				table(t,nb);
			}
		}System.out.println("Souhaitez-vous relancer le programme ? O/N");
		relance=masaisie.next();
	}


	private static void table(int t, int nb) {
		// TODO Auto-generated method stub
		 {
			for (int a=1; a!=nb+1; a++) {
				int total1 = a*t;
				System.out.println(t+" * "+a+ " = "+ total1);
			}
		}
	}

	private static int factoriel(int n) {
		// TODO Auto-generated method stub
	 {
			int total=1;
			for (int i=n; i!=1; i--) {
				total = total*i;
			}
			return total; 
		}
	}

}






