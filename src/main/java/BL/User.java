package BL;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class User {

    private String name;
    private String feuerwehrName;
    private LocalTime time;

    private static DateTimeFormatter tf;

    static {
        tf = DateTimeFormatter.ofPattern("HH:mm:ss");
    }

    public User(String name, String feuerwehrName, LocalTime time) {
        this.name = name;
        this.feuerwehrName = feuerwehrName;
        this.time = time;
    }

    public User(String line) {
        String parts[] = line.split(";");
        feuerwehrName = parts[0];
        name = parts[1];
        time = LocalTime.parse(parts[2], tf);
    }

    @Override
    public String toString() {
        return String.format("Feuerwehr %s, Name: %s, Einsatzzeit: %s", feuerwehrName, name, time.format(tf));
    }

    public String getName() {
        return name;
    }

    public String getFeuerwehrName() {
        return feuerwehrName;
    }

    public LocalTime getTime() {
        return time;
    }
}
