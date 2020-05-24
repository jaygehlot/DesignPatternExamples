package com.jgehlot.dp.strategy.exampleOne;

public class HomeQuacking implements QuackBehaviour {
    @Override
    public String quack() {
        return "Quiet quacking at home";
    }
}
