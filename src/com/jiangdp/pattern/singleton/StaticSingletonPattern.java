package com.jiangdp.pattern.singleton;

/**
 * StaticSingletonPattern
 * <p>
 * 静态内部类，线程安全
 */
public class StaticSingletonPattern {
    private static class SingletonHolder {
        private static final StaticSingletonPattern INSTANCE = new StaticSingletonPattern();
    }
    private StaticSingletonPattern() {

    }
    public static final StaticSingletonPattern getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
