package BL;

public class Firefighters {

    private String name;
    private String type;
    private String duration;

    public Firefighters(String name, String type, String duration) {
        this.name = name;
        this.type = type;
        this.duration = duration;
    }

    /**
     * 
     * @param line 
     */
    public Firefighters(String line) {
        String parts[] = line.split(";");
        name = parts[0];
        type = parts[1];
        duration = parts[2];   
    }
    
    /**
     *  Creates the string for the list.
     * @return The string which is shown in the list.
     */
    @Override
    public String toString() {
        return String.format("Name: %s, Type: %s, Duration: %s", name, type, duration);
    }

    /**
     * Creates the string for the csv file.
     * @return The string which is shown in the csv file.
     */
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
