package com.jgehlot.dp.strategy.exampleOne;

public class MountainDuckExample {

    public static void main(String[] args) {
        Duck jetFlyer = new Duck(new JetFlying(), new CityQuacking(), new CityDisplay());
        System.out.println(jetFlyer.fly() + " and " + jetFlyer.quack() + " and " + jetFlyer.display());

        Duck simpleFlyer = new Duck(new SimpleFlying(), new HomeQuacking(), new MountainDisplay());
        System.out.println(simpleFlyer.fly() + " and " + simpleFlyer.quack() + " and " + simpleFlyer.display());

    }
}
