package com.jiangdp.pattern.bulider;

/**
 * ComputerDirector
 * <p>
 * Created by morningrain on 2019/7/1.
 */
public class ComputerDirector {

    private ComputerBuilder computerBuilder = null;

    public ComputerDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer construct() {
        computerBuilder.buildMouse();
        computerBuilder.buildKeyBoard();
        computerBuilder.buildScreen();

        return computerBuilder.createComputer();
    }


}
