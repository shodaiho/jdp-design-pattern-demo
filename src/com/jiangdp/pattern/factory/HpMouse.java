package com.jiangdp.pattern.factory;

/**
 * HpMouse
 * <p>
 * Created by morningrain on 2019/7/1.
 */
public class HpMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Hp Mouse click");
    }
}
