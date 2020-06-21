package com.osfocus.www.patterns.factory;

public class MagicVehicleFactory extends AbstractWorldFactory {
    @Override
    public Movable create(String brand) {
        Movable movable = null;
        switch (brand) {
            case "Disney":
                movable = new Broom();
                break;
            case "Aladdin":
                movable = new MagicCarpet();
                break;
            default:
        }

        return movable;
    }
}
