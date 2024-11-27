import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstWindow {

	private JFrame frame;

	private JButton btnNewButton_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_total;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private int operation=1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstWindow window = new FirstWindow();
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
	public FirstWindow() {
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
		
		JButton btnNewButton = new JButton("=");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t1,t2;
				t1=textField.getText();
				t2=textField_1.getText();
				int total=0;
				if (operation==1) {
				total=Integer.parseInt(t1)+Integer.parseInt(t2);
			}
				if (operation==2) {
					total=Integer.parseInt(t1)-Integer.parseInt(t2);

				}
				if (operation==3) {
					total=Integer.parseInt(t1)/Integer.parseInt(t2);
				}
				if (operation==4) {
					total=Integer.parseInt(t1)*Integer.parseInt(t2);
				}
				textField_total.setText(String.valueOf(total));
			}}
		);
		
		btnNewButton.setBounds(262, 93, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(27, 94, 58, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_1.setBackground(Color.BLUE);
				btnNewButton_2.setBackground(Color.GRAY);
				btnNewButton_3.setBackground(Color.GRAY);
				btnNewButton_4.setBackground(Color.GRAY);
				operation=1;
			}
		});
		btnNewButton_1.setBounds(108, 93, 58, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(190, 94, 48, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_total = new JTextField();
		textField_total.setBounds(357, 94, 58, 19);
		frame.getContentPane().add(textField_total);
		textField_total.setColumns(10);
		
		btnNewButton_2 = new JButton("-");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_2.setBackground(Color.RED);
				btnNewButton_1.setBackground(Color.GRAY);
				btnNewButton_3.setBackground(Color.GRAY);
				btnNewButton_4.setBackground(Color.GRAY);
				operation =2;
			}
		});
		btnNewButton_2.setBounds(108, 127, 58, 21);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("*");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_3.setBackground(Color.CYAN);
				btnNewButton_2.setBackground(Color.GRAY);
				btnNewButton_1.setBackground(Color.GRAY);
				btnNewButton_4.setBackground(Color.GRAY);
				operation =4;
			}
		});
		btnNewButton_3.setBounds(108, 158, 58, 21);
		frame.getContentPane().add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("/");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_4.setBackground(Color.PINK);
				btnNewButton_2.setBackground(Color.GRAY);
				btnNewButton_3.setBackground(Color.GRAY);
				btnNewButton_1.setBackground(Color.GRAY);
				operation=3;
			}
		});
		btnNewButton_4.setBounds(108, 62, 58, 21);
		frame.getContentPane().add(btnNewButton_4);
		
		}
	}

