package com.jmc.javafxmasteryclass;

import javafx.application.Application;
import javafx.event.Event;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);

        Label label = new Label("This is label");
        Button button = new Button("Click");

        root.getChildren().addAll(label, button);

        // button.setOnAction(actionEvent -> label.setText("Text after pressing enter"));
        button.addEventFilter(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
            System.out.println("Event at button");
            label.setText("New Text");
        });
        // event dispatch chain stage -> scene -> root -> button
        root.addEventFilter(MouseEvent.MOUSE_CLICKED, mouseEvent -> System.out.println("Event at the root"));

        Scene scene = new Scene(root, 500, 500);
        scene.setOnKeyPressed(keyEvent -> label.setText("Key: " + keyEvent.getText()));
        // scene.setOnMouseMoved(mouseEvent -> label.setText("X: " + mouseEvent.getX()));

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
