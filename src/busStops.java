public class busStops {
    public static void main(String[] args) {
        String driver;
        driver = "Jakub";
        int letters = driver.length();
        driver = driver.toUpperCase();
        String driverFirstName = "Hamish";
        String driverLastName = "Blake";
        String driverFullName = driverFirstName + " " + driverLastName;
        int passengers = 0;
        int stops = 0;
        int fare = 0;
        passengers = passengers + 5;
        fare = fare + 5;
        stops = stops + 1;
        passengers = passengers - 3;
        fare = fare + 3;
        stops = stops + 1;
        passengers = passengers - 1 + 5;
        fare = fare + 7;
        stops = stops + 1;
        System.out.println(passengers);
        System.out.println("The bus made $" + fare + " after " + stops + " stops");
        System.out.println(stops);
        System.out.println(driver);
        System.out.println(letters);
        System.out.println(driverFullName);
    }
}
