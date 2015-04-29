/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setthestage;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Pinal
 */
public class SetTheStage extends Application {
    
    private int num;
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("CLICK ME!");
        btn.setPrefSize(primaryStage.getMaxWidth(),50.0);
        
        Label update = new Label();
        update.setText("Click Count: " + num);
        
        
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                num++;
                update.setText("Click Count: " + num);
            }
        });
        
        BorderPane root = new BorderPane();
        root.setBottom(btn);
        root.setCenter(update);
        
        Scene scene = new Scene(root, 900, 250);
       
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.initStyle(StageStyle.UTILITY);  // This method changes the window border style
        primaryStage.setOpacity(0.6);
        primaryStage.show();
         
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
