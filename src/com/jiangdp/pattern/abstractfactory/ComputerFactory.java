package com.jiangdp.pattern.abstractfactory;

/**
 * ComputerFactory
 * <p>
 * Created by morningrain on 2019/7/1.
 */
public interface ComputerFactory {
    Mouse createMouse();

    KeyBoard createKeyBoard();
}
