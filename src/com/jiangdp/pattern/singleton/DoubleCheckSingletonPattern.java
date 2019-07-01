package com.jiangdp.pattern.singleton;

/**
 * DoubleCheckSingtonPattern
 * <p>
 * 双重校验锁，线程安全，效率高
 */
public class DoubleCheckSingletonPattern {

    private static volatile DoubleCheckSingletonPattern singletonPattern = null;

    private DoubleCheckSingletonPattern() {
    }

    public static DoubleCheckSingletonPattern getInstance() {
        if (singletonPattern == null) {
            synchronized (DoubleCheckSingletonPattern.class) {
                if (singletonPattern == null) {
                    singletonPattern = new DoubleCheckSingletonPattern();
                }
            }
        }
        return singletonPattern;
    }

}
