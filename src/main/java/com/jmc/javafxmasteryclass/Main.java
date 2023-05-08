package com.jmc.javafxmasteryclass;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);
        
        Label label = new Label("Welcome");
        TextField field = new TextField();
        TextField field1 = new TextField();
        field.setMaxWidth(200);
        field1.setMaxWidth(300);

        root.getChildren().addAll(label, field, field1);

        field1.textProperty().bindBidirectional(field.textProperty());

        label.textProperty().bind(field.textProperty());

//        field.textProperty().addListener((o, oldVal, newVal) -> {
//            label.setText(newVal);
//        });

        Scene scene = new Scene(root, 550, 500);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
