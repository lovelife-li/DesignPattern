package com.study.builder.two;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.awt.*;

/**
 * @author ldb
 * @date 2019-09-25 13:56
 */
public class PersonThinBuilder extends PersonBuilder {

    public PersonThinBuilder(Graphics g, Color c) {
        super(g, c);
    }

    @Override
    public void buildHead() {
        g.drawOval(50, 20, 30, 30);
    }

    @Override
    public void buildBody() {
        g.drawRect(60, 50, 10, 50);
    }

    @Override
    public void buildArmLeft() {
        g.drawLine(60, 50, 40, 100);
    }

    @Override
    public void buildArmRight() {
        g.drawLine(70, 50, 90, 100);

    }

    @Override
    public void buildLegLeft() {
        g.drawLine(60, 100, 45, 150);

    }

    @Override
    public void buildLegRight() {
        g.drawLine(70, 100, 85, 150);

    }
}
