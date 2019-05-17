package BL;

import Database.DatabaseManager;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.AbstractListModel;

public class FirefightersModel extends AbstractListModel {

    private ArrayList<Firefighters> firefighters = new ArrayList<>();
    private DatabaseManager dm;

    {
        try {
            dm = DatabaseManager.getInstance();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * The method for loading a file.
     * @param f File to be inported
     */
    public void load(File f) {
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    firefighters.add(new Firefighters(line));
                } catch (Exception e) {

                }
            }
            this.fireIntervalAdded(this, 0, firefighters.size() - 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.fireIntervalAdded(this, 0, firefighters.size() - 1);
    }
    
    /**
     * The method for saving a file in a csv file
     */
    public void save() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File("./files/FirefightersData.csv")))) {
            for (Firefighters m : firefighters) {
                bw.write(m.toCSV());
            }
        } catch (Exception e) {

        }
    }
    
    /**
     * Method for adding a operation in the list.
     * @param f The operation
     */
    public void addFeuerwehr(Firefighters f) {
        firefighters.add(f);
        this.fireIntervalAdded(this, firefighters.size() - 1, firefighters.size() - 1);
    }
    
    /**
     * The method for loading the operations from a database.
     * @throws SQLException SQL Exception
     */
    public void loadFeuerwehrFromDatabase() throws SQLException {
        ResultSet res = dm.executeQuery("SELECT * FROM operations;");
        while (res.next()) {
            firefighters.add(new Firefighters(res.getString(2), res.getString(1), res.getString(4)));
        }
        this.fireIntervalAdded(this, 0, firefighters.size() - 1);
    }

    /* 
     * The method for saving operations in a database.
     * @throws SQLException SQL Exception
     */
    public void saveFeuerwehrToDatabase() throws SQLException {
        for (Firefighters f : firefighters) {
            ResultSet res = dm.executeQuery("SELECT * FROM operations WHERE type='"
                    + f.getType() + "' AND firefighters='"
                    + f.getName() + "' AND duration='"
                    + f.getDuration() + "';");
            if (res.next()) {

            } else {
                dm.executeUpdate("INSERT INTO operations(type,firefighters,duration) VALUES('"
                        + f.getType() + "','"
                        + f.getName() + "','"
                        + f.getDuration() + "' );");
            }
        }
    }

    @Override
    public int getSize() {
        return firefighters.size();
    }

    @Override
    public Object getElementAt(int i) {
        return firefighters.get(i);
    }
}
