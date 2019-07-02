package com.jiangdp.pattern.bulider;

/**
 * Computer
 * <p>
 * Created by morningrain on 2019/7/1.
 */
public class Computer {

    private Mouse mouse;

    private KeyBoard keyBoard;

    private Screen screen;

    public void say(){
        System.out.println("Hello World!");
    }

    public Mouse getMouse() {
        return mouse;
    }

    public KeyBoard getKeyBoard() {
        return keyBoard;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setKeyBoard(KeyBoard keyBoard) {
        this.keyBoard = keyBoard;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }
}
