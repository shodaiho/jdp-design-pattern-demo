package com.jiangdp.pattern.bulider;

/**
 * ComputerBuilder
 * <p>
 * Created by morningrain on 2019/7/1.
 */
public abstract class ComputerBuilder {

    public abstract void buildMouse();

    public abstract void buildKeyBoard();

    public abstract void buildScreen();

    public abstract Computer createComputer();


}
