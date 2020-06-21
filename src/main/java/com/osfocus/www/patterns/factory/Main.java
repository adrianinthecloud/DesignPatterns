package com.osfocus.www.patterns.factory;

public class Main {
    public static void main(String args[]) {
        AbstractWorldFactory vehicleFactory = new ModernVehicleFactory();
        Movable bmw = vehicleFactory.create("BMW");
        bmw.move();

        Movable mercedes = vehicleFactory.create("Mercedes");
        mercedes.move();

        AbstractWorldFactory magicVehicleFactory = new MagicVehicleFactory();
        Movable carpet = magicVehicleFactory.create("Aladdin");
        carpet.move();

        Movable broom = magicVehicleFactory.create("Disney");
        broom.move();
    }
}
