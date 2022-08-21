package com.smellymeng;

import com.smellymeng.api.myinterface.Action;
import com.smellymeng.factory.BirdProxyFactory;

public class Test {
    public static void main(String[] args) {
        BirdProxyFactory factory = new BirdProxyFactory(new Action() {
            @Override
            public String moving() {
                return "is swimming";
            }
        });
        Action birdProxy = (Action)factory.getBirdProxy();
        System.out.println(birdProxy.moving());
    }
}
