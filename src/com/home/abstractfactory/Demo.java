package com.home.abstractfactory;

public class Demo {

    public static void main(String[] args) {

        CarFactory hondaFactory = FactoryProducer.getCarFactory(CarFactoryType.HondaFactory);
        CarFactory hyundaiFactory = FactoryProducer.getCarFactory(CarFactoryType.HyundaiFactory);

        Car i10 = hyundaiFactory.createCar(CarType.I10);
        Car i30 = hyundaiFactory.createCar(CarType.I30);

        Car brio = hondaFactory.createCar(CarType.Brio);
        Car civic = hondaFactory.createCar(CarType.Civic);

        i10.drive();
        i30.drive();
        brio.drive();
        civic.drive();

    }
}
