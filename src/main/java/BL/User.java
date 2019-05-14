package BL;

public class User {
    private String name;
    private String feuerwehrName;
    private double time;

    public User(String name, String feuerwehrName, double time) {
        this.name = name;
        this.feuerwehrName = feuerwehrName;
        this.time = time;
    }
    
    @Override
    public String toString(){
        return String.format("%s Name: %s Einsatzzeit: ", feuerwehrName, name, time);
    }

    public String getName() {
        return name;
    }

    public String getFeuerwehrName() {
        return feuerwehrName;
    }

    public double getTime() {
        return time;
    }
}
