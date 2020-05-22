package Reservations;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class AddReservationsGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name_input;
	private JTextField password_input;
	private JTextField guest_input;
	private JTextField time_input;
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
	public AddReservationsGUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 466, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblReservation = new JLabel("Enter name for reservation");
		lblReservation.setBounds(6, 0, 184, 26);
		contentPane.add(lblReservation);
		
		name_input = new JTextField();
		name_input.setBounds(6, 22, 438, 26);
		contentPane.add(name_input);
		name_input.setColumns(10);
		
		password_input = new JTextField();
		password_input.setBounds(6, 71, 438, 26);
		contentPane.add(password_input);
		password_input.setColumns(10);
		
		guest_input = new JTextField();
		guest_input.setBounds(6, 119, 438, 26);
		contentPane.add(guest_input);
		guest_input.setColumns(10);
		
		time_input = new JTextField();
		time_input.setBounds(6, 166, 438, 26);
		contentPane.add(time_input);
		time_input.setColumns(10);
		
		JButton buttonEnter = new JButton("Enter");
		buttonEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// call addRes
				int x  = Integer.parseInt(guest_input.getText());
				try {
					result.setText(					                          // Set return value of call to addReservation
							ManageReservations.driverAdd(			          // Call addReservations via driverAdd (is this even named appropriately)
									name_input.getText(),                     // Get name from user input ^
									x,                                        // get num guests from user input ^
									time_input.getText(),                     // get time from user input ^
									password_input.getText()));
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}               // get password from user input ^
			}  

		});
		buttonEnter.setBounds(142, 194, 145, 29);
		contentPane.add(buttonEnter);
		
		result = new JTextField();
		result.setEditable(false);
		result.setBounds(6, 226, 438, 47);
		contentPane.add(result);
		result.setColumns(10);
		
		JLabel lblEnter = new JLabel("Enter reservation password");
		lblEnter.setBounds(6, 47, 184, 26);
		contentPane.add(lblEnter);
		
		JLabel lblEnterTotalNumber = new JLabel("Enter total number of guests (an integer)");
		lblEnterTotalNumber.setBounds(6, 95, 342, 26);
		contentPane.add(lblEnterTotalNumber);
		
		JLabel lblEnterTimeFor = new JLabel("Enter time for reservation (format: HH:MM AM/PM)");
		lblEnterTimeFor.setBounds(6, 145, 414, 26);
		contentPane.add(lblEnterTimeFor);
			
	}
}
