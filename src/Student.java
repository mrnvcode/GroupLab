import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

// Define the Student class
public class Student {
    // Define properties for id, name, and major
    private StringProperty id;
    private StringProperty name;
    private StringProperty major;

    // Define the constructor for the Student class, initializing id, name, and major
    public Student(String id, String name, String major) {
        this.id = new SimpleStringProperty(id);
        this.name = new SimpleStringProperty(name);
        this.major = new SimpleStringProperty(major);
    }

    // ID methods
    // Get ID value
    public String getId() {
        return id.get();
    }

    // Get ID property
    public StringProperty idProperty() {
        return id;
    }

    // Set ID value
    public void setId(String id) {
        this.id.set(id);
    }

    // Name methods
    // Get Name value
    public String getName() {
        return name.get();
    }

    // Get Name property
    public StringProperty nameProperty() {
        return name;
    }

    // Set Name value
    public void setName(String name) {
        this.name.set(name);
    }

    // Major methods
    // Get Major value
    public String getMajor() {
        return major.get();
    }

    // Get Major property
    public StringProperty majorProperty() {
        return major;
    }

    // Set Major value
    public void setMajor(String major) {
        this.major.set(major);
    }
}
