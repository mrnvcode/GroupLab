import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// Define the Main class which is the entry point of your application
public class Main extends Application {
    // Override the start method of the Application class
    @Override
    public void start(Stage primaryStage) throws Exception{
        // Load the FXML file for the main view
        Parent root = FXMLLoader.load(getClass().getResource("student_view.fxml"));
        // Set the title of the primary stage (the main window of your application)
        primaryStage.setTitle("Student Management System");
        // Set the scene of the primary stage, defining the root and the size of the window
        primaryStage.setScene(new Scene(root, 500, 400));
        // Display the primary stage
        primaryStage.show();
    }

    // Define the main method which launches the application
    public static void main(String[] args) {
        launch(args);
    }
}
