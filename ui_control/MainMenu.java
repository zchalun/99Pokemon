package ui_control;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
		
		JButton Login = new JButton("");
		java.awt.Image login = new ImageIcon("Login.png").getImage();
		Login.setBounds(960, 0, 240, 94);
		panel.add(Login);
		Login.setBackground(new java.awt.Color(36,104,177));
		Login.setIcon(new ImageIcon(login));
		
		JButton btnReservationTest = new JButton("reservation test");
		btnReservationTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Reservations.ReservationsGUI.java
			}
		});
		btnReservationTest.setBounds(172, 393, 195, 129);
		getContentPane().add(btnReservationTest);
		
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