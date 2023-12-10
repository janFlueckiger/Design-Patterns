package org.example.observer;

import org.example.observer.Observer.ConcreteObserver;
import org.example.observer.Subject.ConcreteSubject;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();

        ConcreteObserver concreteObserver = new ConcreteObserver();

        concreteSubject.attach(concreteObserver);

        concreteSubject.setSubjectState("Hallo");

        concreteSubject.detach(concreteObserver);

        concreteSubject.setSubjectState("Tschüss");
    }
}