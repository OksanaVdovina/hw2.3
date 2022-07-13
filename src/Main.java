public class Main {
    public static void main(String[] args) {
        CheckMachines car = new Car("car1",4);
        CheckMachines car2 = new Car("car2", 4);
        CheckMachines truck = new Truck("truck1",6);
        CheckMachines truck2 = new Truck("truck2", 8);
        CheckMachines bicycle = new Bicycle("bicycle1",2);
        CheckMachines bicycle2 = new Bicycle("bicycle2",2);

        car.check();
        System.out.println();
        truck.check();
        System.out.println();
        bicycle.check();
        System.out.println();

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.verify(car);

    }
}