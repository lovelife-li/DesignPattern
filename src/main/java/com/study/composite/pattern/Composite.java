package com.study.composite.pattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author ldb
 * @date 2020/04/14
 * @description 枝节点
 */
public class Composite extends Component {

    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        System.out.println(String.join("", Collections.nCopies(depth,"-"))+ name);
        for (Component component : children) {
            component.display(depth + 2);
        }
    }
}
