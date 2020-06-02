package ui_control;

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

import Reservations.AddReservationsGUI;
import Reservations.ManageReservations;
import model_products.Food;

public class ProductViewUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name_display;
	private JTextField price_display;
	private JTextField desc_display;
	
	/**
	 * Launch the application.
	 */
	public static void main(Food f) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductViewUI frame = new ProductViewUI(f);
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
	public ProductViewUI(Food f) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 466, 500);
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
		name_display.setText(f.getName());
		
		price_display = new JTextField();
		price_display.setBounds(6, 72, 438, 26);
		price_display.setEditable(false);
		contentPane.add(price_display);
		price_display.setColumns(10);
		price_display.setText(String.valueOf(f.getPrice()) + " P");
		
		desc_display = new JTextField();
		desc_display.setBounds(6, 119, 438, 26);
		desc_display.setEditable(false);
		contentPane.add(desc_display);
		desc_display.setColumns(10);
		desc_display.setText(f.getDesc());
		
		JLabel lblPrice = new JLabel("Dish price (Pokédollars)");
		lblPrice.setBounds(6, 48, 342, 26);
		contentPane.add(lblPrice);
		
		JLabel lblDesc = new JLabel("Dish description");
		lblDesc.setBounds(6, 98, 414, 26);
		contentPane.add(lblDesc);
		
		JLabel lblPicture = new JLabel("Dish Picture");
		lblPicture.setBounds(6, 155, 79, 13);
		contentPane.add(lblPicture);
		
		JLabel foodPic = new JLabel("");
		java.awt.Image foodimage = new ImageIcon(f.getName() + ".png").getImage();
		contentPane.setLayout(null);
		contentPane.add(foodPic);
		foodPic.setIcon(new ImageIcon(foodimage));
		foodPic.setBounds(100, 155, 320, 298);
			
	}
}