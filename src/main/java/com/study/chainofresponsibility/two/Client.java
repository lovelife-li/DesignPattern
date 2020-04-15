package com.study.chainofresponsibility.two;


/**
 * @author ldb
 * @date 2020/04/15
 * @description 客户端
 */
public class Client {
    public static void main(String[] args) {
        Manager jinli = new CommonManager("金利");
        Manager zongjian = new Majordomo("忠建");
        Manager zhongjingli = new GeneralManager("钟经理");
        jinli.setSuperior(zongjian);
        zongjian.setSuperior(zhongjingli);

        Request request = new Request();
        request.setRequestType("加薪");
        request.setRequestContent("小米请求加薪");
        request.setNumber(500);
        jinli.requestAppications(request);


        Request request2 = new Request();
        request2.setRequestType("请假");
        request2.setRequestContent("小米请假");
        request2.setNumber(4);
        jinli.requestAppications(request2);

    }
}
