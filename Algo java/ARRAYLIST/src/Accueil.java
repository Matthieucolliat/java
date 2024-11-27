import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Accueil {

	private JFrame frame;
	private ArrayList<Livre>al= new ArrayList<Livre>();
	private JTextField textField_ISBN;
	private JTextField textField_titre;
	private JTextField textField_prix;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Accueil window = new Accueil();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Accueil() {
		Livre livre1,livre2, livre3, livre4;
		int prix;
		String Titre, Auteur;
		livre1 = new Livre("1111111","titre 1", "auteur 1", 1);
		livre2 = new Livre("2222222","titre 2", "auteur 2", 2);
		livre3 = new Livre("3333333","titre 3","auteur 3",3);
		livre4 = new Livre("4444444","titre 4","auteur 4",4);
		al.add(livre1);
		al.add(livre2);
		al.add(livre3);
		al.add(livre4);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField_ISBN = new JTextField();
		textField_ISBN.setBounds(119, 29, 161, 19);
		frame.getContentPane().add(textField_ISBN);
		textField_ISBN.setColumns(10);
		
		textField_titre = new JTextField();
		textField_titre.setBounds(119, 75, 161, 19);
		frame.getContentPane().add(textField_titre);
		textField_titre.setColumns(10);
		
		textField_prix = new JTextField();
		textField_prix.setBounds(119, 131, 161, 19);
		frame.getContentPane().add(textField_prix);
		textField_prix.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ISBN DU LIVRE");
		lblNewLabel.setBounds(10, 32, 99, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TITRE DU LIVRE");
		lblNewLabel_1.setBounds(10, 78, 99, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PRIX DU LIVRE");
		lblNewLabel_2.setBounds(10, 134, 99, 13);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Nombre de livre:");
		lblNewLabel_3.setBounds(39, 220, 108, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel(String.valueOf(al.size()));
		lblNewLabel_4.setBounds(141, 220, 45, 13);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton_1 = new JButton("Ajouter");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int prix=Integer.parseInt(textField_prix.getText());
				Livre nouveaulivre= new Livre(textField_ISBN.getText(), textField_titre.getText(), null , prix);
				al.add(nouveaulivre);	
			}
		});
		btnNewButton_1.setBounds(119, 177, 130, 33);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Rechercher");
		btnNewButton.setBounds(290, 29, 136, 20);
		frame.getContentPane().add(btnNewButton);
		if (textField_ISBN.equals(textField_ISBN)) {
			System.out.println("titre: ");
		} else {

		}
		
	}
}
