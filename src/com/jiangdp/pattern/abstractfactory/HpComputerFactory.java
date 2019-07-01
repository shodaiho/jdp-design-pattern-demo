package com.jiangdp.pattern.abstractfactory;

/**
 * MouseFactory
 * <p>
 * Created by morningrain on 2019/7/1.
 */
public class HpComputerFactory implements ComputerFactory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    public KeyBoard createKeyBoard() {
        return new HpKeyBoard();
    }
}
