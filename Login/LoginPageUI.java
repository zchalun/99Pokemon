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

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.model.ScanRequest;
import com.amazonaws.services.dynamodbv2.model.ScanResult;
import java.awt.Color;
import javax.swing.DropMode;
import javax.swing.ImageIcon;

public class LoginPageUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username_input;
	private JTextField password_input;
	private JTextField loginStatus;
	
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
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 515, 330);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblReservation = new JLabel("");
		lblReservation.setForeground(Color.WHITE);
		lblReservation.setBounds(17, 10, 122, 30);
		contentPane.add(lblReservation);
		java.awt.Image user = new ImageIcon("username.png").getImage();
		lblReservation.setIcon(new ImageIcon(user));
		
		username_input = new JTextField();
		username_input.setBounds(17, 44, 465, 30);
		contentPane.add(username_input);
		username_input.setColumns(10);
		username_input.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		
		password_input = new JTextField();
		password_input.setBounds(17, 112, 465, 30);
		contentPane.add(password_input);
		password_input.setColumns(10);
		password_input.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		
		JButton buttonLogin = new JButton("");
		buttonLogin.setBounds(176, 155, 149, 48);
		java.awt.Image login = new ImageIcon("Login1.png").getImage();
		buttonLogin.setIcon(new ImageIcon(login));
		buttonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //checking 99PokemonAccounts database for credentials
				ProfileCredentialsProvider credentialsProvider = new ProfileCredentialsProvider();
		        try {
		            credentialsProvider.getCredentials();
		        } catch (Exception e1) {
		            throw new AmazonClientException(
		                    "Cannot load the credentials from the credential profiles file. " +
		                    "Please make sure that your credentials file is at the correct " +
		                    "location (/Users/johnmortensen/.aws/credentials), and is in valid format.",
		                    e1);
		        }
		        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
		        	.withCredentials(credentialsProvider)
		            .withRegion("us-west-2")
		            .build();

				DynamoDB dynamoDB = new DynamoDB(client);
			    Table table = dynamoDB.getTable("99PokemonAccounts");
			    ScanRequest scanRequest = new ScanRequest()
			    	    .withTableName("99PokemonAccounts");


			    ScanResult result = client.scan(scanRequest);
			    Item item = null;

			    for(int x = 1; x <= result.getCount(); x++)
			    {
			    	item = table.getItem("username", username_input.getText(), "password", password_input.getText());
			    }
			    if (item == null) //if credentials not found, no login
			    {
			    	loginStatus.setText("incorrect username or password");
			    }
			    else //if credentials found, login
			    {
			    	loginStatus.setText("login successful");
			    	LoggedInUI.main(null);
			    }
			}

		});
		contentPane.add(buttonLogin);
	
		
		JLabel lblEnter = new JLabel("");
		lblEnter.setForeground(Color.WHITE);
		lblEnter.setBounds(17, 84, 122, 30);
		contentPane.add(lblEnter);
		java.awt.Image pass = new ImageIcon("Password.png").getImage();
		lblEnter.setIcon(new ImageIcon(pass));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(230, 252, 198, 36);
		java.awt.Image create = new ImageIcon("Create.png").getImage();
		btnNewButton.setIcon(new ImageIcon(create));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateAccountUI.main(null);
			}
		});
		contentPane.add(btnNewButton);
		
		JLabel lblNewAccount = new JLabel("New to 99Pokemon?:");
		lblNewAccount.setForeground(Color.WHITE);
		lblNewAccount.setBounds(62, 255, 160, 30);
		contentPane.add(lblNewAccount);
		java.awt.Image New = new ImageIcon("New.png").getImage();
		lblNewAccount.setIcon(new ImageIcon(New));
		
		loginStatus = new JTextField();
		loginStatus.setEditable(false);
		loginStatus.setBackground(Color.BLACK);
		loginStatus.setForeground(Color.WHITE);
		loginStatus.setBounds(17, 212, 465, 30);
		loginStatus.setColumns(10);
		loginStatus.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		contentPane.add(loginStatus);
			
	}
}