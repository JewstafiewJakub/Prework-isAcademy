public class maths {
    public static void main(String[] args) {
        // excercise 1
        int x = 2 + 3;
        int y = 4 - 5;
        int z = x * y;
        System.out.println(z);
        // excercise 2
        double paid = 10.0;
        double change = 3.25;
        double tip = (paid - change) * 0.2;
        System.out.println("Tip $" + tip);
        // excercise 3
        double current = 17;
        double rate = 1.5;
        double future = current * rate;
        System.out.println(future);
        int approx = (int) future;
        System.out.println(approx);
        // excercise 4
        int num1 = 5;
        int num2 = 2;
        double div = num1/ num2;
        System.out.println(div);
        double accurate = (double) num1 / num2;
        System.out.println(accurate);


//        Your friend seems to be really good at music,
//        he managed to score 96% on his final exam!
//        Now that you know all 5 subject grades,
//        update the average calculation below to calculate the
//        total average of all subjects.


        double maths=97.5;
        double english=98;
        double science=83.5;
        double drama=75;
        double music = 96;
        double sum=maths+english+science+drama + music;
        double average=sum/5;
        System.out.println(average);
    }
}