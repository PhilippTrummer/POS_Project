package BL;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Feuerwehr {

    private String name;
    private String art;
    private LocalTime time;

    private static DateTimeFormatter tf;

    static {
        tf = DateTimeFormatter.ofPattern("HH:mm");
    }

    public Feuerwehr(String name, String art, LocalTime time) {
        this.name = name;
        this.art = art;
        this.time = time;
    }

    public Feuerwehr(String line) {
        String parts[] = line.split(";");
        name = parts[0];
        art = parts[1];
        time = LocalTime.parse(parts[2], tf);
    }
    
    @Override
    public String toString(){
        return String.format("Eingesetzt: %s, Einsatzart: %s, Dauer: %s", name, art, time);
    }

    public String getName() {
        return name;
    }

    public String getArt() {
        return art;
    }

    public LocalTime getTime() {
        return time;
    }
}
