package Login;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

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

import Reservations.AddReservationsGUI;
import Reservations.ManageReservations;

import java.awt.Color;
import javax.swing.DropMode;
import javax.swing.ImageIcon;

public class LoginPageUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name_display;
	private JTextField type_display;
	private JTextField price_display;
	private JTextField desc_display;
	private JTextField result; 
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddReservationsGUI frame = new AddReservationsGUI();
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
		setBounds(100, 100, 466, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblReservation = new JLabel("Name:");
		lblReservation.setBounds(6, 0, 184, 26);
		contentPane.add(lblReservation);
		
		name_display = new JTextField();
		name_display.setEditable(false);
		name_display.setBounds(6, 22, 438, 26);
		contentPane.add(name_display);
		name_display.setColumns(10);
		
		type_display = new JTextField();
		type_display.setEditable(false);
		type_display.setBounds(6, 71, 438, 26);
		contentPane.add(type_display);
		type_display.setColumns(10);
		
		price_display = new JTextField();
		price_display.setEditable(false);
		price_display.setBounds(6, 119, 438, 26);
		contentPane.add(price_display);
		price_display.setColumns(10);
		
		desc_display = new JTextField();
		desc_display.setEditable(false);
		desc_display.setBounds(6, 166, 438, 26);
		contentPane.add(desc_display);
		desc_display.setColumns(10);
		
		JButton buttonEnter = new JButton("Add to Order");
		buttonEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// add to order
				
			}  

		});
		buttonEnter.setBounds(142, 194, 145, 29);
		contentPane.add(buttonEnter);
		
		result = new JTextField();
		result.setEditable(false);
		result.setBounds(6, 226, 438, 47);
		contentPane.add(result);
		result.setColumns(10);
		
		JLabel lblEnter = new JLabel("Type");
		lblEnter.setBounds(6, 47, 184, 26);
		contentPane.add(lblEnter);
		
		JLabel lblEnterTotalNumber = new JLabel("Price:");
		lblEnterTotalNumber.setBounds(6, 95, 342, 26);
		contentPane.add(lblEnterTotalNumber);
		
		JLabel lblEnterTimeFor = new JLabel("Description");
		lblEnterTimeFor.setBounds(6, 145, 414, 26);
		contentPane.add(lblEnterTimeFor);
			
	}
}
