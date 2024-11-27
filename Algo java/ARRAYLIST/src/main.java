import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livre livre1,livre2, livre3, livre4;
		int prix;
		String Titre, Auteur;
		livre1 = new Livre("1111111","titre 1", "auteur 1", 1);
		livre2 = new Livre("2222222","titre 2", "auteur 2", 2);
		livre3 = new Livre("3333333","titre 3","auteur 3",3);
		livre4 = new Livre("4444444","titre 4","auteur 4",4);
		ArrayList<Livre>al;
		al=new ArrayList<Livre>();
		al.add(livre1);
		al.add(livre2);
		al.add(livre3);
		al.add(livre4);
		for (int i=0; i<al.size();i++) {
			al.get(i).Afficher();
			System.out.println(" ");
		}
	}

}
