package com.jiangdp.pattern.abstractfactory;

/**
 * DellMouse
 * <p>
 * Created by morningrain on 2019/7/1.
 */
public class DellMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Dell Mouse Click");
    }
}
