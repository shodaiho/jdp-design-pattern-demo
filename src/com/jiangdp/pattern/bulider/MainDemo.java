package com.jiangdp.pattern.bulider;


/**
 * MainDemo
 * <p>
 * Created by morningrain on 2019/7/1.
 */
public class MainDemo {

    public static void main(String[] args) {
        ComputerDirector hpComputerDirector = new ComputerDirector(new HpComputerBulider());
        Computer hpComputer = hpComputerDirector.construct();
        hpComputer.say();

        ComputerDirector dellComputerDirector = new ComputerDirector(new DellComputerBuilder());
        Computer dellComputer = dellComputerDirector.construct();
        dellComputer.say();
    }
}
