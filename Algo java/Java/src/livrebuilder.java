import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class livrebuilder {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					livrebuilder window = new livrebuilder();
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
	public livrebuilder() {
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
		
		textField = new JTextField();
		textField.setBounds(65, 32, 139, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(65, 72, 139, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(65, 114, 96, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Titre");
		lblNewLabel.setBounds(10, 35, 45, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Auteur");
		lblNewLabel_1.setBounds(10, 75, 45, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Prix");
		lblNewLabel_2.setBounds(10, 117, 45, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Liste");
		lblNewLabel_3.setBounds(10, 160, 45, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		List list = new List();
		list.setBounds(65, 160, 361, 56);
		frame.getContentPane().add(list);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String titre=textField.getText();
				String auteur=textField_1.getText();
				String prix=textField_2.getText();
				list.add("Titre: "+titre+", "+"Auteur: "+auteur+", "+"Prix: "+prix+".");
				textField.setText(" ");
				textField_1.setText(" ");
				textField_2.setText(" ");
				Livre l1;
				l1=new Livre(titre,auteur,prix);
				l1.affichage();
			}
		});
		btnNewButton.setBounds(286, 50, 122, 62);
		frame.getContentPane().add(btnNewButton);
		
	}
}
