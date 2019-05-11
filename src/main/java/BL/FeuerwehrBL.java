package BL;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.AbstractListModel;

public class FeuerwehrBL extends AbstractListModel {
    
    private ArrayList<Feuerwehr> feuerwehr = new ArrayList<>();
    private ArrayList<Feuerwehr> filtered = new ArrayList<>();
    
    public void load(File f) {
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    feuerwehr.add(new Feuerwehr(line));
                } catch (Exception e) {
                }
            }
            filtered.addAll(feuerwehr);
            this.fireIntervalAdded(this, 0, filtered.size() - 1);
        } catch (Exception e) {
        }
        this.fireIntervalAdded(this, 0, filtered.size() - 1);
    }
    
    @Override
    public int getSize() {
        return filtered.size();
    }
    
    @Override
    public Object getElementAt(int i) {
        return filtered.get(i);
    }
}
