package Reservations;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class SearchReservationGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name_input;
	private JTextField password_input;
	private JTextField result; 
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchReservationGUI frame = new SearchReservationGUI();
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
	public SearchReservationGUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 461, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPalindromeTester = new JLabel("Enter name of reservation");
		lblPalindromeTester.setBounds(6, 0, 184, 26);
		contentPane.add(lblPalindromeTester);
		
		name_input = new JTextField();
		name_input.setBounds(6, 22, 438, 26);
		contentPane.add(name_input);
		name_input.setColumns(10);
		
		password_input = new JTextField();
		password_input.setBounds(6, 71, 438, 26);
		contentPane.add(password_input);
		password_input.setColumns(10);
		
		JButton buttonSearch = new JButton("Search");
		buttonSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// call addRes
				result.setText(					                          // Set return value of call to reservation return
						ManageReservations.driverView(			          // Call addReservations via driverAdd (is this even named appropriately)
								name_input.getText(),                     // Get name from user input ^
								password_input.getText()));               // get password from user input ^
			}  

		});
		buttonSearch.setBounds(142, 107, 145, 29);
		contentPane.add(buttonSearch);
		
		result = new JTextField();
		result.setEditable(false);
		result.setBounds(6, 146, 438, 47);
		contentPane.add(result);
		result.setColumns(10);
		
		JLabel lblEnter = new JLabel("Enter reservation password");
		lblEnter.setBounds(6, 47, 184, 26);
		contentPane.add(lblEnter);
			
	}
}