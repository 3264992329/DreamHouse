package com.cwnu.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    //登录界面
    public LoginJFrame(){
        this.setSize(400,300);
        //设置标题并置顶
        this.setTitle("拼图-登录");
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setVisible(true);
    }
}
