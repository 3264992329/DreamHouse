package com.cwnu.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class LoginJFrame extends JFrame implements ActionListener {
        User user1=new User("3264992329","1234546789");
        User user2=new User("2475727744","1234546789");

    JButton jButton2=new JButton(new ImageIcon("PuzzleGame\\image\\login\\登录按钮.png"));
    JButton jButton1=new JButton(new ImageIcon("PuzzleGame\\image\\login\\注册按钮.png"));
    JTextField uerName=new JTextField();
    JTextField passName=new JTextField();
    //登录界面
    public LoginJFrame(){
        this.setSize(500,500);
        //设置标题并置顶
        this.setTitle("拼图-登录");
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //账号
        JLabel jLabel1=new JLabel(new ImageIcon("PuzzleGame\\image\\login\\用户名.png"));
        jLabel1.setBounds(115,150,50,30);
        this.getContentPane().add(jLabel1);

        uerName.setBounds(175,150,200,30);
        this.getContentPane().add(uerName);

        //密码
        JLabel jLabel3=new JLabel(new ImageIcon("PuzzleGame\\image\\login\\密码.png"));
        jLabel3.setBounds(115,190,50,30);
        this.getContentPane().add(jLabel3);

        passName.setBounds(175,190,200,30);
        this.getContentPane().add(passName);

        //验证码
        JLabel jLabel6=new JLabel(new ImageIcon("PuzzleGame\\image\\login\\验证码.png"));
        jLabel6.setBounds(115,230,50,30);
        this.getContentPane().add(jLabel6);
        //输入验证码
        JTextField jTextField1=new JTextField();
        jTextField1.setBounds(229,230,80,30);
        this.getContentPane().add(jTextField1);
        //随机的验证码
        JLabel jLabel7=new JLabel("51651");
        jLabel7.setBounds(320,230,55,30);
        this.getContentPane().add(jLabel7);

        //登录按钮
        jButton2.setBounds(110,300,130,50);
        this.getContentPane().add(jButton2);

        //注册按钮
        jButton1.setBounds(249,300,130,50);
        this.getContentPane().add(jButton1);
        //添加背景
        JLabel jLabel2=new JLabel(new ImageIcon("PuzzleGame\\image\\login\\background.png"));
        jLabel2.setBounds(0,0,470,390);
        this.getContentPane().add(jLabel2);
        this.setVisible(true);

        jButton1.addActionListener(this);
        jButton2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source=e.getSource();
        //注册1,登录2
        if (source==jButton1){
            //关闭页面
            this.setVisible(false);
            //打开注册界面
            new RegisterJFrame();
        } else if (source==jButton2) {
            String getUsername1=uerName.toString();
            String getPassword1=passName.toString();
            if (getUsername1.equals(user1.getUsername())&&getPassword1.equals(user2.getPassword())){
                //密码账户正确,关闭登录界面
                this.setVisible(false);
                //打开游戏界面
                new GameJFrame();
            }
        }
    }
}
