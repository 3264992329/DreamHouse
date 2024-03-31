package Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyJFrame extends JFrame implements ActionListener {
    JFrame jFrame=new JFrame();
    JButton jbt1=new JButton("点击我呀");
    JButton jbt2=new JButton("点击我呀");

    public MyJFrame(){
        initJFrame();
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

        //jbt1
        jbt1.setBounds(0,0,105,105);
        jbt1.addActionListener(this);
        //jbt2
        jbt2.setBounds(200,200,105,105);
        jbt2.addActionListener(this);

        add(jbt1);
        add(jbt2);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source=e.getSource();
        if(source==jbt1){
            jbt1.setSize(210,210);
        }else if(source==jbt2){
            Random rd=new Random();
            jbt2.setLocation(rd.nextInt(500),rd.nextInt(500));
        }
    }
}
