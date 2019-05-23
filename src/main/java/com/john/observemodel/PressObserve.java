package com.john.observemodel;

/**
 * @author: john.huang
 * @description: 气压观察者
 * @data: 2019/5/23 15:02
 */
public class PressObserve implements Observe,DashBoardDisplay{

    private Subject subject;

    private int data;


    public PressObserve(Subject subject) {
        this.subject = subject;
        subject.addObserve(this);
    }

    @Override
    public void update(int data) {
        this.data = data;
        display();
    }


    @Override
    public void display() {
        System.out.println( "==============="+"压力布告板更新数据:"+ data+ "===============");
    }
}
