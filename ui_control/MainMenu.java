package ui_control;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model_pokemon.PokeDex;
import model_products.Menu;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import java.awt.Font;

public class MainMenu extends JFrame {

	/** 
	 *  
	 */
	private static final long serialVersionUID = 1L;
	//private final Action action = new SwingAction();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		getContentPane().setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200, 750);
		getContentPane().setLayout(null);
		
		//HEADERS
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		panel.setBounds(0, 0, 1200, 94);
		panel.setBackground(new Color(36,104,177));
		
		JLabel logo = new JLabel("");
		java.awt.Image logoimage = new ImageIcon("99-Pok.png").getImage();
		panel.setLayout(null);
		panel.add(logo);
		logo.setIcon(new ImageIcon(logoimage));
		logo.setBounds(0, 0, 240, 94);
		
		JButton Advertisement = new JButton("");
		java.awt.Image ad = new ImageIcon("Ad.png").getImage();
		Advertisement.setBounds(240, 0, 720, 94);
		panel.add(Advertisement);
		Advertisement.setBackground(new java.awt.Color(36,104,177));
		Advertisement.setIcon(new ImageIcon(ad));
		
		JButton LoginButton = new JButton("");
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.LoginPageUI.main(null);
			}
		});
		java.awt.Image login = new ImageIcon("Login.png").getImage();
		LoginButton.setBounds(960, 0, 240, 94);
		panel.add(LoginButton);
		LoginButton.setBackground(new java.awt.Color(36,104,177));
		LoginButton.setIcon(new ImageIcon(login));
		
		JPanel panel_sort = new JPanel();
		panel_sort.setBounds(26, 112, 194, 591);
		getContentPane().add(panel_sort);
		panel_sort.setLayout(null);
		
		JLabel lblType = new JLabel("Select Type:");
		lblType.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblType.setBounds(10, 55, 182, 59);
		panel_sort.add(lblType);
		
		JCheckBox chckbxBug = new JCheckBox("Bug\r\n");
		chckbxBug.setBounds(20, 120, 93, 21);
		panel_sort.add(chckbxBug);
		
		JCheckBox chckbxDragon = new JCheckBox("Dragon");
		chckbxDragon.setBounds(20, 142, 93, 21);
		panel_sort.add(chckbxDragon);
		
		JCheckBox chckbxElectric = new JCheckBox("Electric");
		chckbxElectric.setBounds(20, 165, 93, 21);
		panel_sort.add(chckbxElectric);
		
		JCheckBox chckbxFighting = new JCheckBox("Fighting");
		chckbxFighting.setBounds(20, 185, 93, 21);
		panel_sort.add(chckbxFighting);
		
		JCheckBox chckbxFire = new JCheckBox("Fire");
		chckbxFire.setBounds(20, 208, 93, 21);
		panel_sort.add(chckbxFire);
		
		JCheckBox chckbxFlying = new JCheckBox("Flying");
		chckbxFlying.setBounds(20, 231, 93, 21);
		panel_sort.add(chckbxFlying);
		
		JCheckBox chckbxGhost = new JCheckBox("Ghost");
		chckbxGhost.setBounds(20, 254, 93, 21);
		panel_sort.add(chckbxGhost);
		
		JCheckBox chckbxGrass = new JCheckBox("Grass");
		chckbxGrass.setBounds(20, 277, 93, 21);
		panel_sort.add(chckbxGrass);
		
		JCheckBox chckbxGround = new JCheckBox("Ground");
		chckbxGround.setBounds(20, 300, 93, 21);
		panel_sort.add(chckbxGround);
		
		JCheckBox chckbxIce = new JCheckBox("Ice");
		chckbxIce.setBounds(20, 323, 93, 21);
		panel_sort.add(chckbxIce);
		
		JCheckBox chckbxNormal = new JCheckBox("Normal");
		chckbxNormal.setBounds(20, 346, 93, 21);
		panel_sort.add(chckbxNormal);
		
		JCheckBox chckbxPoison = new JCheckBox("Poison");
		chckbxPoison.setBounds(20, 369, 93, 21);
		panel_sort.add(chckbxPoison);
		
		JCheckBox chckbxPsychic = new JCheckBox("Psychic");
		chckbxPsychic.setBounds(20, 392, 93, 21);
		panel_sort.add(chckbxPsychic);
		
		JCheckBox chckbxRock = new JCheckBox("Rock");
		chckbxRock.setBounds(20, 415, 93, 21);
		panel_sort.add(chckbxRock);
		
		JCheckBox chckbxSteel = new JCheckBox("Steel");
		chckbxSteel.setBounds(20, 438, 93, 21);
		panel_sort.add(chckbxSteel);
		
		JCheckBox chckbxWater = new JCheckBox("Water");
		chckbxWater.setBounds(20, 461, 93, 21);
		panel_sort.add(chckbxWater);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(230, 114, 931, 589);
		getContentPane().add(scrollPane);
		
		JPanel panel_menu = new JPanel();
		scrollPane.setViewportView(panel_menu);
		panel_menu.setLayout(null);
	
		
		// test code for adding buttons, currently adds first 4 berries
		int j=0;
		int i=10;
		Menu newMenu = new Menu();
		while (i<521 && j<4)
		{
			JButton btnNewButton = new JButton(newMenu.MenuSelections.get(j).getName());
			btnNewButton.setBounds(i, 10, 155, 149);
			panel_menu.add(btnNewButton);
			i+=170;
			j++;
		}
		
		
		
		// Reservation test buttons:
		/*JButton btnReservationTest = new JButton("add new reservation test");
		btnReservationTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Reservations.AddReservationsGUI.main(null);
			}
		});
		btnReservationTest.setBounds(25, 109, 195, 129);
		getContentPane().add(btnReservationTest);
		
		JButton btnNewButton = new JButton("search for reservation test");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reservations.SearchReservationGUI.main(null);
			}
		});
		btnNewButton.setBounds(230, 109, 208, 129);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Change time of res test");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reservations.ChangeReservationTimeGUI.main(null);
			}
		});
		btnNewButton_1.setBounds(448, 116, 195, 114);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("delete res test");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reservations.DeleteReservationGUI.main(null);
			}
		});
		btnNewButton_2.setBounds(655, 109, 208, 129);
		getContentPane().add(btnNewButton_2);*/
		
		
		
		
		/*//MENU BUTTONS (wip)
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 94, 1200, 58);
		getContentPane().add(panel_1);
		
		JButton Home = new JButton("Home");
		panel_1.add(Home);
		Home.setBounds(0, 94, 240, 58);
		panel.add(Home);
		Home.setBackground(Color.WHITE);
		java.awt.Image home = new ImageIcon("Home.png").getImage();
		Home.setIcon(new ImageIcon(home));
		*/
		
		
	}
}