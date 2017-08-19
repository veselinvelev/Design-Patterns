package com.home.abstractfactory;

public class FactoryProducer {

    static CarFactory getCarFactory(CarFactoryType carFactoryType) {

        if (carFactoryType == CarFactoryType.HyundaiFactory) {
            return new HyundaiCarFactory();
        }

        if (carFactoryType == CarFactoryType.HondaFactory) {
            return new HondaCarFactory();
        }


        return null;
    }

}
