package PaketOne;

public class ComplexNumber {

    private final double a, b;

    public ComplexNumber(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getReal() {
        return a;
    }

    public double getIm() {
        return b;
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(a + other.a, b + other.b);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(a - other.a, b - other.b);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        return new ComplexNumber(a * other.a - b * other.b, a * other.b + b * other.a);

    }

    public ComplexNumber divide(ComplexNumber other) {
        return new ComplexNumber((a * other.a + b * other.b) / (Math.pow(other.a, 2) + Math.pow(other.b, 2)), (other.a * b - other.b * a) / (Math.pow(other.a, 2) + Math.pow(other.b, 2)));
    }

    @Override
    public String toString() {
        return String.valueOf(a) + (b >= 0 ? " + " + b : " - " + b * (-1)) + "*i";
    }
}
