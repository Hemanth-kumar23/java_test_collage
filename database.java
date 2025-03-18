
import java.sql.Connection;  // Import the SQL package
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class database {

    static final String DB_URL = "jdbc:mysql://localhost:3306/javalab"; // Database URL
    static final String USER = "root";  // MySQL Username
    static final String PASS = "";      // MySQL Password (keep blank if no password)
    static final String QUERY = "SELECT * FROM employee";  // SQL Query

    public static void main(String[] args) {
        try {
            // Establishing a connection
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Creating a statement object
            Statement stmt = conn.createStatement();

            // Executing the query and storing the result
            ResultSet rs = stmt.executeQuery(QUERY);

            // Iterating through the result set
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Age: " + rs.getInt("age"));
                System.out.println("First: " + rs.getString("first"));
                System.out.println("Last: " + rs.getString("last"));
                System.out.println("-----------------------------");
            }

            // Closing the connection
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();  // Print SQL error details
        }
    }
}
