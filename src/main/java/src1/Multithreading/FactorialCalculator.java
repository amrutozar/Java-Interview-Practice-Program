package src1.Multithreading;

import java.util.concurrent.Callable;

public class FactorialCalculator implements Callable<Integer> {
    private final int number;

    public FactorialCalculator(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        int result = 1;
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
