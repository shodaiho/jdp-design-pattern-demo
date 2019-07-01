package com.jiangdp.pattern.factory;

/**
 * HpMouseFactory
 * <p>
 * Created by morningrain on 2019/7/1.
 */
public class HpMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }

}
