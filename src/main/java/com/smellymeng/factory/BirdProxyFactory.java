package com.smellymeng.factory;

import com.smellymeng.api.domain.Bird;
import com.smellymeng.api.myinterface.Action;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class BirdProxyFactory{

    private Action target;

    public BirdProxyFactory(Action target) {
        this.target = target;
    }

    public Object getBirdProxy(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Bird bird = new Bird("male","kiuii");
                String ret = (String)method.invoke(target, args);
                return bird + ret;
            }
        });
    }

}
