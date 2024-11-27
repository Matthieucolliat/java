import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner masaisie = new Scanner(System.in);
		
		client client1;
		compte c1,c3;
		epargne c2;
		ArrayList<compte>listc;
		listc=new ArrayList<compte>();
		
		client1= new client("Gravouil", "Gravouil", 1, "02/05/1977", "Enseignant", "lycée Paul Lapie 5bd AB,92400 COURBEVOIE", "01.01.01.01.01", "prof.gravouil@gmail.com", null);
		
		c1= new comptecourant("13245411324", client1, 2548200, "€", 1000);
		c2= new epargne("32544771289", 1000, "€", client1,(float) 0.05);
		c3= new comptecourant("22544771289", client1, -214 , "€", 0);

		listc.add(c1);
		listc.add(c2);
		listc.add(c3);

		c2.Ajouter_Interet();
		client1.setLstCpt(listc);
		client1.INFO_COMPTE();
	}

}
