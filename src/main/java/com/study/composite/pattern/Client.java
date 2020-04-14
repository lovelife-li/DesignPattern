package com.study.composite.pattern;

/**
 * @author ldb
 * @date 2020/04/14
 * @description 客户端
 */
public class Client {
    public static void main(String[] args) {
        Component root = new Composite("root");
        root.add(new Leaf("leaf A"));
        root.add(new Leaf("leaf B"));

        Composite comp = new Composite("composite X");
        comp.add(new Leaf("leaf XA"));
        comp.add(new Leaf("leaf XB"));
        root.add(comp);

        Composite comp2 = new Composite("composite XY");
        comp2.add(new Leaf("leaf XYA"));
        comp2.add(new Leaf("leaf XYB"));
        comp.add(comp2);
        root.add(new Leaf("leaf C"));

        Leaf leaf = new Leaf("leaf D");
        root.add(leaf);
        root.remove(leaf);
        root.display(1);
    }
}
