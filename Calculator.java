
/**
* Created by user on 10.05.2015.
*/
public class Calculator {

    static double[] result(double[] doubles) throws IllegalArgumentException {
        if (doubles == null || doubles.length < 3 || doubles.length > 3) {
            throw new IllegalStateException("Illegal arguments for a quadratic equation. There must be an array of 3 double values");
        }
        double a = doubles[0];
        double b = doubles[1];
        double c = doubles[2];
        if (a == 0) {
            throw new IllegalArgumentException("Not a quadratic equation! \"a\" can't be zero!");
        }

        double[] res = new double[2];
        double d = b * b - 4 * a * c;
        if (d < 0) {
            throw new IllegalArgumentException("result is --->  No correct answers exist");
        } else

        {
            System.out.println("D = " + d);
            res[0] = (-b + Math.sqrt(d)) / 2 * a;
            res[1] = (-b - Math.sqrt(d)) / 2 * a;
            return res;
        }


    }


}
