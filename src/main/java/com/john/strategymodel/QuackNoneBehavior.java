package com.john.strategymodel;

/**
 * @author: john.huang
 * @description:
 * @data: 2019/5/21 23:12
 */
public class QuackNoneBehavior implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("===  cant quack   ===");
    }
}
