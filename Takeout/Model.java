package Takeout;
import java.sql.*;
import java.util.*;
public class Model {
    private Connection connection = null;
    private Statement statement = null;
    private ResultSet resultSet = null;
    private Driver driver;
    String dbName;
    String username;
    String password;
    
    String name;
    ArrayList<List<String>> takeoutDB;
    Model(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public void retrieveData() {
        //SQL Table -> ArrayList<List<String>>
        //Row -> ArrayList<String>
        //takeout struct:
        //Name | Order | Address | Status
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(dbName, username, password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM takeout");
            while (resultSet.next()) {
                List<String> stringArr = new ArrayList<>();
                String Name = resultSet.getString("Name");
                String Order = resultSet.getString("Order");
                String Address = resultSet.getString("Address");
                String Status = resultSet.getString("Status");
                stringArr.add(Name);
                stringArr.add(Order);
                stringArr.add(Address);
                stringArr.add(Status);
                takeoutDB.add(stringArr);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public ArrayList<List<String>> getData() {
        return takeoutDB;
    }
}
