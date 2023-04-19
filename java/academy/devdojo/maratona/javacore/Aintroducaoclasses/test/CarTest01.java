package academy.devdojo.maratona.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratona.javacore.Aintroducaoclasses.dominio.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();

        car.carName = new String[] {"Uno","AMG", "C3"};
        car.carModel = new String[] {"Fiat", "Mercedes", "Citroen"};
        car.carAge = new int[] {2007, 2017, 2023};

        System.out.println("Modelo: " + car.carModel[0] + " Nome: " + car.carName[0] + " Ano: " + car.carAge[0]);
        System.out.println("Modelo: " + car.carModel[1] + " Nome: " + car.carName[1] + " Ano: " + car.carAge[1]);
        System.out.println("Modelo: " + car.carModel[2] + " Nome: " + car.carName[2] + " Ano: " + car.carAge[2]);

    }
}
