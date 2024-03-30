package com.cwnu.ui;

import javax.swing.*;
import java.util.Random;

public class GameJFrame extends JFrame {
    //创建一个游戏的主窗口
    //JFrame类是描述界面的
    JFrame gameJframe=new JFrame();
    int[][] number=new int[4][4];
    //构造方法(特殊的成员方法)
    public GameJFrame(){
        //初始化界面
        initJFrame();
        //初始化菜单
        initJMenuBar();
        //设置界面可见,放在最后
        this.setVisible(true);
        //打乱数据
        initData();
        //初始化图片
        initImage();
    }

    private void initData() {
        Random rd=new Random();
        int[] a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};

        for (int i = 0; i < 16; i++) {
            int t= rd.nextInt(16);

            int temp=a[i];
            a[i]=a[t];
            a[t]=temp;
        }

        for (int i = 0; i < 16; i++) {
            number[i/4][i%4]=a[i];
        }
    }

    private void initImage() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int n=number[i][j];
                JLabel jLabel=new JLabel(new ImageIcon("C:\\Users\\86187\\Desktop\\大学\\javaDM\\PuzzleGame\\image\\animal\\animal3\\"+n+".jpg"));
                jLabel.setBounds(110*j,110*i,105,105);
                this.getContentPane().add(jLabel);
            }
        }

       /*
        创建一个图片ImageIcon对象
        ImageIcon icon=new ImageIcon("C:\\Users\\86187\\Desktop\\大学\\javaDM\\PuzzleGame\\image\\animal\\animal3\\1.jpg");
        //创建一个JLabel的对象(管理容器)
        JLabel jLabel1=new JLabel(icon);
        //把管理器添加到界面中
        //this.add(jLabel);
        //指定图片位置
        jLabel1.setBounds(0,0,160,160);
        this.getContentPane().add(jLabel1);*/
    }


    private void initJMenuBar() {
        //创建整个菜单对象
        JMenuBar jMenuBar=new JMenuBar();
        //创建菜单上两个选项
        JMenu functionJMenu=new JMenu("功能");
        JMenu aboutJMenu=new JMenu("关于我们");
        //创建选项下条目
        JMenuItem replayItem=new JMenuItem("重新开始游戏");
        JMenuItem reLoginItem=new JMenuItem("重新登录");
        JMenuItem closeItem=new JMenuItem("关闭游戏");

        //将条目添加到各自的选项中
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //给整个页面设置菜单栏
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //this表示当前调用者的地址值
        this.setSize(500,600);
        //设置标题并置顶
        this.setTitle("拼图游戏");
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认居中放置,只有取消了才会按照XY轴的形式添加到组件
        this.setLayout(null);
    }

}
