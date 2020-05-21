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

public class ChangeReservationTimeGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name_input;
	private JTextField password_input;
	private JTextField newtime_input;
	private JTextField result; 
	private JLabel lblEnterNewTime;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangeReservationTimeGUI frame = new ChangeReservationTimeGUI();
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
	public ChangeReservationTimeGUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 461, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblReservation = new JLabel("Enter name of reservation");
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
		
		newtime_input = new JTextField();
		newtime_input.setBounds(6, 120, 438, 26);
		contentPane.add(newtime_input);
		newtime_input.setColumns(10);
		
		JButton buttonChange = new JButton("Change");
		buttonChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// call changeTime
				result.setText(					                          // Set return value of call to changeTime
						ManageReservations.driverChange(			      // Call ChangeTime via driverChange
								name_input.getText(),                     // Get name from user input ^
								password_input.getText(),                 // get password from user input ^
								newtime_input.getText()));                // get new time from user input ^
			}  

		});
		buttonChange.setBounds(146, 156, 145, 29);
		contentPane.add(buttonChange);
		
		result = new JTextField();
		result.setEditable(false);
		result.setBounds(6, 195, 438, 73);
		contentPane.add(result);
		result.setColumns(10);
		
		JLabel lblEnter = new JLabel("Enter reservation password");
		lblEnter.setBounds(6, 47, 184, 26);
		contentPane.add(lblEnter);
		
		lblEnterNewTime = new JLabel("Enter new time for reservation (format: HH:MM AM/PM)");
		lblEnterNewTime.setBounds(6, 95, 399, 26);
		contentPane.add(lblEnterNewTime);
			
	}
}