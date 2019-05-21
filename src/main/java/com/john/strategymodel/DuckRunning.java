package com.john.strategymodel;

/**
 * @author: john.huang
 * @description:
 *
 *
 * 策略模式 解藕的一种方式
 * 定义了算法族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化独立于使用 算法的客户。
 * 多用组合少用继承
 * 面向接口编程
 * 封装变化
 * @data: 2019/5/21 23:19
 */
public class DuckRunning {

    public static void main(String[] args) {
        Duck duck  = new LiveDuck();
        Duck duck1 = new DeadDuck();
        duck.display();
        duck1.display();
    }
}
