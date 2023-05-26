package SK_CIS_505.Module9.gradeBookApp;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import javafx.fxml.FXML;

public class GradeBookAppController {
    

    @FXML
    private TextField firstNameField;
    
    @FXML
    private TextField lastNameField;
    
    @FXML
    private TextField courseField;
    
    @FXML
    private TextField gradeField;
    
    @FXML
    private TextArea gradesTextArea;
    private static final String CSV_FILE = "grades.csv";
    private static final String DIRECTORY_PATH = "C:/Users/Shraddha Kulkarni/github/SK_CIS_505/Module9/gradeBookApp";

    public void saveGrades(ActionEvent event) {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String course = courseField.getText();
        String grade = gradeField.getText();
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CSV_FILE, true))) 
            {
            if (Files.size(Paths.get("grades.csv")) == 0) {
                writer.write("\n" + "First Name: " + firstName + "\n " + "Last Name: " + lastName + "\n " + "Course: " + course + "\n " + "Grades: " + grade);
               writer.write("firstName, lastName, course, grade");
                writer.newLine();
            }
            
          writer.write("\n" + "First Name: " + firstName + "\n " + "Last Name: " + lastName + "\n " + "Course: " + course + "\n " + "Grades: " + grade);
            writer.newLine();
            
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Clear form fields
        firstNameField.clear();
        lastNameField.clear();
        courseField.clear();
        gradeField.clear();
    }

    public void viewGrades(ActionEvent event) {
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("CSV_FILE"))) {
            String line;
            boolean firstLine = true;
            StringBuilder grades = new StringBuilder();
            
            while ((line = reader.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue; // Skip the first line
                }
                grades.append(line);
                grades.append(System.lineSeparator());
            }
            
            gradesTextArea.setText(grades.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


