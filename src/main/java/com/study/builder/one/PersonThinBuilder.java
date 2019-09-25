package com.study.builder.one;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.awt.*;

/**
 * @author ldb
 * @date 2019-09-25 11:37
 */
@Data
public class PersonThinBuilder {

    private Graphics g;
    private Color c;

    public void build() {
        g.drawOval(50, 20, 30, 30);
        g.drawRect(60, 50, 10, 50);
        g.drawLine(60, 50, 40, 100);
        g.drawLine(70, 50, 90, 100);
        g.drawLine(60, 100, 45, 150);
        g.drawLine(70, 100, 85, 150);
        System.out.println("画瘦人");
    }

    public PersonThinBuilder(Graphics g, Color c) {
        this.g = g;
        this.c = c;
        g.setColor(c);
    }
}
