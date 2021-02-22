public class SimpleArray {
    public static void main(String[] args) {
        String[] cars = new String[] {"BWM", "Mercedes", "Range Rover", "Aston Martin", "Jeep"};
        String[] countries = new String[5];
        countries[0] = "Germany";
        countries[1] = "Germany";
        countries[2] = "United Kingdom";
        countries[3] = "United Kingdom";
        countries[4] = "United State of America";
        String car = cars[3];
        int numberOfElements = cars.length;
        System.out.println("Na mojej liście znajduje się " + numberOfElements + " marek aut.");
        System.out.println("Jedno z moich ulubionych to: " + car);

    }
}
