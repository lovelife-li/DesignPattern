package com.study.builder.one;

import com.study.builder.two.PersonBuilder;

import javax.swing.*;
import java.awt.*;

/**
 * @author ldb
 * @date 2019-09-25 11:46
 */
public class Start1 extends JFrame {
    JPanel jp;

    public static void main(String[] args) {

        Start1 start1 = new Start1();


    }

    public Start1() {
        jp = new JPanel(){
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                new PersonThinBuilder(g, Color.red).build();
            }
        };
        this.add(jp);

        this.setTitle("画图");
        this.setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


}
