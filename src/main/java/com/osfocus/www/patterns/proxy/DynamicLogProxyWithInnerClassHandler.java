package com.osfocus.www.patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.SimpleTimeZone;

public class DynamicLogProxyWithInnerClassHandler {
    public static void main(String[] args) {
        Car car = new Car();

        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");

        Movable m = (Movable) Proxy.newProxyInstance(Car.class.getClassLoader(),
                                                     new Class[]{Movable.class},
                                                     new LogProxyHandler(car));
        m.move();
        m.print(33);
    }

    static class LogProxyHandler implements InvocationHandler {
        Object object;
        public LogProxyHandler(Object object) {
            this.object = object;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("Start to log");
            Object o = method.invoke(object, args);

            System.out.println("End logging");
            return o;
        }
    }
}
