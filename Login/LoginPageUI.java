package Login;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginPageUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username_input;
	private JTextField password_input;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPageUI frame = new LoginPageUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginPageUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 461, 259);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblReservation = new JLabel("Enter username");
		lblReservation.setBounds(6, 0, 184, 26);
		contentPane.add(lblReservation);
		
		username_input = new JTextField();
		username_input.setBounds(6, 22, 438, 26);
		contentPane.add(username_input);
		username_input.setColumns(10);
		
		password_input = new JTextField();
		password_input.setBounds(6, 71, 438, 26);
		contentPane.add(password_input);
		password_input.setColumns(10);
		
		JButton buttonLogin = new JButton("Login");
		buttonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// database stuff to fill in
			}  

		});
		buttonLogin.setBounds(97, 107, 248, 29);
		contentPane.add(buttonLogin);
	
		
		JLabel lblEnter = new JLabel("Enter password");
		lblEnter.setBounds(6, 47, 184, 26);
		contentPane.add(lblEnter);
		
		JButton btnNewButton = new JButton("Create an Account");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// create account
			}
		});
		btnNewButton.setBounds(294, 201, 126, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewAccount = new JLabel("New to 99Pokemon? Press here to make an account:");
		lblNewAccount.setBounds(49, 205, 248, 13);
		contentPane.add(lblNewAccount);
			
	}
}