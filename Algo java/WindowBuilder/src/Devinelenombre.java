import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Devinelenombre {

	private JFrame frame;
	private JTextField textField;
	private int tentative=0;
	private int essai=0;
	private int nb;
	private JLabel result;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Devinelenombre window = new Devinelenombre();
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
	public Devinelenombre() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		int nb=(int) (Math.random()*(100-0)+0);
		System.out.println(nb);
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(135, 63, 96, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);


		JButton btnNewButton_1 = new JButton("Recommencer ?");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_1.setVisible(false);
				int nb=(int) (Math.random()*(100-0)+0);
				
			}
		});
		btnNewButton_1.setBounds(266, 198, 119, 21);
		frame.getContentPane().add(btnNewButton_1);

		JLabel compteur = new JLabel("0");
		compteur.setBounds(381, 117, 45, 19);
		frame.getContentPane().add(compteur);

		result = new JLabel("");
		result.setBounds(21, 198, 221, 17);
		frame.getContentPane().add(result);

		lblNewLabel = new JLabel("nombre tentative :");
		lblNewLabel.setBounds(270, 120, 115, 13);
		frame.getContentPane().add(lblNewLabel);

		lblNewLabel_1 = new JLabel("Devine le nombre :");
		lblNewLabel_1.setBounds(10, 66, 115, 13);
		frame.getContentPane().add(lblNewLabel_1);

		JButton btnNewButton = new JButton("?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				essai = Integer.parseInt(textField.getText());
				System.out.println(nb);
				tentative = Integer.parseInt(compteur.getText());
				tentative=tentative+1;
				compteur.setText(String.valueOf(tentative));
				if (essai>nb) {
					result.setText("Raté : le nombre à deviner est + petit !");

				}
				else if (essai<nb) {
					result.setText("Raté : le nombre à deviner est + grand !");

				}
				else {
					result.setText("Gagné !");
					btnNewButton_1.setVisible(true);
				}
			}

		});
		btnNewButton.setBounds(157, 106, 55, 64);
		frame.getContentPane().add(btnNewButton);
	}
}
