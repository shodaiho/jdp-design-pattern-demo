package com.jiangdp.pattern.factory;

/**
 * DellMouseFactory
 * <p>
 * Created by morningrain on 2019/7/1.
 */
public class DellMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }
}
