package day1111;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Created by Intellij IDEA.
 * User: 10579.
 * Date: 2017/11/12.
 * Time: 9:55.
 */
public class Calculator {
    //定义组件
    private JFrame frame;
    private JTextField field;//文本框
    private JButton clearButton;
    private JButton [] allButton;

    //创建组件
    public Calculator(){

        frame=new JFrame("计算器");
        field=new JTextField("0",19);
        clearButton=new JButton("c");
        String s="123+456-789*0.=/";
        allButton=new JButton[s.length()];
        for(int i=0;i<s.length();i++){
            allButton[i]=new JButton(s.charAt(i)+"");
        }

    }
    //组件布局
    private void init(){
        field.setLayout(new BorderLayout(3,3));
        JPanel northPanel=new JPanel();
        JPanel centerPanel = new JPanel();

        northPanel.setLayout(new FlowLayout());
        centerPanel.setLayout(new GridLayout(4,4,6,6));

        northPanel.add(field);
        northPanel.add(clearButton);

        for(int i=0;i<allButton.length;i++){
            centerPanel.add(allButton[i]);
        }
        frame.add(northPanel,BorderLayout.NORTH);
        frame.add(centerPanel);


    }

    //设置样式
    private void setStyle(){
        Font font=new Font("Courier New",Font.BOLD+Font.PLAIN,16);
        clearButton.setFont(font);
        for (int i=0;i<allButton.length;i++){
            allButton[i].setFont(font);
        }
        field.setBackground(Color.white);//背景色
        field.setForeground(new Color(0,0,0));
        field.setHorizontalAlignment(JTextField.RIGHT);
        field.setEditable(false);
        frame.setResizable(false);

    }

    //显示组件
    public void show(){
        init();
        setStyle();
        frame.setSize(280,180);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    //创建运行
    public static void main(String[] args) {
        new Calculator().show();
    }
}
