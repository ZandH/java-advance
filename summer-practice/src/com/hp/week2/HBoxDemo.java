package com.hp.week2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * HBox应用程序
 *
 * @author 屏儿
 * 2019/07/18
 */

public class HBoxDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("HBox 布局练习");
        HBox hBox = new HBox();
        hBox.setSpacing(20);
        hBox.setPadding(new Insets(50, 50, 50, 50));
        for (int i = 1; i <= 10; i++) {
            Button button = new Button("按钮" + i);
            hBox.getChildren().add(button);
        }
        Scene scene = new Scene(hBox, 800, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
