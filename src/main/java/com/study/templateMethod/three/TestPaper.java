package com.study.templateMethod.three;

/**
 * @author ldb
 * @date 2019-09-24 16:21
 */
public abstract class TestPaper {
    //试题1
    public void testQuestionl(){
        System.out.println("杨过得到，后来给了郭靖，炼成倚天剑、屠龙刀的玄铁可能是[]\r\n  a.球磨铸铁b.马口铁c.高速合金钢d.碳素纤维");
        System.out.println("答案："+answer1());
    }

    protected abstract String answer1();
    protected abstract String answer2();
    protected abstract String answer3();


    //试题2
    public void testQuestion2(){
        System.out.println("杨过、程英、陆无双铲除了情花，造成[]\r\na.使这种植物不再害人b.使一种珍稀物种灭绝c.破坏了那个生物圈的生态平衡d.造成该地区沙漠化");
        System.out.println("答案："+answer2());
    }


    //试题3
    public void testQuestion3(){
        System.out.println("蓝凤凰致使华山师徒、桃谷六仙呕吐不止，如果你是大夫，会给他们开什么药[]\r\na.阿司匹林b.牛黄解毒片c.氟哌酸d.让他们喝大量的生牛奶e.以上全不对");
        System.out.println("答案："+answer3());
    }
}
