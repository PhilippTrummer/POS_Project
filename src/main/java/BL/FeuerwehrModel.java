package BL;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.AbstractListModel;

public class FeuerwehrModel extends AbstractListModel {

    private ArrayList<Feuerwehr> feuerwehr = new ArrayList<>();
    private ArrayList<Feuerwehr> filtered = new ArrayList<>();

//    public void load(File f) {
//        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                try {
//                    feuerwehr.add(new Feuerwehr(line));
//                } catch (Exception e) {
//                }
//            }
//            filtered.addAll(feuerwehr);
//            this.fireIntervalAdded(this, 0, filtered.size() - 1);
//        } catch (Exception e) {
//        }
//        this.fireIntervalAdded(this, 0, filtered.size() - 1);
//    }
    public void resetFilter() {
        filtered.clear();
        for (Feuerwehr f : feuerwehr) {
            filtered.add(f);
        }
    }

    public void save(File f) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
        oos.writeObject(feuerwehr);
    }

    public void load(File f) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
        feuerwehr = (ArrayList<Feuerwehr>) ois.readObject();
        resetFilter();
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
