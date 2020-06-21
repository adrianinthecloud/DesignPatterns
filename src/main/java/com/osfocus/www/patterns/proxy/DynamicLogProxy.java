package com.osfocus.www.patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicLogProxy {
    public static void main(String[] args) {
        Car car = new Car();

        Movable m = (Movable) Proxy.newProxyInstance(Car.class.getClassLoader(), new Class[]{Movable.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("Start to log");
                        Object o = method.invoke(car, args);

                        System.out.println("End logging");
                        return o;
                    }
                });
        m.move();
        m.print(33);
    }
}
