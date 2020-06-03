package Login;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.SwingConstants;

public class CreateAccountUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username_input;
	private JPasswordField password_input;
	private JTextField result; 
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateAccountUI frame = new CreateAccountUI();
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
	public CreateAccountUI() {
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 465, 285);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblReservation = new JLabel("");
		lblReservation.setBounds(24, 23, 143, 24);
		contentPane.add(lblReservation);
		java.awt.Image New = new ImageIcon("pics/NewUser.png").getImage();
		lblReservation.setIcon(new ImageIcon(New));
		
		username_input = new JTextField();
		username_input.setBounds(24, 48, 403, 24);
		contentPane.add(username_input);
		username_input.setColumns(10);
		username_input.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		
		JLabel lblEnter = new JLabel("");
		lblEnter.setBounds(24, 84, 143, 29);
		contentPane.add(lblEnter);
		java.awt.Image newpass = new ImageIcon("pics/NewPass.png").getImage();
		lblEnter.setIcon(new ImageIcon(newpass));
		
		password_input = new JPasswordField();
		password_input.setBounds(24, 109, 403, 24);
		contentPane.add(password_input);
		password_input.setColumns(10);
		password_input.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		
		JButton buttonCreate = new JButton("");
		java.awt.Image create = new ImageIcon("pics/Create1.png").getImage();
		buttonCreate.setIcon(new ImageIcon(create));
		buttonCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Databases.DatabaseActions.createAccount(username_input.getText(), password_input.getText());
					result.setText("Account successfully created");
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}  

		});
		buttonCreate.setBounds(166, 151, 119, 38);
		contentPane.add(buttonCreate);
		
		result = new JTextField();
		result.setHorizontalAlignment(SwingConstants.CENTER);
		result.setForeground(Color.WHITE);
		result.setBackground(Color.BLACK);
		result.setEditable(false);
		result.setBounds(24, 205, 403, 24);
		contentPane.add(result);
		result.setColumns(10);
		result.setBorder(javax.swing.BorderFactory.createEmptyBorder());
			
	}
}