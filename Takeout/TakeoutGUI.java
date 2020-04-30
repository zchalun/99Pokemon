package Takeout;
import javax.swing.JFrame;
import java.util.*;
public class TakeoutGUI
{
    Takeout takeout;
    ArrayList<List<String>> DB;
    
    TakeoutGUI(String username, String password) {
        takeout = new Takeout(username, password);
        takeout.connectDB();
        takeout.retrieveData();
        DB = takeout.getData();
    }
    
    public void updateDB() {
        
    }
    
    public void display() {
        
    }
}
