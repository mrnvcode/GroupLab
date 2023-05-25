import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class StudentController {
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

    @FXML
    private void addStudent(ActionEvent event) {
        if (idField.getText().isEmpty() || nameField.getText().isEmpty() || majorField.getText().isEmpty()) {
            // Show error dialog
        } else {
            // Create a new Student from text field data
            Student student = new Student(idField.getText(), nameField.getText(), majorField.getText());

            // Add the new Student to the table
            studentTable.getItems().add(student);
        }
    }

    @FXML
    private void deleteStudent(ActionEvent event) {
        // Delete the selected Student from the table
        Student selectedStudent = studentTable.getSelectionModel().getSelectedItem();
        if (selectedStudent != null) {
            studentTable.getItems().remove(selectedStudent);
        }
    }

    @FXML
    public void initialize() {
        // Initialize the table
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        majorColumn.setCellValueFactory(new PropertyValueFactory<>("major"));
    }
}
