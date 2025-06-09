public class MainCars {
    public static void main(String[] args) {
        Car2 car1 = new Car2("Toyota", 5, 5, null, false);
        Car2 car2 = new Car2();
        car1.brand = "Renoult";
        car1.showInfo();
        car2.showInfo();
    }

}
