public class Main {
    public static void main(String[] args) {
        newton(1.035);
        newton(1.04);
        newton(1.05);
        newton(1.06);
        newton(1.065);
    }

    // f(x)
    static double f(double x) {
        return 24 * Math.pow(x, 11) - 349 * x + 325;
    }

    // f'(x)
    static double df(double x) {
        return 264 * Math.pow(x, 10) - 349;
    }
    public static void newton(double start) {
        double x = start;
        int count = 1;

        System.out.printf("Start: x[0] = %.3f%n", start);

        do  {

            x = x - f(x) / df(x);  //Newtons method.
            System.out.printf("x[%d] = %.7f%n", count, x);

            count ++;
        } while((x <= 1.03) || (x >= 1.06));

        System.out.printf("Need %d iteration(s) until 1.03 < x < 1.06 %n%n", count - 1);
    }
}