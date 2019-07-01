package com.jiangdp.pattern.singleton;

import javax.security.auth.callback.LanguageCallback;

/**
 * LazySingletonPattern
 * <p>
 * <p>
 * 饿汉式，非线程安全
 */
public class LazySingletonPattern {
    private static LazySingletonPattern lazySingletonPattern = null;

    private LazySingletonPattern() {
    }

    // 非线程安全
    public static LazySingletonPattern getInstance() {
        if (lazySingletonPattern == null) {
            // 多线程情况下，可能先后创建多个实例，最后创建的实例会覆盖前一个实例
            lazySingletonPattern = new LazySingletonPattern();
        }
        return lazySingletonPattern;
    }

    // 线程安全的，效率不高
    public synchronized static LazySingletonPattern getSafeInstance() {
        if (lazySingletonPattern == null) {
            lazySingletonPattern = new LazySingletonPattern();
        }
        return lazySingletonPattern;
    }

}
