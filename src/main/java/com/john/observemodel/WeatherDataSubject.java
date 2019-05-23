package com.john.observemodel;

import java.util.ArrayList;

/**
 * @author: john.huang
 * @description:
 * @data: 2019/5/23 14:58
 */
public class WeatherDataSubject implements Subject {

    private ArrayList<Observe> arrayList;

    private int data = 0;


    public WeatherDataSubject() {
        this.arrayList = new ArrayList();
    }


    @Override
    public void addObserve(Observe observe) {
            arrayList.add(observe);

    }

    @Override
    public void deleteSubject(Observe observe) {
            this.arrayList.remove(observe);

    }

    @Override
    public void notifyObserves() {
        for (Observe observe : arrayList) {
                observe.update(data);
        }
    }

    public void chage(){
        while(data<1000){
            data++;
            notifyObserves();
            System.out.println("\n\n");
            try {
                Thread.sleep(9000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void begainChange(){
        new Thread(()->{
                this.chage();
        }).start();
    }
}
