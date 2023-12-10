package org.example.observer.Observer;

import org.example.observer.Interface.ObserverInterface;

public class ConcreteObserver implements ObserverInterface {
    private String observerState;

    public void setObserverState(String subjectState){
        this.observerState = subjectState;
    }

    public String getObserverState(){
        return this.observerState;
    }

    @Override
    public void update(String subjectState) {
        setObserverState(subjectState);
        System.out.println(getObserverState());
    }
}
