package com.study.bridge.four;

import lombok.Setter;

/**
 * @author ldb
 * @date 2020/04/14
 * @description 手机品牌
 */
@Setter
public abstract class HandsetBrand {

    protected HandsetSoft handsetSoft;

    public abstract void run();
}
