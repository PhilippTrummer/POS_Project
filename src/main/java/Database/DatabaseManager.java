package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DatabaseManager {

    /**
     * The one and only object for the class DataBase
     */
    private static DatabaseManager theInstance;

    private Connection conn;

    /**
     * Private constructor for singelton implementation
     */
    public DatabaseManager() throws SQLException {
        String s = JOptionPane.showInputDialog(null, "Please enter the name of the database: ");
        if (s != null) {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + s, "postgres", "postgres");
        }
    }

    /**
     * Executes a query.
     *
     * @param query The query to be executed
     * @return The resultset of the query
     */
    public ResultSet executeQuery(String query) throws SQLException {
        Statement s = conn.createStatement();
        return s.executeQuery(query);
    }

    /**
     * Executes a query and update.
     *
     * @param query The query to be executed.
     * @return The resultset of the query
     * @throws java.sql.SQLException SQL Exception
     */
    public int executeUpdate(String query) throws SQLException {
        Statement s = conn.createStatement();
        return s.executeUpdate(query);
    }

    /**
     * Creates the instance of the DataBase class if not exists.
     *
     * @return The one and only object of the DataBase class.
     * @throws java.sql.SQLException SQL Exception
     */
    public static synchronized DatabaseManager getInstance() throws SQLException {
        if (theInstance == null) {
            theInstance = new DatabaseManager();
        }
        return theInstance;
    }
}
