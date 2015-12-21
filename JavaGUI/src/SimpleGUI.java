import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimpleGUI {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblIAm;
	private JTextField textField_1;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleGUI window = new SimpleGUI();
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
	public SimpleGUI() {
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
		
		JLabel lblNewLabel = new JLabel("My Name is: ");
		lblNewLabel.setBounds(101, 44, 89, 23);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(200, 45, 143, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblIAm = new JLabel("I Am: ");
		lblIAm.setBounds(101, 78, 46, 14);
		frame.getContentPane().add(lblIAm);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(200, 76, 143, 20);
		frame.getContentPane().add(textField_1);
		
		lblNewLabel_1 = new JLabel("I Am A Year Up Student !!!");
		lblNewLabel_1.setBounds(149, 124, 143, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Who Are You?");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				System.out.println(textField + textField_1 );
			}
		});
		btnNewButton.setBounds(155, 167, 123, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
