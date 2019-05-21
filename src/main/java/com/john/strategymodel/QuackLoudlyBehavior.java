package com.john.strategymodel;

/**
 * @author: john.huang
 * @description:
 * @data: 2019/5/21 23:12
 */
public class QuackLoudlyBehavior implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("===  quack loudly   ===");
    }
}
