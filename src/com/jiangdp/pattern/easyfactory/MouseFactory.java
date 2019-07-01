package com.jiangdp.pattern.easyfactory;

/**
 * MouseFactory
 * <p>
 * Created by morningrain on 2019/7/1.
 */
public class MouseFactory {

    public Mouse createMouse(String factory) {
        if (factory.equalsIgnoreCase("HP")) {
            return new HpMouse();
        } else if (factory.equalsIgnoreCase("DELL")) {
            return new DellMouse();
        }
        return null;
    }
}
