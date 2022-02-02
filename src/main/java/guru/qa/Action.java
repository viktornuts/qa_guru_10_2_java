package guru.qa;

public class Action {

    public static void main(String[] args) {
        HelloWorld.Car honda = new HelloWorld.Car();
        honda.age = 10;
        honda.model = "Accord";
        honda.carFrom = "Japan";
        honda.color = "White";
        honda.fuelGasTank = 20.4d;
        honda.carMileage = 90000;


        honda.carStatistic();
        honda.trevel100Miles();
        honda.carStatistic();

        HelloWorld.Car mazda = new HelloWorld.Car();
        mazda.age = 1;
        mazda.model = "Mazda";
        mazda.carFrom = "Europe";
        mazda.color = "Black";
        mazda.fuelGasTank = 24.4d;
        mazda.carMileage = 100000;

        mazda.carStatistic();
        mazda.trevel100Miles();
        mazda.carStatistic();
    }
}
