import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;

import SK_CIS_505.Module8.FinanceCalculator;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.awt.*;

public class EnhancedFutureValueApp extends Application implements ActionListener {


        int futureValue;
        int calculateResults;
        Labeled lblFutureValueDate;
        JFrame frame = new JFrame();
        private TextField txtMonthlyPayment = new TextField();

        private TextField txtInterestRate = new TextField();

        private TextArea txtResults = new TextArea();
        private Label lblMonthlyPayment = new Label("Monthly Payment:");
        private Label lblInterestRate = new Label("Interest Rate:");
        private Label lblYears = new Label("Years:");   
        private Label lblInterestRateFormat = new Label("(Enter 11.1% as 11.1)");

         private ComboBox<Integer> cbYears = new ComboBox<>();
            

         Button btnCalculate = new Button("Calculate");
      //  btnCalculate.addActionListener(this);
       
        
        Button btnClear = new Button("Clear");
       // btnClear.addActionListener(myActionListener);
        
        @Override
        public void start(Stage primaryStage) {
            GridPane pane = new GridPane();
            pane.setAlignment(Pos.CENTER);
            pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
            pane.setHgap(5.5);
            pane.setVgap(5.5);
        
            // Add controls to the GridPane
            pane.add(lblMonthlyPayment, 0, 0);
            pane.add(txtMonthlyPayment, 1, 0);
            pane.add(lblInterestRate, 0, 1);
            pane.add(txtInterestRate, 1, 1);
            pane.add(lblInterestRateFormat,1,2 );
            pane.add(lblYears, 0, 3);
            pane.add(cbYears, 1, 3);
            pane.add(txtResults, 1,6 );
            
        
            // Add action buttons to an HBox
            HBox actionBtnContainer = new HBox(10);
            actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
            actionBtnContainer.getChildren().add(btnCalculate);
            actionBtnContainer.getChildren().add(btnClear);
            pane.add(actionBtnContainer,1,4);
            
        
            // Set the text fill to red and HPos to the right for lblInterestRateFormat label
            lblInterestRateFormat.setTextFill(Color.RED);
            GridPane.setHalignment(lblInterestRateFormat, javafx.geometry.HPos.RIGHT);
            // Set the ComboBox values
            for (int i = 0; i <= 30; i++) {
                cbYears.getItems().add(i);
            }
        
            
            // Set the primary stage's title
            primaryStage.setTitle("Future Value App");
        
            // Set the scene and show the stage
            Scene scene = new Scene(pane, 600, 450);
            primaryStage.setScene(scene);
            primaryStage.show();

          // FinanceCalculator.calculateFutureValue(calculateResults, calculateResults, calculateResults);
        }
         
         private void clearFormFields() {
            txtMonthlyPayment.setText("");
            txtInterestRate.setText("");
            txtResults.setText("");
            
            lblFutureValueDate.setText("Calculation as of " + getCurrentDate());
            cbYears.setValue(0);
            //btnClear.setOnAction(e -> clearFormFields());
         }
         
         private void calculateResults() {
            double monthlyPayment = Double.parseDouble(txtMonthlyPayment.getText());
            double rate = Double.parseDouble(txtInterestRate.getText());
            int years = cbYears.getValue();
            double futureValue = FinanceCalculator.calculateFutureValue(monthlyPayment, rate, years);
            txtResults.setText("The future value is " + String.format("$%,.2f", futureValue));
           
            lblFutureValueDate.setText("Calculation as of " + getCurrentDate());
            //btnCalculate.setOnAction(e -> calculateResults());
         }

            private String getCurrentDate() {
                SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
                return dateFormat.format(new Date());
            }

           
            

            public static void main(String[] args)
          {

              new EnhancedFutureValueApp();
              Application.launch(args);
              
              
          }

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method actionPerformed'");
                calculateResults();
                clearFormFields();
            }

           


     

    
    



    

       

}

   

    