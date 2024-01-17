import java.sql.*;

public class JavaDBXConnect {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/mysqljavacon";
        String username = "";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Create a table if it doesn't exist
            String createTableSQL = "CREATE TABLE IF NOT EXISTS employees (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(255), age INT)";
            Statement statement = connection.createStatement();
            statement.executeUpdate(createTableSQL);
            statement.close();

            System.out.println("Table 'employees' created successfully.");

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
