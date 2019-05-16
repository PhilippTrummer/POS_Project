package BL;

import Database.DatabaseManager;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.AbstractListModel;

public class FeuerwehrModel extends AbstractListModel {

    private ArrayList<Feuerwehr> feuerwehr = new ArrayList<>();
    private DatabaseManager dm;

    {
        try {
            dm = DatabaseManager.getInstance();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void load(File f) {
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    feuerwehr.add(new Feuerwehr(line));
                } catch (Exception e) {
                }
            }
            this.fireIntervalAdded(this, 0, feuerwehr.size() - 1);
        } catch (Exception e) {
        }
        this.fireIntervalAdded(this, 0, feuerwehr.size() - 1);
    }

    public void save() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File("C:\\Users\\Philipp\\Desktop\\FeuerwehrData.csv")))) {
            for (Feuerwehr m : feuerwehr) {
                bw.write(m.toCSV());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addFeuerwehr(Feuerwehr f) {
        feuerwehr.add(f);
        this.fireIntervalAdded(this, feuerwehr.size() - 1, feuerwehr.size() - 1);
    }

    public void loadFeuerwehrFromDatabase() throws SQLException {
        ResultSet res = dm.executeQuery("SELECT * FROM operations;");
        while (res.next()) {
            feuerwehr.add(new Feuerwehr(res.getString(2), res.getString(1), ""));
        }
        this.fireIntervalAdded(this, 0, feuerwehr.size() - 1);
    }

    public void saveFeuerwehrToDatabase() throws SQLException {
        for (Feuerwehr f : feuerwehr) {
            ResultSet res = dm.executeQuery("SELECT * FROM operations WHERE type='"
                    + f.getType() + "' AND name='"
                    + f.getName() + "' AND duration='"
                    + f.getDuration() + "' ");
            if (res.next()) {

            } else {
                dm.executeUpdate("INSERT INTO operations(type,firefighters,duration) VALUES('"
                        + f.getType() + "','"
                        + f.getName() + "','"
                        + f.getDuration() + "' ");
            }
        }
    }

    @Override
    public int getSize() {
        return feuerwehr.size();
    }

    @Override
    public Object getElementAt(int i) {
        return feuerwehr.get(i);
    }
}
