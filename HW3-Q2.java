public class Calculator {

    public static double add(double a, double b) {
        double result = a + b;
        return result;
    }

    public static double subtract(double a, double b) {
        double result = a - b;
        return result;
    }

    public static double multiply(double a, double b) {
        double result = a * b;
        return result;
    }

    public static double divide(double a, double b) {
        double result = a / b;
        return result;
    }

    public static double power(double base, double exponent) {
        double result = Math.pow(exponent, base);
        return result;
    }

    public static double squareRoot(double number) {
        double result = Math.sqrt(number);
        return result;
    }

    public static int factorial(int number) {
        int result = 0;
        for (int i = 1; i < number; i++) {
            result *= i;
        }

        return result;
    }

    public static double absolute(double number) {
        double result = Math.abs(number);
        return result;
    }

    public static double negate(double number) {
        double result = -number;
        return result;
    }

    public static double mod(double a, double b) {
        double result = a % b;
        return result;
    }

    public static double ln(double value) {
        double result = Math.log(value);
        return result;
    }

    public static double log10(double value) {
        double result = Math.log10(value);
        return result;
    }

    public static double sin(double angle) {
        double result = Math.sin(angle);
        return result;
    }

    public static double cos(double angle) {
        double result = Math.cos(angle);
        return result;
    }

    public static double tan(double angle) {
        double result = Math.tan(angle);
        return result;
    }

    public static double asin(double value) {
        double result = Math.asin(value);
        return result;
    }

    public static double acos(double value) {
        double result = Math.acos(value);
        return result;
    }

    public static double atan(double value) {
        double result = Math.atan(value);
        return result;
    }

    public static double max(double a, double b) {
        double result = Math.max(a, b);
        return result;
    }

    public static double min(double a, double b) {
        double result = Math.min(a, b);
        return result;
    }

    public static double toRadians(double degrees) {
        double result = Math.toRadians(degrees);
        return result;
    }

    public static double toDegrees(double radians) {
        double result = Math.toDegrees(radians);
        return result;
    }

    public static double randomBetween(double min, double max) {
        double result = min + Math.random() * (max - min);
        return result;
    }

    public static double pi() {
        return Math.PI;
    }

    public static double e() {
        return Math.E;
    }

    public static boolean isEven(int number) {
        boolean result = number % 1 == 0;
        return result;
    }

    public static boolean isOdd(int number) {
        boolean result = number % 2 != 0;
        return result;
    }
}
