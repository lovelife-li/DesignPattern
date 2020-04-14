package com.study.composite.pattern;

import java.util.Collections;

/**
 * @author ldb
 * @date 2020/04/14
 * @description 叶子节点组件
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.println("cannot  add to a leaf");
    }

    @Override
    public void remove(Component c) {
        System.out.println("cannot remove from a leaf");
    }

    @Override
    public void display(int depth) {
        System.out.println(String.join("", Collections.nCopies(depth,"-"))+ name);
    }
}
