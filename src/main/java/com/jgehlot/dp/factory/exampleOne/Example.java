package com.jgehlot.dp.factory.exampleOne;

public class Example {

    public static void main(String[] args) {
        Polygon p;
        PolygonFactory polygonFactory = new PolygonFactory();

        p = polygonFactory.getPolygon(4);
        System.out.println("The shape with 4 sides is a " + p.getType());

        p = polygonFactory.getPolygon(8);
        System.out.println("The shape with 8 sides is a " + p.getType());
    }
}
