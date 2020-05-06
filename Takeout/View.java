package Takeout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.util.*;
public class View
{
    private Model model;
    private JFrame frame;
    private JTextField Username = new JTextField(10);
    private JPasswordField Password = new JPasswordField(10);
    private JButton Login = new JButton("Login");
    ArrayList<List<String>> takeoutTable;
    View (Model mmodel, JFrame fframe) {
        model = mmodel;
        frame = fframe;
        Password.setEchoChar('*');
    }
    
    public void display() {
        frame.setSize(new Dimension(700, 400));
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
    
    void addLoginListener(ActionListener LoginListener) {
        Login.addActionListener(LoginListener);
    }
}
