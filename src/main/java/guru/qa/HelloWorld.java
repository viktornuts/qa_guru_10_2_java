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

    public static void main(String[] args) {

        Car honda = new Car();
        honda.age = 10;
        honda.model = "Accord";
        honda.carFrom = "Japan";
        honda.color = "White";
        honda.fuelGasTank = 20.4d;
        honda.carMileage = 90000;


        honda.carStatistic();
        honda.trevel100Miles();
        honda.carStatistic();


    }
}