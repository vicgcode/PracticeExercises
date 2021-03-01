package com.company.abstracts;


abstract class IntBinaryOperation {
    protected int firstArg;
    protected int secondArg;

    public IntBinaryOperation(int firstArg, int secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    public abstract int perform();
}

class Addition extends IntBinaryOperation {
    public Addition(int firstArg, int secondArg) {
        super(firstArg, secondArg);
    }

    public int perform() {
        return firstArg + secondArg;
    }
}

class Multiplication extends IntBinaryOperation {
    public Multiplication(int firstArg, int secondArg) {
        super(firstArg, secondArg);
    }

    public int perform() {
        return firstArg * secondArg;
    };
}

public class AbstractMath {
    public static void main(String[] args) {
        Addition addition = new Addition(2,5);
        Multiplication multiplication = new Multiplication(2,5);

        System.out.println("Addition: " + addition.perform() + " Multiplication: " + multiplication.perform());
    }
}
