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
		buttonLogin.setBounds(97, 107, 248, 29);
		contentPane.add(buttonLogin);
	
		
		JLabel lblEnter = new JLabel("Enter password");
		lblEnter.setBounds(6, 47, 184, 26);
		contentPane.add(lblEnter);
		
		JButton btnNewButton = new JButton("Create an Account");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateAccountUI.main(null);
			}
		});
		btnNewButton.setBounds(221, 182, 167, 17);
		contentPane.add(btnNewButton);
		
		JLabel lblNewAccount = new JLabel("New to 99Pokemon?:");
		lblNewAccount.setBounds(80, 184, 148, 13);
		contentPane.add(lblNewAccount);
		
		loginStatus = new JTextField();
		loginStatus.setEditable(false);
		loginStatus.setColumns(10);
		loginStatus.setBounds(6, 146, 438, 20);
		contentPane.add(loginStatus);
			
	}
}