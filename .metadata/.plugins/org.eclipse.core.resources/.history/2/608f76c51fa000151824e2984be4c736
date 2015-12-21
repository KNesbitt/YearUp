import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class SimpleGUI {

	private JFrame frame;
	private JTextField textField;
	private JLabel YearUpStudent;
	private JTextField textField_2;
	private JLabel Student;
	private JButton btnWhoAreYou;
	private JLabel WhoAreYouR;

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
		frame.setBounds(100, 100, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Name = new JLabel("My name is :");
		Name.setBounds(91, 56, 99, 14);
		frame.getContentPane().add(Name);
		
		textField = new JTextField();
		textField.setBounds(259, 53, 178, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		YearUpStudent = new JLabel("I am :");
		YearUpStudent.setBounds(91, 116, 57, 14);
		frame.getContentPane().add(YearUpStudent);
		
		textField_2 = new JTextField();
		textField_2.setBounds(259, 113, 178, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		Student = new JLabel("I am a student of Year Up");
		Student.setBounds(176, 161, 150, 14);
		frame.getContentPane().add(Student);
		
		btnWhoAreYou = new JButton("Who are you?");
		btnWhoAreYou.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) { 
			}
			});
		btnWhoAreYou.setBounds(183, 204, 118, 23);
		btnWhoAreYou.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("Kinsler Nesbitt");
				textField_2.setText("19");}
		});
		frame.getContentPane().add(btnWhoAreYou);
		
		WhoAreYouR = new JLabel("");
		WhoAreYouR.setBounds(238, 41, 0, 0);
		frame.getContentPane().add(WhoAreYouR);
		
		JLabel lblSimpleJavaGui = new JLabel("Simple Java GUI");
		lblSimpleJavaGui.setBounds(192, 11, 99, 14);
		frame.getContentPane().add(lblSimpleJavaGui);
	}
}
