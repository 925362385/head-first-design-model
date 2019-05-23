package com.john.observemodel;

import java.util.ArrayList;

public interface Subject {


    void addObserve(Observe observe);


    void deleteSubject(Observe observe);


    void notifyObserves();
}
