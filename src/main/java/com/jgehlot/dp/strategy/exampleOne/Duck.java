package com.jgehlot.dp.strategy.exampleOne;

public class Duck {

    //composed of ...
    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;
    private DisplayBehaviour displayBehaviour;

    Duck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour, DisplayBehaviour displayBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
        this.displayBehaviour = displayBehaviour;
    }

    String fly() {
        return flyBehaviour.fly();
    }

    String quack() {
        return quackBehaviour.quack();
    }

    String display() {
        return displayBehaviour.display();
    }
}
