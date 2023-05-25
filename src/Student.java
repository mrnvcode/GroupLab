import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Student {
    private StringProperty id;
    private StringProperty name;
    private StringProperty major;

    public Student(String id, String name, String major) {
        this.id = new SimpleStringProperty(id);
        this.name = new SimpleStringProperty(name);
        this.major = new SimpleStringProperty(major);
    }

    // ID
    public String getId() {
        return id.get();
    }

    public StringProperty idProperty() {
        return id;
    }

    public void setId(String id) {
        this.id.set(id);
    }

    // Name
    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    // Major
    public String getMajor() {
        return major.get();
    }

    public StringProperty majorProperty() {
        return major;
    }

    public void setMajor(String major) {
        this.major.set(major);
    }
}
