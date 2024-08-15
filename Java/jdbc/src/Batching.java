import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Batching {

    public static void main(String[] args) {

        String jdbcURL = "jdbc:mysql://localhost:3306/gdscdb";
        String username = "root";
        String password = "";

        Connection connection = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");


            connection = DriverManager.getConnection(jdbcURL, username, password);


            String updateVacationBalanceSQL = "UPDATE Employee SET Vacation_Balance = 45 WHERE Age > 45";
            String updateTitleSQL = "UPDATE Employee SET F_Name = CONCAT('Mr. ', F_Name) WHERE Age > 45 AND Sex = 'M'";
            String updateTitleSQL_Female = "UPDATE Employee SET F_Name = CONCAT('Mrs. ', F_Name) WHERE Age > 45 AND Sex = 'F'";

            PreparedStatement updateVacationBalanceStmt = connection.prepareStatement(updateVacationBalanceSQL);
            PreparedStatement updateTitleStmt = connection.prepareStatement(updateTitleSQL);
            PreparedStatement updateTitleStmtFemale = connection.prepareStatement(updateTitleSQL_Female);


            updateVacationBalanceStmt.addBatch();
            updateTitleStmt.addBatch();
            updateTitleStmtFemale.addBatch();


            updateVacationBalanceStmt.executeBatch();
            updateTitleStmt.executeBatch();
            updateTitleStmtFemale.executeBatch();

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
