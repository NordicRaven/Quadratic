//import java.util.Scanner;
//
//public class App {
//
//    private static class Params {
//        private final int a,b,c;
//
//        private Params(int a, int b, int c) {
//            this.a = a;
//            this.b = b;
//            this.c = c;
//        }
//    }
//
//    public static void main(String... args) {
//        System.out.println("This app will solve quadratic equations. ");
//        while (true) {
//            System.out.println("\nTo stop please enter \"stop\" " + "\nPlease enter values of a, b, c and" +
//                    " separate them with spaces " +
//                    "like this \"1 2 3\"");
//            try {
//                double[] result = Calculator.result(threeDoubles());
//                System.out.print("result is ---> ");
//                for (double v : result) {
//                    System.out.print(v + " ");
//                }
//                System.out.println();
//            } catch (IllegalArgumentException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//    }
//
//    static Params threeDoubles() {
//        double[] doubles = new double[3];
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < 3; i++) {
//            boolean correctInput = false;
//            do {
//                if (scanner.hasNext("stop")) {
//                    System.out.println("Thank you Vadik, for writing such an excellent programm!");
//                    System.exit(0);
//                } else if (scanner.hasNextDouble()) {
//                    doubles[i] = scanner.nextDouble();
//                    System.out.println("you entered --> " + doubles[i]);
//                    correctInput = true;
//                } else {
//                    System.out.println("invalid input! please try again");
//                    scanner.next();
//                }
//
//            }
//            while (!correctInput);
//        }
//
//        return doubles;
//    }
//
//}
