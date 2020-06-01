package ui_control;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Reservations.AddReservationsGUI;
import Reservations.ManageReservations;

public class ProductViewUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name_display;
	private JTextField price_display;
	private JTextField desc_display;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductViewUI frame = new ProductViewUI();
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
	public ProductViewUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 466, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Dish name");
		lblName.setBounds(6, 0, 184, 26);
		contentPane.add(lblName);
		
		name_display = new JTextField();
		name_display.setBounds(6, 22, 438, 26);
		name_display.setEditable(false);
		contentPane.add(name_display);
		name_display.setColumns(10);
		
		price_display = new JTextField();
		price_display.setBounds(6, 72, 438, 26);
		price_display.setEditable(false);
		contentPane.add(price_display);
		price_display.setColumns(10);
		
		desc_display = new JTextField();
		desc_display.setBounds(6, 119, 438, 26);
		desc_display.setEditable(false);
		contentPane.add(desc_display);
		desc_display.setColumns(10);
		
		JLabel lblEnterTotalNumber = new JLabel("Dish price");
		lblEnterTotalNumber.setBounds(6, 48, 342, 26);
		contentPane.add(lblEnterTotalNumber);
		
		JLabel lblEnterTimeFor = new JLabel("Dish description");
		lblEnterTimeFor.setBounds(6, 98, 414, 26);
		contentPane.add(lblEnterTimeFor);
		
		JLabel lblNewLabel = new JLabel("Dish Picture");
		lblNewLabel.setBounds(6, 155, 79, 13);
		contentPane.add(lblNewLabel);
			
	}
}