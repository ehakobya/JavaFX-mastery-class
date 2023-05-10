package com.jmc.javafxmasteryclass;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // used for series of objects (e.g. pictures) that are displayed next to each other
        FlowPane flowPane = new FlowPane();
        flowPane.setOrientation(Orientation.VERTICAL);
        flowPane.setHgap(30);
        flowPane.setVgap(10);
        // flowPane.setRowValignment(VPos.BOTTOM);
        flowPane.setColumnHalignment(HPos.RIGHT);

        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        Button b3 = new Button("Button 3");
        TextArea textArea = new TextArea();
        Button b4 = new Button("Button 4");
        Button b5 = new Button("Button 5");
        Button b6 = new Button("Button 6");

        flowPane.getChildren().addAll(b1, b2, b3, textArea, b4, b5, b6);

        Scene scene = new Scene(flowPane, 500, 450);

        stage.setScene(scene);
        stage.setTitle("Flow Pane Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}