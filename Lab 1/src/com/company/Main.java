package com.company;

// C2 = 0 - +
// C5 = 4 - -
// C7 = 1 - short

public class Main {
    public static void main(String[] args) {
        short a = 2;
        short b = 3;
        short m = 6;
        short n = 8;
        short C = 1;
        double sum = 0;

        if ((a <= m) || (b <= n)) {
            if (a > -C) {
                for (short i = a; i <= n; ++i) {
                    for (short j = b; j <= m; ++j) {
                        sum += (double) (i - j) / (i + C);
                    }
                }

                System.out.println("The sum is " + sum);
            } else {
                System.out.println("Something went wrong... Division by zero is unacceptable");
            }
        } else {
            System.out.println("Incorrect bounds");
        }
    }
}
