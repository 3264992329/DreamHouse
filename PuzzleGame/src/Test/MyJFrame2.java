package Test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyJFrame2 extends JFrame implements KeyListener {
    public MyJFrame2(){
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

        this.addKeyListener(this);

        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("按下");
        int code=e.getKeyCode();
        if (code==65){
            System.out.println("A");
        }else if(code==65){
            System.out.println("B");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("松开");
    }
}
