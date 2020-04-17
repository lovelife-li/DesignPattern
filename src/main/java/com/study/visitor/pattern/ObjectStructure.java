package com.study.visitor.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ldb
 * @date 2020/04/17
 * @description
 */
public class ObjectStructure {
    private List<Element> elements = new ArrayList<>();

    public void attach(Element element){
        elements.add(element);
    }

    public void detach(Element element){
        elements.remove(element);
    }

    public void accept(Visitor visitor){
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
