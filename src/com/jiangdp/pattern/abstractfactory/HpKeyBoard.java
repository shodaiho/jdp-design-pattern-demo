package com.jiangdp.pattern.abstractfactory;

/**
 * HpKeyBoard
 * <p>
 * Created by morningrain on 2019/7/1.
 */
public class HpKeyBoard implements KeyBoard {
    @Override
    public void enterKey() {
        System.out.println("Hp KeyBoard EnterKey");
    }
}
