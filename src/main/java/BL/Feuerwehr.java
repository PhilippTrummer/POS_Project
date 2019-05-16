package BL;

public class Feuerwehr {

    private String name;
    private String type;
    private String duration;

    public Feuerwehr(String name, String type, String duration) {
        this.name = name;
        this.type = type;
        this.duration = duration;
    }

    public Feuerwehr(String line) {
        String parts[] = line.split(";");
        name = parts[0];
        type = parts[1];
        duration = parts[2];
    }

    @Override
    public String toString() {
        return String.format("Eingesetzt: %s, Einsatzart: %s, Dauer: %s", name, type, duration);
    }

    public String toCSV() {
        return String.format("%s,%s,%s\n", name, type, duration);
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getDuration() {
        return duration;
    }
}
