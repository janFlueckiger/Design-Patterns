package org.example.observer.Interface;

import org.example.observer.Observer.ConcreteObserver;

public interface SubjectInterface {
    public void attach(ConcreteObserver observer);
    public void detach(ConcreteObserver observer);
    public void notifyObservers();
}
