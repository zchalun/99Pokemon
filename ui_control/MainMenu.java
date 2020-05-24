package ui_control;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model_pokemon.PokeDex;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		JButton btnReservationTest = new JButton("add new reservation test");
		btnReservationTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Reservations.AddReservationsGUI.main(null);
			}
		});
		btnReservationTest.setBounds(103, 280, 195, 129);
		getContentPane().add(btnReservationTest);
		
		JButton btnNewButton = new JButton("search for reservation test");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reservations.SearchReservationGUI.main(null);
			}
		});
		btnNewButton.setBounds(380, 280, 208, 129);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Change time of res test");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reservations.ChangeReservationTimeGUI.main(null);
			}
		});
		btnNewButton_1.setBounds(113, 425, 195, 114);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("delete res test");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reservations.DeleteReservationGUI.main(null);
			}
		});
		btnNewButton_2.setBounds(380, 425, 208, 129);
		getContentPane().add(btnNewButton_2);
		
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