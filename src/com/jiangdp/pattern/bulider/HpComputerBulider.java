package com.jiangdp.pattern.bulider;

/**
 * HpComputerBulider
 * <p>
 * Created by morningrain on 2019/7/1.
 */
public class HpComputerBulider extends ComputerBuilder {

    private Computer computer = new Computer();

    @Override
    public void buildMouse() {
        computer.setMouse(new Mouse());
    }

    @Override
    public void buildKeyBoard() {
        computer.setKeyBoard(new KeyBoard());
    }

    @Override
    public void buildScreen() {
        computer.setScreen(new Screen());
    }

    @Override
    public Computer createComputer() {
        return computer;
    }
}
