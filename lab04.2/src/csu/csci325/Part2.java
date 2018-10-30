/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

import java.util.ArrayList;
import java.util.Collections;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Cameron Cross
 */
public class Part2 extends Application
{
    private TextField dataTextField;
    private Label resultMean;
    private Label resultMedian;
    private Label resultMode;
    private ArrayList<Double> meanArray;
    private ArrayList<Double> medArray;
    private ArrayList<Double> modeArray;
    private CalcMeanBtnHandler meanHandler;
    private CalcMedBtnHandler medHandler;
    private CalcModeBtnHandler modeHandler;
    
    @Override
    public void start(Stage primaryStage)
    {
        Button calcMeanBtn = new Button("Calculate Mean");
        Button calcMedBtn = new Button("Calculate Median");
        Button calcModeBtn = new Button("Calculate Mode");
        Button calcAllBtn = new Button("Calculate Mean, Median, and, Mode");
        Button closeBtn = new Button("Close");
        meanArray = new ArrayList<>();
        medArray = new ArrayList<>();
        modeArray = new ArrayList<>();
        
        resultMean = new Label();
        resultMedian = new Label();
        resultMode = new Label();
        
        meanHandler = new CalcMeanBtnHandler();
        medHandler = new CalcMedBtnHandler();
        modeHandler = new CalcModeBtnHandler();
        
        calcMeanBtn.setOnAction(meanHandler);
        calcMedBtn.setOnAction(medHandler);
        calcModeBtn.setOnAction(modeHandler);
        
        calcAllBtn.setOnAction(new CalcAllHandler());
        
        closeBtn.setOnAction(actionEvent -> Platform.exit());
        
        Label promptLabel = new Label("Enter your data seperated by a comma, "
                + "then select function to perform." + "\nEx: 12, 4,7, 32,3");
        
        Label dataLabel = new Label("Data:");
        
        dataTextField = new TextField();
        
        HBox hbox1 = new HBox(10, dataLabel, dataTextField, calcMeanBtn, 
                calcMedBtn, calcModeBtn);
        
        HBox hbox2 = new HBox(10, calcAllBtn, closeBtn);
        
        VBox vbox = new VBox(promptLabel, hbox1, hbox2, resultMean, 
                resultMedian, resultMode);
        
        hbox1.setPadding(new Insets(5));
        hbox1.setAlignment(Pos.CENTER);
        hbox2.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(10));
        vbox.setAlignment(Pos.CENTER);
        
        
        Scene scene = new Scene(vbox, 600, 300);
        
        primaryStage.setTitle("Part 2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    class CalcMeanBtnHandler implements EventHandler<ActionEvent>
    {
        double mean;
        double sum = 0;
        @Override
        public void handle(ActionEvent event)
        {
            String[] string = dataTextField.getText().split(",");
            
            for (int i = 0; i < string.length; i++)
            {
                string[i] = string[i].trim();
                meanArray.add(i, Double.parseDouble(string[i]));
                sum += meanArray.get(i);
            }
            mean = sum / meanArray.size();
            resultMean.setText(String.format("Mean: %,.1f", mean));
        }
    }
    
    class CalcMedBtnHandler implements EventHandler<ActionEvent>
    {
        double median;
        @Override
        public void handle(ActionEvent event)
        {
            String[] string = dataTextField.getText().split(",");
            
            for (int i = 0; i < string.length; i++)
            {
                string[i] = string[i].trim();
                medArray.add(i, Double.parseDouble(string[i]));
            }
            Collections.sort(medArray);
            
            if (medArray.size() % 2 == 0)
            {
                median = (((double)medArray.get(medArray.size()/2) + 
                        (double)medArray.get(medArray.size()/2 - 1))/2);
            }
            else
            {
                median = ((double)medArray.get(medArray.size()/2));
            }
            resultMedian.setText(String.format("Median: %,.1f", median));
        }
    }
    
    class CalcModeBtnHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event)
        {
            String[] string = dataTextField.getText().split(",");
            
            for (int i = 0; i < string.length; i++)
            {
                string[i] = string[i].trim();
                modeArray.add(i, Double.parseDouble(string[i]));
            }
            Collections.sort(modeArray);
            
            double mode = modeArray.get(0);
            int maxCount = 0;
            for (int i = 0; i < modeArray.size(); i++)
            {
                double value = modeArray.get(i);
                int count = 1;
                for (int j = 0; j < modeArray.size(); j++)
                {
                    if (modeArray.get(j) == value) count++;
                    if (count > maxCount)
                    {
                        mode = value;
                        maxCount = count;
                    }
                }
            }
            resultMode.setText(String.format("Mode: %,.1f", mode));
        }
    }
    
    class CalcAllHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event)
        {
            meanHandler.handle(event);
            medHandler.handle(event);
            modeHandler.handle(event);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }
    
}
