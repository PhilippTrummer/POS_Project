package BL;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.AbstractListModel;

public class UserModel extends AbstractListModel {

    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<User> filtered = new ArrayList<>();

    public void addUser(User u) {
        users.add(u);
        filtered.add(u);
        this.fireIntervalAdded(this, filtered.size() - 1, filtered.size() - 1);
    }

    public void delete(int idx) {
        filtered.remove(idx);
        fireIntervalAdded(this, filtered.size() - 1, 0);
    }

    public void load(File f) {
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    users.add(new User(line));
                } catch (Exception e) {
                }
            }
            filtered.addAll(users);
            this.fireIntervalAdded(this, 0, filtered.size() - 1);
        } catch (Exception e) {
        }
        this.fireIntervalAdded(this, 0, filtered.size() - 1);
    }

    public void save() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File("C:\\Users\\Philipp\\Desktop\\UserData.csv")))) {
            for (User u : users) {
                bw.write(u.toCSV());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
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
