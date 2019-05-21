package com.john.strategymodel;

/**
 * @author: john.huang
 * @description:
 * @data: 2019/5/21 23:13
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;


    public abstract void display();


    void perforFly(){
        flyBehavior.fly();
    }

    void quack(){
        quackBehavior.quack();
    }


}

