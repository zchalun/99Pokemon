package Takeout;
import javax.swing.JFrame;
import java.util.*;
public class View
{
    Model model;
    ArrayList<List<String>> takeoutTable;
    View(String username, String password) {
        model = new Model(username, password);
        updateDB();
        takeoutTable = model.getData();
    }
    
    public void updateDB() {
        model.retrieveData();
    }
    
    public void display() {
        
    }
}
