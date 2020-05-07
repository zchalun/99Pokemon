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

import java.awt.event.ActionEvent;

public class View
{
    private Model model;
    private JFrame frame;
    private CardLayout cardLayout = new CardLayout();
    private JPanel clBase = new JPanel();
    private ArrayList<List<String>> takeoutTable;
    //Login Screen
    private JPanel LoginScreen = new JPanel();
    private JPanel firstRowUsername = new JPanel();
    private JLabel usernameLabel = new JLabel("Username");
    private JTextField Username = new JTextField(20);
    private JPanel secondRowPassword = new JPanel();
    private JLabel passwordLabel = new JLabel("Password");
    private JPasswordField Password = new JPasswordField(20);
    private JPanel thirdRowLogin = new JPanel();
    private JButton Login = new JButton("Login");
    //Table
    private JPanel Table = new JPanel();
    View (Model mmodel, JFrame fframe) {
        model = mmodel;
        frame = fframe;
        Password.setEchoChar('*');
    }
    
    public void display() {
        frame.getContentPane().setPreferredSize(new Dimension(700, 400));
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        clBase.setLayout(cardLayout);
        
        LoginScreen.setSize(700, 400);
        LoginScreen.setLayout(new BoxLayout(LoginScreen, BoxLayout.Y_AXIS));
        firstRowUsername.add(usernameLabel);
        firstRowUsername.add(Username);
        firstRowUsername.setMaximumSize(new Dimension(Integer.MAX_VALUE, (int) Username.getPreferredSize().getHeight() + 5));
        secondRowPassword.add(passwordLabel);
        secondRowPassword.add(Password);
        secondRowPassword.setMaximumSize(new Dimension(Integer.MAX_VALUE, (int) Password.getPreferredSize().getHeight() + 5));
        thirdRowLogin.add(Login);
        thirdRowLogin.setMaximumSize(new Dimension(Integer.MAX_VALUE, (int) Login.getPreferredSize().getHeight() + 5));
        LoginScreen.add(firstRowUsername);
        LoginScreen.add(secondRowPassword);
        LoginScreen.add(thirdRowLogin);
        
        clBase.add("loginScreen", LoginScreen);
        clBase.add("table", Table);
        frame.add(clBase);
        frame.pack();
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
        cardLayout.show(clBase, card);
    }
    
    void addLoginListener(ActionListener LoginListener) {
        Login.addActionListener(LoginListener);
    }
}
