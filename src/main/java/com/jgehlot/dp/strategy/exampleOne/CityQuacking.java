package com.jgehlot.dp.strategy.exampleOne;

public class CityQuacking implements QuackBehaviour{
    @Override
    public String quack() {
        return "Must quack louder in the city";
    }
}
