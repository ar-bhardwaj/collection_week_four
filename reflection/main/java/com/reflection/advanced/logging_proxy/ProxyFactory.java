package com.reflection.advanced.logging_proxy;

import java.lang.reflect.Proxy;

public class ProxyFactory {
    @SuppressWarnings("unchecked")
	public static <T> T createProxy(Class<T> interfaceType, T target) {
        return (T) Proxy.newProxyInstance(
                interfaceType.getClassLoader(),
                new Class<?>[]{interfaceType},
                new LoggingProxyHandler(target)
        );
    }
}
