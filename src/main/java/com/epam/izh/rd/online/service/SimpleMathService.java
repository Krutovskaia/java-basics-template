package com.epam.izh.rd.online.service;

public class SimpleMathService implements MathService {

    @Override
    public int compare(int value1, int value2) {
        return Integer.compare(value1, value2);
    }

    @Override
    public int maxFrom(int value1, int value2) {
        return Math.max(value1, value2);
    }

    @Override
    public int maxFrom(int[] values) {
        int maxValues = values[0];
        for (int i = 1; i < values.length; i++) {
            if (maxValues < values[i]) {
                maxValues = values[i];
            }
        }
        return maxValues;
    }

    @Override
    public int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total = total + value;
        }
        return total;
    }

    @Override
    public int[] getEvenDigits(int[] values) {
        int evenNums = 0;
        for (int value : values) {
            if (value % 2 == 0) {
                evenNums++;
            }
        }
        int[] found = new int[evenNums];
        int nums = 0;
        for (int value : values) {
            if (value % 2 == 0) {
                found[nums] = value;
                nums++;
            }
        }
        return found;
    }

    @Override
    public long calcFactorial(int initialVal) {
        int result = 1;
        for (int i = 1; i <= initialVal; i++) {
            result *= i;
        }
        return result;
    }

    @Override
    public long calcFibonacci(int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            return calcFibonacci(number - 1) + calcFibonacci(number - 2);
        }
    }

    @Override
    public int[] sort(int[] values) {
        for (int i = values.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (values[j] > values[j + 1]) {
                    int tmp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = tmp;
                }
            }
        }
        return values;
    }

    @Override
    public boolean isPrimary(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int[] reverseArray(int[] values) {
        int i = 0;
        int j = values.length - 1;
        int tmp;
        while (j > i) {
            tmp = values[j];
            values[j] = values[i];
            values[i] = tmp;
            j--;
            i++;
        }
        return values;
    }
}
