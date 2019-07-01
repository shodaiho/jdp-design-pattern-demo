package com.jiangdp.pattern.factory;

/**
 * MainDemo
 * <p>
 * Created by morningrain on 2019/7/1.
 */
public class MainDemo {

    public static void main(String[] args) {
        MouseFactory dellMouseFactory = new DellMouseFactory();
        Mouse dellMouse = dellMouseFactory.createMouse();
        dellMouse.click();

        MouseFactory hpMouseFactory = new HpMouseFactory();
        Mouse hpMouse = hpMouseFactory.createMouse();
        hpMouse.click();
    }
}
