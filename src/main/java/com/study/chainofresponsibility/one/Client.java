package com.study.chainofresponsibility.one;

/**
 * @author ldb
 * @date 2020/04/15
 * @description 客户端
 */
public class Client {
    public static void main(String[] args) {
        Manager jinli = new Manager("金利");
        Manager zongjian = new Manager("忠建");
        Manager zhongjingli = new Manager("钟经理");

        Request request = new Request();
        request.setRequestType("加薪");
        request.setRequestContent("小米请求加薪");
        request.setNumber(1000);

        jinli.getResult("经理", request);
        zongjian.getResult("总监", request);
        zhongjingli.getResult("总经理", request);

        Request request2 = new Request();
        request2.setRequestType("请假");
        request2.setRequestContent("小米请假");
        request2.setNumber(3);

        jinli.getResult("经理", request2);
        zongjian.getResult("总监", request2);
        zhongjingli.getResult("总经理", request2);
    }
}
