package com.jmc.javafxmasteryclass;

import javafx.application.Application;
//import javafx.beans.property.ReadOnlyIntegerProperty;
//import javafx.beans.property.ReadOnlyIntegerWrapper;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
//        ReadOnlyIntegerWrapper numWrapper = new ReadOnlyIntegerWrapper(100);
//        ReadOnlyIntegerProperty num = numWrapper.getReadOnlyProperty();
//        System.out.println("numWrapper: " + numWrapper.get());
//        System.out.println("num: " + num.get());
//
//        numWrapper.set(200);
//        System.out.println("numWrapper: " + numWrapper.get());
//        System.out.println("num: " + num.get());

        Constant constant = new Constant(100);
        constant.changeConstant();
        System.out.println(constant.getReadOnlyNumber().get());

    }

    public static void main(String[] args) {
        launch();
    }
}
