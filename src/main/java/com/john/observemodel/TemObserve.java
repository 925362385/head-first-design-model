package com.john.observemodel;

/**
 * @author: john.huang
 * @description: 温度观察者
 * @data: 2019/5/23 15:02
 */
public class TemObserve implements Observe,DashBoardDisplay {

    private Subject subject;

    private int data;


    public TemObserve(Subject subject) {
        this.subject = subject;
        subject.addObserve(this);
    }



    @Override
    public void display() {
        System.out.println("==============="+"温度布告板更新数据:"+ data+ "===============");
    }

    @Override
    public void update(int data) {
        this.data = data;
        display();
    }
}
