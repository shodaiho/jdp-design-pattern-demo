package com.jiangdp.pattern.abstractfactory;

/**
 * DellComputerFactory
 * <p>
 * Created by morningrain on 2019/7/1.
 */
public class DellComputerFactory implements ComputerFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public KeyBoard createKeyBoard() {
        return new DellKeyBoard();
    }
}
