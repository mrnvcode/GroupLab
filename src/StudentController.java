import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

// Define the StudentController class that handles UI events and updates the model and view
public class StudentController {
    // Link the elements from the FXML file
    @FXML
    private TableView<Student> studentTable;
    @FXML
    private TableColumn<Student, String> idColumn;
    @FXML
    private TableColumn<Student, String> nameColumn;
    @FXML
    private TableColumn<Student, String> majorColumn;
    @FXML
    private TextField idField;
    @FXML
    private TextField nameField;
    @FXML
    private TextField majorField;

    // Add student action that triggers when the Add button is pressed
    @FXML
    private void addStudent(ActionEvent event) {
        // Check if all fields are filled
        if (idField.getText().isEmpty() || nameField.getText().isEmpty() || majorField.getText().isEmpty()) {
            // Show error dialog
        } else {
            // Create a new Student from text field data
            Student student = new Student(idField.getText(), nameField.getText(), majorField.getText());

            // Add the new Student to the table
            studentTable.getItems().add(student);
        }
    }

    // Delete student action that triggers when the Delete button is pressed
    @FXML
    private void deleteStudent(ActionEvent event) {
        // Get the selected Student from the table
        Student selectedStudent = studentTable.getSelectionModel().getSelectedItem();
        // If a student was selected, remove it from the table
        if (selectedStudent != null) {
            studentTable.getItems().remove(selectedStudent);
        }
    }

    // Initialize the table columns and map them to the corresponding Student attributes
    @FXML
    public void initialize() {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        majorColumn.setCellValueFactory(new PropertyValueFactory<>("major"));
    }
}
