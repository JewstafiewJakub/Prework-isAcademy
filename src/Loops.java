public class Loops {
    public static void main(String[] args) {
        // googol number
        String googol = "1";
        int len = googol.length();
        while (len <= 100) {
            googol = googol + "0";
            len = googol.length();
        }
        System.out.println(googol);
        // dices - Yahtzee
        System.out.println(keepRolling());
        // alarm
        raiseAlarm(4);
        // Arrays
        String [] newsOutlet = {"abc", "bbc", "CNN", "CBS", "AP", "NBC", "FOX", "npr", "sky", "Aljazeera"};
        double lucky = Math.random();
        lucky *= 10;
        int luckyIndex = (int) lucky;
        System.out.println(newsOutlet[luckyIndex]);
        double [] temps = {70.0, 73.0, 72.0, 80.0};
        System.out.println(calculateAverage(temps));
        double [] times = {7.85, 7.32, 4.9, 6.22, 5.4, 7.3, 5.19};
        System.out.println(search(times));
        // 2D 
    }
    public static int keepRolling() {
        int dice1 = Functions.rollDice();
        int dice2 = Functions.rollDice();
        int dice3 = Functions.rollDice();
        int dice4 = Functions.rollDice();
        int dice5 = Functions.rollDice();
        int count = 1;
        while (!(dice1 == dice2 && dice1 == dice3 && dice1 == dice4 && dice1 == dice5)) {
            dice1 = Functions.rollDice();
            dice2 = Functions.rollDice();
            dice3 = Functions.rollDice();
            dice4 = Functions.rollDice();
            dice5 = Functions.rollDice();
            count = count + 1;
        }
        return count;
    }
    public static void raiseAlarm (int numOfWarnings) {
        for(int i = 1; i <= numOfWarnings; i++) {
            System.out.println("Warning # " + i);
        }
    }
    public static double calculateAverage (double [] temperatures) {
        int size = temperatures.length;
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += temperatures[i];
        }
        double average = total/size;
        return average;
    }
    public static double search(double [] speed) {
        int size = speed.length;
        double min = speed[0];
        for (int i = 1; i < size; i++) {
            if (speed[i] < min) {
                min = speed[i];
            }
        }
        return min;
    }
    public String findLongestName(String [] names){
        String longestName = names[0];
        int size = names.length;
        for (int i = 1; i < size; i++) {
            if (names[i].length() >= longestName.length()) {
                longestName = names[i];
            }
        }
        return longestName;
    }
}

