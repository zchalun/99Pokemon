package Takeout;
import java.sql.*;
import java.util.*;
public class Takeout {
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    
    String url;
    String username;
    String password;
    
    String name;
    ArrayList<List<String>> takeoutDB;
    Takeout(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public void connectDB() {
         
    }
    
    public void retrieveData() {
        //SQL Table -> ArrayList<List<String>>
        //Row -> ArrayList<String>
    }
    
    public ArrayList<List<String>> getData() {
        return takeoutDB;
    }
}
