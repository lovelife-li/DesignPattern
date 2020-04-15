package com.study.chainofresponsibility.one;

import lombok.Data;

/**
 * @author ldb;
 * @date 2020/4/15
 * @description 申请
 */
@Data
public class Request {
    //申请类别
    private String requestType;

    //申请内容
    private String requestContent;

    //数量
    private int number;

}