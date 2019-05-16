package BL;

public class User {

    private String name;
    private String feuerwehrName;
    private String duration;

    public User(String name, String feuerwehrName, String duration) {
        this.name = name;
        this.feuerwehrName = feuerwehrName;
        this.duration = duration;
    }

    public User(String line) {
        String parts[] = line.split(";");
        feuerwehrName = parts[0];
        name = parts[1];
        duration = parts[2];
    }

    @Override
    public String toString() {
        return String.format("Feuerwehr %s, Name: %s, Einsatzzeit: %s", feuerwehrName, name, duration);
    }

    public String toCSV() {
        return String.format("%s,%s,%s\n", feuerwehrName, name, duration);
    }

    public String getName() {
        return name;
    }

    public String getFeuerwehrName() {
        return feuerwehrName;
    }

    public String getDuration() {
        return duration;
    }
}
