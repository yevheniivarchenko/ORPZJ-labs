package com.company;

// C5 = 4 - C = A × B
// C7 = 1 - byte
// C11 = 9 - Знайти середнє значення елементів кожного стовпчика матриці

public class Main {
    public static void main(String[] args) {
        byte[][] matrixA = {
                {5, 2, 3},
                {4, 3, 2},
                {6, 4, 1},
                {9, 1, 7}
        };

        byte[][] matrixB = {
                {3, 4, 7, 9},
                {6, 5, 0, 4},
                {3, 2, 0, 6}
        };

        int m = matrixA.length;
        int n = matrixB[0].length;
        int o = matrixB.length;
        byte[][] matrixC = new byte[m][n];

        if (matrixA[0].length == matrixB.length) {
            for (int i = 0; i < m; ++i) {
                for (int j = 0; j < n; ++j) {
                    for (int k = 0; k < o; ++k) {
                        matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                    }

                    System.out.format("%4d", matrixC[i][j]);
                }

                System.out.println();
            }
        } else {
            System.out.println("The number of columns in the matrix A must be equal to the number of rows in the matrix B");
        }

        System.out.println();

        for (int i = 0; i < matrixC[0].length; ++i) {
            int sum = 0;

            for (int j = 0; j < matrixC.length; ++j) {
                sum += matrixC[j][i];
            }
            
            System.out.println(sum / matrixC.length);
        }
    }
}
