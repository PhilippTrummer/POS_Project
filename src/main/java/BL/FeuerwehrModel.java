package BL;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.AbstractListModel;

public class FeuerwehrModel extends AbstractListModel {

    private ArrayList<Feuerwehr> feuerwehr = new ArrayList<>();

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

    public void resetFilter() {
        feuerwehr.clear();
        for (Feuerwehr f : feuerwehr) {
            feuerwehr.add(f);
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
