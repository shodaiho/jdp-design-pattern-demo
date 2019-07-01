package com.jiangdp.pattern.abstractfactory;

/**
 * DellKeyBoard
 * <p>
 * Created by morningrain on 2019/7/1.
 */
public class DellKeyBoard implements KeyBoard {
    @Override
    public void enterKey() {
        System.out.println("Dell KeyBoard EnterKey");
    }
}
