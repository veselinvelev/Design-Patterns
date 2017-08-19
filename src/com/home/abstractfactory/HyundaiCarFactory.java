package com.home.abstractfactory;

public class HyundaiCarFactory implements CarFactory {
    @Override
    public Car createCar(CarType carType) {

        if (carType == CarType.I10) {
            return new I10();
        }

        if (carType == CarType.I30) {
            return new I30();
        }

        return null;
    }
}
