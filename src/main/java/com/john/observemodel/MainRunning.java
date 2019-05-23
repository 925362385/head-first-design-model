package com.john.observemodel;

/**
 * @author: john.huang
 * @description:
 * 观察者模式：定义的一种一对多关系的依赖，其中一是有状态的，状态改变，所有依赖该对象的内部状态都会被自动改变。
 * @data: 2019/5/23 14:34
 */
public class MainRunning {


    public static void main(String[] args) {
        WeatherDataSubject weatherDataSubject = new WeatherDataSubject();
        Observe             observe1          = new PressObserve(weatherDataSubject);
        Observe             observe2          = new TemObserve(weatherDataSubject);
        weatherDataSubject.begainChange();
    }
}
