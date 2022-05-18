package ss4_OOP.Excersie.QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double numberA, double numberB, double numberC) {
        this.a = numberA;
        this.b = numberB;
        this.c = numberC;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return (this.b * b - 4 * this.a * this.c);
    }

    public double getRoot1() {
        return ((-this.b + Math.pow(this.b * this.b - 4 * this.a * this.c, 0.5)) / 2 * this.a);
    }

    public double getRoot2() {
        return ((-this.b - Math.pow(this.b * this.b - 4 * this.a * this.c, 0.5)) / 2 * this.a);
    }

}
