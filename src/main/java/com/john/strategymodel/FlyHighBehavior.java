package com.john.strategymodel;

/**
 * @author: john.huang
 * @description:
 * @data: 2019/5/21 23:11
 */
public class FlyHighBehavior implements FlyBehavior{


    @Override
    public void fly() {
        System.out.println("===  fly high   ===");
    }
}
