package com.hp.week2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * 我的第一个JavaFX应用程序
 *
 * @author 屏儿
 * 2019/07/18
 */
public class MyFxApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("My First JavaFX Application");
        Label label = new Label("My First JavaFX Application");
        Scene scene = new Scene(label, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
