package com.study.builder.two;

import javax.swing.*;
import java.awt.*;

/**
 * @author ldb
 * @date 2019-09-25 11:46
 */
public class Start2 extends JFrame {
    JPanel jp;

    public static void main(String[] args) {

        Start2 start1 = new Start2();


    }

    public Start2() {
        jp = new JPanel(){
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                new PersonDirector(new PersonFatBuilder(g,Color.red)).createPerson();
                new PersonDirector(new PersonThinBuilder(g,Color.red)).createPerson();
            }
        };
        this.add(jp);

        this.setTitle("画图");
        this.setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


}
