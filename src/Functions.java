public class Functions {

    public static void main(String[] args) {
        chorus();
        greeting("London");
        weatherInterpreter(23);
        weatherInterpreter(4);
        weatherInterpreter(32);
        admission(125);
        printPhoto(50, 100, false);
        int currentLikes = 0;
        int returnedLikes = likePhoto(currentLikes, "Cool", true);
        int returnedLikes2 = likePhoto(returnedLikes, "Boo", false);
        int totalLikes = likePhoto(returnedLikes2, "Alright", true);
        System.out.println("Total likes: " + totalLikes);
        System.out.println(randomNumber());
        int roll1 = rollDice();
        int roll2 = rollDice();
        System.out.println("Roll 1: " + roll1);
        System.out.println("Roll 2: " + roll2);
        }
    public static void chorus() {
        System.out.println("Once I had a love and it was a gas");
        System.out.println("Soon turned out had a heart of glaas");
        System.out.println("Seemed like the real thing, only to find");
        System.out.println("Mucho mistrust, love's gone behnid");
    }
    public static void greeting (String location) {
        System.out.println("Hello, " + location);
    }
    static void weatherInterpreter (int temperature) {
        if (temperature > 30) {
            System.out.println("It's hot outside");
        } else if (temperature < 5) {
            System.out.println("Consider wearing a jacket");
        } else {
            System.out.println("Not too hot, not too cold");
        }
    }
    public static String admission (int height) {
        String passText;
        if (height > 120) {
            passText = "You pass the height requirements";
        } else {
            passText = "Sorry, you do not pass";
        }
        return passText;
    }
    public static void printPhoto(int width, int height, boolean inColour) {
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        if (inColour) {
            System.out.println("Print is full colour");
        } else {
            System.out.println("Print is black and white");
        }
    }
     public static int likePhoto (int currentLikes, String comment, boolean like) {
        System.out.println("Feedback: " + comment);
        if (like) {
            currentLikes = currentLikes + 1;
        }
        System.out.println("Number of likes: " + currentLikes);
        return currentLikes;
    }
    // Returning random numbers
    public static int randomNumber() {
        double num = Math.random();
        num = num * 10;
        int randomInt = (int) num;
        return randomInt;
    }
    public static int rollDice() {
        double randomNumber = Math.random();
        randomNumber = randomNumber * 6 + 1;
        int randomInt = (int) randomNumber;
        return randomInt;
    }

}

