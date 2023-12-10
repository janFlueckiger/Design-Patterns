package org.example.observer.Subject;

import org.example.observer.Interface.SubjectInterface;
import org.example.observer.Observer.ConcreteObserver;

import java.util.*;

public class ConcreteSubject implements SubjectInterface {
    private String subjectState;
    private List<ConcreteObserver> observers = new ArrayList<>();

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String newState) {
        if (!newState.equals(subjectState)) {
            subjectState = newState;
            notifyObservers();
        }
    }

    @Override
    public void attach(ConcreteObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(ConcreteObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (ConcreteObserver observer : observers) {
            observer.update(subjectState);
        }
    }

}