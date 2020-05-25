package Login;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;

public class LoggedInUI extends JFrame {
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
	private static final long serialVersionUID = 1L;

	/**
	 * Create the frame.
	 */
	public LoggedInUI() {
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 0, 1200, 750);
		getContentPane().setLayout(null);	
	}
}