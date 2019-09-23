package com.study;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ldb
 * @date 2019-09-20 16:40
 */
public class Test {


    public static void main(String[] args) {


        ArrayList<String> a1 = new ArrayList<>();
        a1.add("abc");
        a1.add("def");
        ArrayList<List<String>> a2 = new ArrayList<>();
        a2.add(a1);
        ArrayList<List<String>> a3 = new ArrayList<>();
        a3.add(a1);

        List<List<List<String>>> lists = new ArrayList<>();
        lists.add(a2);
        lists.add(a3);
        testFor(lists);


    }

    public static void testFor(List lists){

        if (lists.size()>0  && !(lists.get(0) instanceof List)){
            lists.forEach(System.out::println);
        }else {
            for (Object o : lists){
                testFor((List) o);
            }
        }
    }
}
