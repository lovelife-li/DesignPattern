package com.study.shared.three;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ldb
 * @date 2020/04/15
 * @description 网站工厂类
 */
public class WebSiteFactory {
    private Map<String, WebSite> flyweights = new HashMap<>();

    /**
     * 获得网站分类
     *
     * @param key
     * @return
     */
    public WebSite getWebSiteCategory(String key) {
        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new ConcreteWebSite(key));
        }
        return flyweights.get(key);
    }

    /**
     * 获得网站分类总数
      * @return
     */
    public int getWebSiteCoutn(){
        return flyweights.size();
    }
}
