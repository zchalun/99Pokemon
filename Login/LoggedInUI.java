package Login;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model_pokemon.PokeDex;
import model_products.Food;
import model_products.Menu;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.ItemCollection;
import com.amazonaws.services.dynamodbv2.document.QueryOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.spec.QuerySpec;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ScanRequest;
import com.amazonaws.services.dynamodbv2.model.ScanResult;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.util.*;
import model_pokemon.*;

public class LoggedInUI extends JFrame {

	/** 
	 *  
	 */
	private static final long serialVersionUID = 1L;
	//private final Action action = new SwingAction();
	ArrayList<Pokemon> checkedPokemon = new ArrayList<Pokemon>();
	boolean[] flavors = new boolean[5];
	Menu newMenu = new Menu();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoggedInUI frame = new LoggedInUI();
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
	public LoggedInUI() {
		
		getContentPane().setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 0, 1200, 750);
		getContentPane().setLayout(null);
		
		//HEADERS
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		panel.setBounds(0, 0, 1200, 94);
		panel.setBackground(new Color(36,104,177));
		
		JLabel logo = new JLabel("");
		java.awt.Image logoimage = new ImageIcon("pics/99-Pok.png").getImage();
		panel.setLayout(null);
		panel.add(logo);
		logo.setIcon(new ImageIcon(logoimage));
		logo.setBounds(0, 0, 240, 94);
		
		JButton Advertisement = new JButton("");
		java.awt.Image ad = new ImageIcon("pics/Ad.png").getImage();
		Advertisement.setBounds(240, 0, 720, 94);
		panel.add(Advertisement);
		Advertisement.setBackground(new java.awt.Color(36,104,177));
		Advertisement.setIcon(new ImageIcon(ad));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(65, 129, 1054, 541);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		// Reservation buttons:
		JButton btnReservationTest = new JButton("Create a Reservation");
		btnReservationTest.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 25));
		btnReservationTest.setBounds(23, 91, 486, 168);
		panel_1.add(btnReservationTest);
		
		JButton btnNewButton = new JButton();
		btnNewButton.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 25));
		btnNewButton.setBounds(544, 91, 486, 168);
		panel_1.add(btnNewButton);
		java.awt.Image check = new ImageIcon("pics/Check reservation.png").getImage();
		btnNewButton.setIcon(new ImageIcon(check));
		
		JButton btnNewButton_1 = new JButton();
		btnNewButton_1.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 25));
		btnNewButton_1.setBounds(23, 272, 486, 168);
		panel_1.add(btnNewButton_1);
		java.awt.Image change = new ImageIcon("pics/Change reservation.png").getImage();
		btnNewButton_1.setIcon(new ImageIcon(change));
		
		JButton btnNewButton_2 = new JButton("DELETE MY RESERVATION");
		btnNewButton_2.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 25));
		btnNewButton_2.setBounds(544, 272, 486, 168);
		panel_1.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Reservation Management Pane");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setBounds(23, 28, 1003, 45);
		panel_1.add(lblNewLabel);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reservations.DeleteReservationGUI.main(null);
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reservations.ChangeReservationTimeGUI.main(null);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reservations.SearchReservationGUI.main(null);
			}
		});
		btnReservationTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Reservations.AddReservationsGUI.main(null);
			}
		});
	}
}