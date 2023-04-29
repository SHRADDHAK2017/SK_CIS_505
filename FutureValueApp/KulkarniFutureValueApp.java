package SK_CIS_505.FutureValueApp;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class KulkarniFutureValueApp extends Application {

    
    
    private TextField mp = new TextField();
    private TextField ir = new TextField();
    

    static JFrame f;
    static JLabel l;
    static JLabel btnClear;
    static JLabel btnCalculate;
    
   

    


    
    
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage)
    {
        // Create a pane and set its properties
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.TOP_LEFT);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        // Place nodes in the pane
        pane.add(new Label("Monthly Payment"), 0, 0);
        pane.add(mp, 1, 0);
        pane.add(new Label("Interest Rate"), 0, 1);
        pane.add(ir, 1, 1);

        l = new JLabel("Years");
        pane.add(new Label("Years"), 0,2);

        ComboBox comboBox = new ComboBox();
        comboBox.getItems().add("15");
        comboBox.getItems().add("20");
        comboBox.getItems().add("30");
        
        

        Button btAdd = new Button("Calculate");
        pane.add(btAdd, 3, 3);
        Button btAddn = new Button("Clear");
        pane.add(btAddn, 0, 3);

        VBox layout = new VBox();
       TextArea jfxarea = new TextArea();
       jfxarea.setPrefColumnCount(10);
        jfxarea.setPrefHeight(75);
        jfxarea.setPrefWidth(150);
        
        
        
        HBox actionBtnContainer  = new HBox(comboBox);
        actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
        actionBtnContainer.setSpacing(10);
        actionBtnContainer.getChildren().add(btAdd);
         actionBtnContainer.getChildren().add(btAddn);
        pane.add(actionBtnContainer,1,4);
        actionBtnContainer.getChildren().addAll(jfxarea);
       


        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Future Value App"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
       primaryStage.show(); // Display the stage

    






    }

    public static void main(String[] args)
    {
        new KulkarniFutureValueApp();
        Application.launch(args);
    }

   

}
