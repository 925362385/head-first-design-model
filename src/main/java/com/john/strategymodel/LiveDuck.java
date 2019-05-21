package com.john.strategymodel;

/**
 * @author: john.huang
 * @description:
 * @data: 2019/5/21 23:15
 */
public class LiveDuck extends Duck {

    public LiveDuck(){
        flyBehavior     = new FlyHighBehavior();
        quackBehavior   = new QuackLoudlyBehavior();

    }



    @Override
    public void display() {
        flyBehavior.fly();
        quackBehavior.quack();
    }

}
