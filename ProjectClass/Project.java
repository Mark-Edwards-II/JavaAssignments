public class Project {
    public String name;
    public String description;

    public String elevatorPitch() {
        return this.name + ":" + this.description;
    }

    public void Project() {}

    public void Project(String name) {
        this.name = name;
    }

    public void Project(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
}