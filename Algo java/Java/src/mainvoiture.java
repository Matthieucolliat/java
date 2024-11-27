
public class mainvoiture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		voiture v1;
		voiture v2;
		proprietaire proprio;

		proprio= new proprietaire("Jacques Martin","","0102030405");
		v1= new voiture("rouge",2010,"occasion","CBO58275","Renault",90000,"Mégane", proprio);
		v2= new voiture("noire",2016,"neuve","","Peugeot",0,"306", null);

		//Exercice 1
		v2.setModel("307");
		System.out.println("État du véhicule : "+ v1.getEtat());
		v1.setCouleur("Gris métallisé");
		System.out.println("Couleur du véhicule : "+ v1.getCouleur());

		//Exercice 2
		v1.addkm(250);
		System.out.println(v1.getKm());
		v1.affichage();
		v2.affichage();

		//Exercice 3
		v1.setProprietaire(proprio);
		System.out.println("Le propriétaire de la voiture est "+ proprio.getNom());

	}

}
