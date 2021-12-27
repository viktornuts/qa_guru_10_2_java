package guru.qa;

import javax.annotation.processing.SupportedSourceVersion;

public class HelloWorld {

    static class Car {

        int age;
        String model;
        String carFrom;
        double fuelGasTank;
        int carMileage;
        String color;

        public void carStatistic() {
            System.out.println("Car age = " + age + "\n Car model = " + model + "\n Car from =  "
                    + carFrom + "\n Fuel in gastank = " + fuelGasTank + "\n Car milleage =  " + carMileage + "\n Car color = " + color);
        }

        public void trevel100Miles() {

            fuelGasTank = fuelGasTank - 10;
            carMileage = carMileage + 100;
            System.out.println("Trip 100miles complite");

        }

    }

}