#  Observer

## What is a Observer
> [!NOTE]
> The Observer is a behavioural design pattern. It is a way to establish a system where objects can subscribe to and receive notifications about changes in another object they're interested in. It enables multiple objects to stay informed and react to specific events in a decoupled manner.

## When to use an Observer
* When changes in the state of one object might lead to adjustments in other objects, especially when the exact set of objects isn't known in advance or varies dynamically.
* When some objects in the application must observe others, but only for a limited time or in specific cases.

## General UML
![Alt text](image.png)

* The **Publisher** triggers events when its state changes or it performs certain actions. It maintains a subscription system for new subscribers to join and for existing subscribers to leave.
* The **Subscriber** interface declares the notification structure, typically composed of a single update method. This method often includes various parameters enabling the publisher to transmit event details alongside the update.
* **Concrete Subscribers** respond to notifications from the publisher by executing specific actions. To maintain loose coupling, all these classes need to implement the same interface as the publisher.