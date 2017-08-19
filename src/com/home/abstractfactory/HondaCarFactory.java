package com.home.abstractfactory;

public class HondaCarFactory implements CarFactory {
    @Override
    public Car createCar(CarType carType) {

        if (carType == CarType.Brio) {
            return new Brio();
        }

        if (carType == CarType.Civic) {
            return new Civic();
        }

        return null;
    }
}
