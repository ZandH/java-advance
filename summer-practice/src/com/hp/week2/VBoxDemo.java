package com.hp.week2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.util.Random;

/**
 * VBox应用程序
 *
 * @author 屏儿
 * 2019/07/18
 */

public class VBoxDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("VBox布局练习");
        VBox vBox = new VBox();
        vBox.setSpacing(20);
        vBox.setPadding(new Insets(50, 50, 50, 50));
        vBox.setStyle("-fx-background-color: #886BE");
        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            //随机生成100以内标签号
            Label label = new Label(random.nextInt(100) + "号标签");
            label.setMinSize(80,30);
            label.setStyle("-fx-background-color:  #BA3F93;-fx-text-fill: #FFFFFF;-fx-font-size: 14px");
            vBox.getChildren().add(label);
        }
        Label label = new Label("廿七");
        label.setStyle("-fx-font-size: 16px;-fx-text-fill: #6C2756");
        vBox.getChildren().add(label);
        Scene scene = new Scene(vBox, 500, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
