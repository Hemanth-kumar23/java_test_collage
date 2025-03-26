
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class program43 {

    static final String DB_URL = "jdbc:mysql://localhost:3306/javalab";
    static final String USER = "root";
    static final String PASS = "";
    static final String QUERY = "SELECT * FROM employee";

    public static void main(String[] args) {
        // Open a connection
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);

            // Extract data from result set
            while (rs.next()) { // Retrieve by column name
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print(" Age: " + rs.getInt("age"));
                System.out.print(" First: " + rs.getString("first"));
                System.out.println(" Last: " + rs.getString("last"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
