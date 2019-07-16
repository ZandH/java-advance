package com.hp.week2;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.EventListener;

/**
 * 来自JavaFX的登录应用程序
 *
 * @author 屏儿
 * 2019/07/16
 */
public class LoginApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //创建一个账号的文本对象
        Text accountText = new Text("账号");
        //创建一个密码的文本对象
        Text passwordText = new Text("密码");
        //创建一个输入账号的文本框
        TextField accountField = new TextField();
        //创建一个输入密码的文本框
        PasswordField passwordField = new PasswordField();
        //创建一个登录按钮
        Button loginButton = new Button("登录");
        //创建一个网格布局面板
        GridPane gridPane = new GridPane();
        //设置面板大小
        gridPane.setMaxSize(450, 300);
        //设置面板的内边距
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        //设置垂直间距
        gridPane.setVgap(20);
        //设置水平间距
        gridPane.setHgap(20);
        //设置面板的对齐方式
        gridPane.setAlignment(Pos.CENTER);
        //把定义好的组件依次加入面板，指定其在面板中的行列号
        gridPane.add(accountText, 0, 0);
        gridPane.add(accountField, 1, 0);
        gridPane.add(passwordText, 0, 1);
        gridPane.add(passwordField, 1, 1);
        gridPane.add(loginButton, 1, 2);

        //样式美化代码

        //给面板加背景色
        gridPane.setStyle("-fx-background-color:#d68594  ");
        //给按钮设置背景色，文字颜色
        loginButton.setStyle("-fx-background-color: #e3aab5;-fx-text-fill: #FFFFFF");
        loginButton.setMinSize(100, 40);


        //给登录按钮设置事件，点击了有反应，使用了Java8的Lambda表达式，简化代码
        EventHandler<MouseEvent> eventEventHandler = e -> {
            //获取用户输入的账号
            String accountString = accountField.getText();
            //获取用户输入的密码
            String passwordString = passwordField.getText();
            //判断账号密码是否正确
            if ("huangping".equals(accountString) && "0527".equals(passwordString)){
            //弹出登录成功的对话框
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("信息提示");
            alert.setContentText("恭喜你，登录成功！");
            alert.showAndWait();
        }else {
                //弹出登录失败的对话框
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("错误提示");
                alert.setContentText("登录失败，请重新登录！");
                alert.showAndWait();
            }
        };
        //将事件注册给登录按钮，鼠标单击
        loginButton.addEventFilter(MouseEvent.MOUSE_CLICKED,eventEventHandler);

        //创建一个场景，同时将面板加入场景
        Scene scene = new Scene(gridPane);
        //设置舞台的标题
        primaryStage.setTitle("登录界面");
        //将场景加入舞台
        primaryStage.setScene(scene);
        //设置舞台内容可见
        primaryStage.show();
    }
}
