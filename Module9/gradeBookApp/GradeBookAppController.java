package SK_CIS_505.Module9.gradeBookApp;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import javafx.fxml.FXML;

public class GradeBookAppController {
    
    @FXML
    private Label firstNameLabel;

    @FXML
    private Label lastNameLabel;

    @FXML
    private Label courseLabel;

    @FXML
    private Label gradeLabel;

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField courseField;

    @FXML
    private ComboBox<String> gradeComboBox;

    @FXML
    private Button clearButton;

    @FXML
    private Button viewGradesButton;

    @FXML
    private Button saveGradeButton;

    private static final String CSV_FILE = "grades.csv";

    @FXML
    public void initialize() {
        ObservableList<String> grades = FXCollections.observableArrayList("A", "B", "C", "D", "F");
        gradeComboBox.setItems(grades);
    }

    @FXML
    private void clearForm(ActionEvent event) {
        firstNameField.clear();
        lastNameField.clear();
        courseField.clear();
        gradeComboBox.getSelectionModel().clearSelection();
    }

    @FXML
    private void viewGrades(ActionEvent event) {
        try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void saveGrade(ActionEvent event) {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String course = courseField.getText();
        String grade = gradeComboBox.getValue();

        String entry = String.format("%s,%s,%s,%s", firstName, lastName, course, grade);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CSV_FILE, true))) {
            if (Files.size(Path.of(CSV_FILE)) == 0) {
                writer.write("firstName,lastName,course,grade");
                writer.newLine();
            }

            writer.write(entry);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
