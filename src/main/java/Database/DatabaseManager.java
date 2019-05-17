package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {

    private static DatabaseManager theInstance;
    private Connection conn;

    /**
     * 
     * @throws SQLException 
     */
    public DatabaseManager() throws SQLException {
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Pos_Project", "postgres", "postgres");
    }

    /**
     * 
     * @param query
     * @return
     * @throws SQLException 
     */
    public ResultSet executeQuery(String query) throws SQLException {
        Statement s = conn.createStatement();
        return s.executeQuery(query);
    }

    /**
     * 
     * @param query
     * @return
     * @throws SQLException 
     */
    public int executeUpdate(String query) throws SQLException {
        Statement s = conn.createStatement();
        return s.executeUpdate(query);
    }

    /**
     * 
     * @return
     * @throws SQLException 
     */
    public static synchronized DatabaseManager getInstance() throws SQLException {
        if (theInstance == null) {
            theInstance = new DatabaseManager();
        }
        return theInstance;
    }
}
