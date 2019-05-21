package com.john.strategymodel;

/**
 * @author: john.huang
 * @description:
 * @data: 2019/5/21 23:17
 */
public class DeadDuck extends Duck {

    public DeadDuck() {
        quackBehavior = new QuackNoneBehavior();
        flyBehavior   = new CantFlyBehavior();
    }

    @Override
    public void display() {
        quackBehavior.quack();
        flyBehavior.fly();
    }
}
