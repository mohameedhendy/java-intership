import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

    public static void main(String[] args) {

        String jdbcURL = "jdbc:mysql://localhost:3306/gdscdb";
        String username = "root";
        String password = "";

        Connection connection = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");


            connection = DriverManager.getConnection(jdbcURL, username, password);


            String createTableSQL = "CREATE TABLE IF NOT EXISTS Employee ("
                    + "Id INT PRIMARY KEY AUTO_INCREMENT, "
                    + "F_Name VARCHAR(50), "
                    + "L_Name VARCHAR(50), "
                    + "Sex CHAR(1), "
                    + "Age INT, "
                    + "Address VARCHAR(100), "
                    + "Phone_Number VARCHAR(15), "
                    + "Vacation_Balance INT DEFAULT 30)";

            Statement statement = connection.createStatement();
            statement.execute(createTableSQL);

            // Inserting 5 rows
            String insertSQL = "INSERT INTO Employee (F_Name, L_Name, Sex, Age, Address, Phone_Number) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);

            preparedStatement.setString(1, "John");
            preparedStatement.setString(2, "Doe");
            preparedStatement.setString(3, "M");
            preparedStatement.setInt(4, 50);
            preparedStatement.setString(5, "123 Main St");
            preparedStatement.setString(6, "555-1234");
            preparedStatement.addBatch();

            preparedStatement.setString(1, "Jane");
            preparedStatement.setString(2, "Smith");
            preparedStatement.setString(3, "F");
            preparedStatement.setInt(4, 42);
            preparedStatement.setString(5, "456 Elm St");
            preparedStatement.setString(6, "555-5678");
            preparedStatement.addBatch();

            preparedStatement.setString(1, "Mike");
            preparedStatement.setString(2, "Johnson");
            preparedStatement.setString(3, "M");
            preparedStatement.setInt(4, 47);
            preparedStatement.setString(5, "789 Oak St");
            preparedStatement.setString(6, "555-9012");
            preparedStatement.addBatch();

            preparedStatement.setString(1, "Anna");
            preparedStatement.setString(2, "Brown");
            preparedStatement.setString(3, "F");
            preparedStatement.setInt(4, 35);
            preparedStatement.setString(5, "321 Maple St");
            preparedStatement.setString(6, "555-3456");
            preparedStatement.addBatch();

            preparedStatement.setString(1, "Tom");
            preparedStatement.setString(2, "Davis");
            preparedStatement.setString(3, "M");
            preparedStatement.setInt(4, 60);
            preparedStatement.setString(5, "654 Pine St");
            preparedStatement.setString(6, "555-7890");
            preparedStatement.addBatch();


            preparedStatement.executeBatch();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.getMessage();
            }
        }
    }
}
