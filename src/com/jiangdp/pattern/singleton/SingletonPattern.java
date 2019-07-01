package com.jiangdp.pattern.singleton;

/**
 * 饿汉式，类初始化时已经实例化，天生是线程安全的
 */
public class SingletonPattern {

    private static SingletonPattern singletonPattern = new SingletonPattern();

    // 私有化构造函数，外界无法实例化
    private SingletonPattern() {
    }


    public static SingletonPattern getInstance() {
        return singletonPattern;
    }

    public void showMessage() {
        System.out.println("Singleton Pattern Say Hello World!");
    }

}
