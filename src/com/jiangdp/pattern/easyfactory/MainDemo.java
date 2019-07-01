package com.jiangdp.pattern.easyfactory;

/**
 * MainDemo
 * <p>
 * Created by morningrain on 2019/7/1.
 */
public class MainDemo {

    public static void main(String[] args) {
        MouseFactory mouseFactory = new MouseFactory();
        Mouse hpMouse = mouseFactory.createMouse("HP");
        hpMouse.click();

        Mouse dellMouse = mouseFactory.createMouse("DELL");
        dellMouse.click();
    }
}
