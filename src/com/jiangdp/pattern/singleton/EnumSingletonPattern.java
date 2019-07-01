package com.jiangdp.pattern.singleton;

/**
 * EnumSingletonPattern
 * <p>
 * 枚举单例模式
 */
public enum EnumSingletonPattern {
    INSTANCE;

    public void showMessage() {
        System.out.println("枚举类单例模式");
    }
}
