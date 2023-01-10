public class ifStatements {
    public static void main(String[] args) {
        boolean isLightGreen = false; // true or false
        boolean isLightYellow = false; // true or false
        if (isLightGreen) {
            System.out.println("Drive");
        } else if (isLightYellow){
            System.out.println("Slow down");
        } else {
            System.out.println("Stop!");
        }
        // *****
        boolean passport = false;
        boolean birthCertificate = false;
        boolean driversLicence = true;
        if (passport) {
            System.out.println("A passport is a valid ID");
        } else if (birthCertificate) {
            System.out.println("A birth certificate is a valid ID");
        } else if (driversLicence) {
            System.out.println("Drivers licence is a valid ID");
        } else {
            System.out.println("Invalid ID. Your application is denied");
        }
        // ****
        int ticketPrice = 10;
        int age = 61;
        boolean isStudent = false;
        if (age <= 15 || age > 60 || isStudent) {
            ticketPrice = 5;
        }
        System.out.println(ticketPrice);
        // switch
        int passcode = 111;
        String coffeeType;
        switch (passcode) {
            case 555:
                coffeeType = "Espresso";
                break;
            case 321:
                coffeeType = "Vanilla latte";
                break;
            case 629:
                coffeeType = "Drip coffee";
                break;
            default:
                coffeeType = "Unknown";
                break;
        }
        System.out.println(coffeeType);

        }
    }
}
