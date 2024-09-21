package com.patterns.strategy;

public class NavigatorStrategy {
    public static void main(String[] args) {
        Navigator navigator = new Navigator();

        navigator.setRouteStrategy(new CarRouteStrategy());
        navigator.buildRoute("A", "B");

        navigator.setRouteStrategy(new BicycleRouteStrategy());
        navigator.buildRoute("C", "D");

        navigator.setRouteStrategy(new WalkingRouteStrategy());
        navigator.buildRoute("E", "G");

        navigator.setRouteStrategy(new PublicTransportRouteStrategy());
        navigator.buildRoute("I", "J");

        navigator.setRouteStrategy(new TouristAttractionRouteStrategy());
        navigator.buildRoute("L", "M");
    }
}
