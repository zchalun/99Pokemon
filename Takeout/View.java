package Takeout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.Box;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.Container;
import java.awt.CardLayout;
import java.util.*;
public class View
{
    private Model model;
    private JFrame frame;
    private JLabel usernameLabel = new JLabel("Username");
    private JLabel passwordLabel = new JLabel("Password");
    private JTextField Username = new JTextField(20);
    private JPasswordField Password = new JPasswordField(20);
    private JButton Login = new JButton("Login");
    private JPanel LoginScreen = new JPanel();
    private JPanel firstRowUsername = new JPanel();
    private JPanel secondRowPassword = new JPanel();
    private CardLayout cardLayout = new CardLayout();
    ArrayList<List<String>> takeoutTable;
    View (Model mmodel, JFrame fframe) {
        model = mmodel;
        frame = fframe;
        Password.setEchoChar('*');
    }
    
    public void display() {
        frame.getContentPane().setPreferredSize(new Dimension(700, 400));
        frame.setLayout(cardLayout);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        LoginScreen.setSize(700, 400);
        LoginScreen.setLayout(new BoxLayout(LoginScreen, BoxLayout.Y_AXIS));
        firstRowUsername.add(usernameLabel);
        firstRowUsername.add(Username);
        firstRowUsername.setMaximumSize(new Dimension(Integer.MAX_VALUE, (int) Username.getPreferredSize().getHeight()));
        secondRowPassword.add(passwordLabel);
        secondRowPassword.add(Password);
        firstRowUsername.setMaximumSize(new Dimension(Integer.MAX_VALUE, (int) Password.getPreferredSize().getHeight()));
        LoginScreen.add(firstRowUsername);
        LoginScreen.add(secondRowPassword);
        
        frame.pack();
        frame.add("loginScreen", LoginScreen);
        frame.setVisible(true);
    }
    
    public void updateDB() {
        model.retrieveData();
    }
    
    public String getUsername() {
        return Username.getText();
    }
    
    public String getPassword() {
        return Password.getText();
    }
    
    public void switchCard(String card) {
        cardLayout.show(frame, card);
    }
    
    void addLoginListener(ActionListener LoginListener) {
        Login.addActionListener(LoginListener);
    }
}
