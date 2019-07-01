package com.jiangdp.pattern.singleton;

/**
 * SingletonPatternTest
 */
public class SingletonPatternTest {

    public static void main(String[] args) {

        SingletonPattern singletonPattern = SingletonPattern.getInstance();

        singletonPattern.showMessage();


    }

}
