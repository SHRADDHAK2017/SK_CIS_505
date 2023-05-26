package SK_CIS_505.Module9.gradeBookApp;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class KulkarniGradeBookApp extends Application {
 
    
    private static final String CSV_FILE = "grades.csv";

    private TextField firstNameField;
    private TextField lastNameField;
    private TextField courseField;
    private ComboBox<String> gradeComboBox;
    private TextArea gradesTextArea;
       
        private static final String DIRECTORY_PATH = "C:/Users/Shraddha Kulkarni/github/SK_CIS_505/Module9/gradeBookApp"; // Specify the desired directory path

    public static void main(String[] args) {
        try {
            // Create the directory if it doesn't exist
            Path directoryPath = Paths.get(DIRECTORY_PATH);
            if (!Files.exists(directoryPath)) {
                Files.createDirectories(directoryPath);
            }

            // Create the grades.csv file within the directory
            Path filePath = directoryPath.resolve("grades.csv");
            Files.createFile(filePath);

            System.out.println("grades.csv file created successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while creating the grades.csv file.");
            e.printStackTrace();
        }
        
        launch(args);
    }
    
        @Override
        public void start(Stage primaryStage) {
            primaryStage.setTitle("Grade Book");

            // Create form fields
            Label firstNameLabel = new Label("First Name:");
            firstNameField = new TextField();
    
            Label lastNameLabel = new Label("Last Name:");
            lastNameField = new TextField();
    
            Label courseLabel = new Label("Course:");
            courseField = new TextField();
    
            Label gradeLabel = new Label("Grade:");
            gradeComboBox = new ComboBox<>(FXCollections.observableArrayList("A", "B", "C", "D", "F"));
    
            // Create buttons
            Button clearButton = new Button("Clear");
            clearButton.setOnAction(e -> clearForm());
    
            Button saveButton = new Button("Save");
            saveButton.setOnAction(e -> saveGrade());
    
            Button viewButton = new Button("View Grades");
            viewButton.setOnAction(e -> viewGrades());
    
            // Create layout
            GridPane gridPane = new GridPane();
            gridPane.setHgap(10);
            gridPane.setVgap(10);
            gridPane.setPadding(new Insets(10));
    
            gridPane.add(firstNameLabel, 0, 0);
            gridPane.add(firstNameField, 1, 0);
    
            gridPane.add(lastNameLabel, 0, 1);
            gridPane.add(lastNameField, 1, 1);
    
            gridPane.add(courseLabel, 0, 2);
            gridPane.add(courseField, 1, 2);
    
            gridPane.add(gradeLabel, 0, 3);
            gridPane.add(gradeComboBox, 1, 3);
    
            gridPane.add(clearButton, 0, 4);
            gridPane.add(saveButton, 1, 4);
    
            gradesTextArea = new TextArea();
            gradesTextArea.setEditable(false);
            gridPane.add(gradesTextArea, 0, 5, 2, 1);
    
            gridPane.add(viewButton, 0, 6);
    
            // Set the scene
            Scene scene = new Scene(gridPane);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
    
        private void clearForm() {
            firstNameField.clear();
            lastNameField.clear();
            courseField.clear();
            gradeComboBox.getSelectionModel().clearSelection();
        }
    
        private void saveGrade() {
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            String course = courseField.getText();
            String grade = gradeComboBox.getValue();
    
           // String entry = String.format("%s,%s,%s,%s", firstName, lastName, course, grade);
    
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(CSV_FILE, true))) {
                if (Files.size(Path.of(CSV_FILE)) == 0) {
                    writer.write("firstName,lastName,course,grade");
                   // writer.write("firstName,lastName,course,grade");
                    writer.newLine();
                }
    
                writer.write("First Name: " + firstName + "\n" + "Last Name: " + lastName + "\n" + "Course: " + course + "\n" + "Grade: " + grade + "\n");
                writer.newLine();
                writer.flush();
    
                System.out.println("Grade entry saved successfully.");
    
                clearForm();
    
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    
        private void viewGrades() {
            try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE))) {
                String line;
                boolean firstLine = true;
                List<String> entries = new ArrayList<>();
                while ((line = reader.readLine()) != null) {
                    if (firstLine) {
                        firstLine = false;
                        continue; // Skip the first line
                    }
                    entries.add(line);
                }
    
                if (entries.isEmpty()) {
                    gradesTextArea.setText("No grades found.");
                } else {
                    String grades = String.join("\n", entries);
                    gradesTextArea.setText(grades);
                }
    
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    
}

