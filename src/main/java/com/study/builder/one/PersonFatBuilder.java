package com.study.builder.one;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.awt.*;

/**
 * @author ldb
 * @date 2019-09-25 11:37
 */
@Data
public class PersonFatBuilder {

    private Graphics g;
    private Color c;

    public void build() {
        g.drawOval(50, 20, 30, 30);
        g.drawOval(45, 50, 40, 50);
        g.drawLine(50, 50, 30, 100);
        g.drawLine(80, 50, 100, 100);
        g.drawLine(60, 100, 45, 150);
        g.drawLine(70, 100, 85, 150);
        System.out.println("画胖人");
    }

    public PersonFatBuilder(Graphics g, Color c) {
        this.g = g;
        this.c = c;
        g.setColor(c);
    }
}
