package com.osfocus.www.patterns.factory;

public class ModernVehicleFactory extends AbstractWorldFactory {
    @Override
    public Movable create(String brand) {
        Movable movable = null;
        switch (brand) {
            case "BMW":
                movable = new BMW();
                break;
            case "Mercedes":
                movable = new Mercedes();
                break;
            default:
        }

        return movable;
    }
}
