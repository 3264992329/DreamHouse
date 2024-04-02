package com.cwnu.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    //创建一个游戏的主窗口
    //JFrame类是描述界面的
    JFrame gameJframe=new JFrame();
    int[][] number=new int[4][4];
    int[][] right=new int[][]{
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };
    //用于记录空白方块的地址值
    int x;
    int y;
    //记录步数
    int step=0;
    //0是动物,1是女孩,默认动物
    int select=0;
    //第几种图片,默认1
    int sum=1;
    Random rd=new Random();
    String girlPath="PuzzleGame\\image\\girl\\girl";
    String animalPath="PuzzleGame\\image\\animal\\animal";

    //创建选项下条目
    JMenuItem replayItem=new JMenuItem("重新开始游戏");
    JMenuItem reLoginItem=new JMenuItem("重新登录");
    JMenuItem closeItem=new JMenuItem("关闭游戏");
    JMenuItem accountItem=new JMenuItem("二维码");

    //构造方法(特殊的成员方法)
    public GameJFrame(){
        //初始化界面
        initJFrame();
        //初始化菜单
        initJMenuBar();

        //打乱数据
        initData();
        //初始化图片
        initImage();

        //设置界面可见,放在最后
        this.setVisible(true);
    }

    private void initData() {
        Random rd=new Random();
        int[] a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0};

        for (int i = 0; i < 16; i++) {
            int t= rd.nextInt(16);

            int temp=a[i];
            a[i]=a[t];
            a[t]=temp;
        }

        for (int i = 0; i < 16; i++) {
            if(a[i]==0){
                x=i/4;
                y=i%4;
            }
            number[i/4][i%4]=a[i];
        }
    }

    private void initImage() {
        //清空原有图片
        this.getContentPane().removeAll();

        //判断是否完成拼图
        boolean result=victory();
        if(result){
            JLabel win=new JLabel(new ImageIcon("PuzzleGame\\image\\win.png"));
            win.setBounds(160,250,197,137);
            this.getContentPane().add(win);
        }

        JLabel stepT=new JLabel("步数位:"+step);
        stepT.setBounds(50,20,100,20);
        this.getContentPane().add(stepT);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int n=number[i][j];
                if (select == 0) {
                    JLabel jLabel=new JLabel(new ImageIcon(animalPath+sum+"\\"+n+".jpg"));
                    jLabel.setBounds(105*j+35,105*i+108,115,125);
                    //设置图片边框
                    //jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                    this.getContentPane().add(jLabel);
                } else if (select==1) {
                    JLabel jLabel=new JLabel(new ImageIcon(girlPath+sum+"\\"+n+".jpg"));
                    jLabel.setBounds(105*j+35,105*i+108,115,125);
                    //设置图片边框
                    //jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                    this.getContentPane().add(jLabel);
                }
            }
        }
        //添加背景
        JLabel JB=new JLabel(new ImageIcon("PuzzleGame\\image\\background.png"));
        JB.setBounds(20,20,458,560);
        this.getContentPane().add(JB);

        this.addKeyListener(this);

        //加载现有图片
        this.getContentPane().repaint();
    }


    private void initJMenuBar() {
        //创建整个菜单对象
        JMenuBar jMenuBar=new JMenuBar();
        //创建菜单上两个选项
        JMenu functionJMenu=new JMenu("功能");
        JMenu aboutJMenu=new JMenu("关于我们");

        //将条目添加到各自的选项中
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //给整个页面设置菜单栏
        this.setJMenuBar(jMenuBar);

        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);
    }

    private void initJFrame() {
        //this表示当前调用者的地址值
        this.setSize(500,650);
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

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code=e.getKeyCode();
        if (code==65){
            this.getContentPane().removeAll();
            //重新加载完整图片
            JLabel jLabel1=new JLabel(new ImageIcon("PuzzleGame\\image\\animal\\animal3\\all.jpg"));
            jLabel1.setBounds(35,108,420,420);
            this.getContentPane().add(jLabel1);
            //重新加载背景图片
            JLabel jLabel2=new JLabel(new ImageIcon("PuzzleGame\\image\\background.png"));
            jLabel2.setBounds(20,20,458,560);
            this.getContentPane().add(jLabel2);
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (victory()){
            return;
        }
        int code=e.getKeyCode();

        if (code==37){
            System.out.println("向左移动");
            if (y==3){
                return;
            }
            number[x][y]=number[x][y+1];
            number[x][y+1]=0;
            y++;
            initImage();
            ++step;
        }else if (code==38){
            System.out.println("向上移动");
            if(x==3){
                return;
            }

            number[x][y]=number[x+1][y];
            number[x+1][y]=0;
            x++;
            initImage();
            ++step;
        }else if (code==39){
            System.out.println("向右移动");
            if (y==0){
                return;
            }

            number[x][y]=number[x][y-1];
            number[x][y-1]=0;
            y--;
            initImage();
            ++step;
        }else if (code==40){
            System.out.println("向下移动");
            if(x==0){
                return;
            }

            number[x][y]=number[x-1][y];
            number[x-1][y]=0;
            x--;
            initImage();
            ++step;
        }else if(code==65){
            initImage();
        } else if (code==87) {
            number=new int[][]{
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,0}
            };
            x=3;
            y=3;
            initImage();
        }
    }

    public boolean victory(){
        for (int i = 0; i < 15; i++) {
            if(number[i/4][i%4]!=right[i/4][i%4]){
                return false;
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source=e.getSource();
        if (source==replayItem){
            System.out.println("重新开始游戏");
            step=0;
            select=rd.nextInt(2);
            sum=rd.nextInt(8)+1;
            initData();
            initImage();
        } else if (source==reLoginItem) {
            System.out.println("重新登录");
            //关闭游戏界面
            this.setVisible(false);
            //打开登录界面
            new LoginJFrame();
        } else if (source==closeItem) {
            System.out.println("关闭游戏");
            //直接退出虚拟机即可
            System.exit(0);
        } else if (source==accountItem) {
            System.out.println("查看二维码");
            //创建一个弹窗对象
            JDialog jDialog=new JDialog();
            JLabel jLabel=new JLabel(new ImageIcon("PuzzleGame\\image\\about.png"));
            jLabel.setBounds(0,0,258,258);
            jDialog.getContentPane().add(jLabel);
            jDialog.setSize(344,344);
            //弹窗居中
            jDialog.setAlwaysOnTop(true);
            //弹窗置顶
            jDialog.setLocationRelativeTo(null);
            //弹窗不关闭不能进行下面操作
            jDialog.setModal(true);
            //让弹窗显示
            jDialog.setVisible(true);
        }
    }
}
