/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Cameron Cross
 */
public class Part1 extends Application
{
    private ImageView resultImage;
    private Image flag;
    
    @Override
    public void start(Stage primaryStage)
    {
        Label promptLabel = new Label("Select Button to Display a Flag");
        
        Button btnAmer = new Button("American Flag");
        btnAmer.setMaxWidth(92);
        
        Button btnCana = new Button("Canadan Flag");
        btnCana.setMaxWidth(92);
        
        Button btnFran = new Button("French Flag");
        btnFran.setMaxWidth(92);
        
        Button btnGerm = new Button("German Flag");
        btnGerm.setMaxWidth(92);
        
        Button btnMexi = new Button("Mexican Flag");
        btnMexi.setMaxWidth(92);
        
        resultImage = new ImageView();
        
        resultImage.setFitWidth(320);
        resultImage.setFitHeight(183);
        
        btnAmer.setOnAction(new EventHandler<ActionEvent>()
        {
            
            @Override
            public void handle(ActionEvent event)
            {
                flag = new Image("file:America.png");
                resultImage.setImage(flag);
            }
        });
        
        btnCana.setOnAction(new EventHandler<ActionEvent>()
        {
            
            @Override
            public void handle(ActionEvent event)
            {
                flag = new Image("file:Canada.png");
                resultImage.setImage(flag);
            }
        });
        
        btnFran.setOnAction(new EventHandler<ActionEvent>()
        {
            
            @Override
            public void handle(ActionEvent event)
            {
                flag = new Image("file:France.png");
                resultImage.setImage(flag);
            }
        });
        
        btnGerm.setOnAction(new EventHandler<ActionEvent>()
        {
            
            @Override
            public void handle(ActionEvent event)
            {
                flag = new Image("file:German.png");
                resultImage.setImage(flag);
            }
        });
        
        btnMexi.setOnAction(new EventHandler<ActionEvent>()
        {
            
            @Override
            public void handle(ActionEvent event)
            {
                flag = new Image("file:Mexico.png");
                resultImage.setImage(flag);
            }
        });
        
        VBox vbox = new VBox(10, promptLabel, resultImage, btnAmer, btnCana, 
                btnFran, btnGerm, btnMexi);
        
        
        
        vbox.setPadding(new Insets(10));
        vbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vbox, 500, 450);
        
        primaryStage.setTitle("Part 1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    class AmerButtonHandler implements EventHandler<ActionEvent>
    {   
        @Override
        public void handle(ActionEvent event)
        {
            resultImage = new ImageView("file:America.png");
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
