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
    }
}
