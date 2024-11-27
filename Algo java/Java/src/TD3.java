import java.util.Scanner;

public class TD3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner masaisie = new Scanner(System.in);
		System.out.println("En combien de points doit se dérouler la partie ? (3-5-10)");
		int iteration=masaisie.nextInt();
		for (int i=0; i==iteration;i++) {
			
		}
		

	}
	static String shifoumi (int choixordi, int choixuser){
		int totalordi=0;
		int totaluser=0;
		int nb=3;
		choixordi = (int)(Math.random()*(nb))+1;
		if (choixordi== choixuser){
	        return "égalité";}

	    else if (choixordi==1){
	        if (choixuser==3){
	        	totalordi=totalordi+1;
	            return "L'ordinateur a gagné !";}
	        else if (choixuser==2){
	        	totaluser=totaluser+1;
	            return "Vous avez gagné !";}}

	    else if (choixordi==3){
	        if (choixuser==1){
	        	totaluser=totaluser+1;
	            return "Vous avez gagné";}
	        else if (choixuser==2){
	        	totalordi=totalordi+1;
	            return "L'ordinateur a gagné !";}}

	    else if (choixordi==2){
	        if (choixuser==1){
	        	totalordi=totalordi+1;
	            return "L'ordinateur a gagné !";}
	        else if (choixuser==3){
	        	totaluser=totaluser+1;
	            return "Vous avez gagné !";}
	        }
		return "Vous devez choisir entre 1, 2 et 3";}
}
