package com.osfocus.www.patterns.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy {
    public static void main(String args[]) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Car.class);
        enhancer.setCallback(new TimeMethodInterceptor());
        Car car = (Car) enhancer.create();

        car.move();
    }

    static class TimeMethodInterceptor implements MethodInterceptor {

        @Override
        public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
            System.out.println("Before");
            Object result = null;
            result = methodProxy.invokeSuper(o, objects);
            System.out.println("After");

            return result;
        }
    }
}
