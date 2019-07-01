package com.jiangdp.pattern.abstractfactory;

/**
 * MainDemo
 * <p>
 * Created by morningrain on 2019/7/1.
 */
public class MainDemo {

    public static void main(String[] args) {
        ComputerFactory hpComputerFactory = new HpComputerFactory();
        Mouse hpMouse = hpComputerFactory.createMouse();
        KeyBoard hpKeyBoard = hpComputerFactory.createKeyBoard();
        hpMouse.click();
        hpKeyBoard.enterKey();

        ComputerFactory dellComputerFactory = new DellComputerFactory();
        Mouse dellMouse = dellComputerFactory.createMouse();
        KeyBoard dellKeyMouse = dellComputerFactory.createKeyBoard();
        dellMouse.click();
        dellKeyMouse.enterKey();

    }
}
