package com.talfinder.assessment;

import java.util.Arrays;

public class SpiralMatrix {

    public static int[][] doSpiralOrder(int n) {
        /*
         * NOTE:
         * 1. Write your solution within this method
         * 2. Do not make changes to the Class Name, Method Name or Method Signature
         * 3. Use the Run-Java command to run main method
         * 4. Use the BuildAndRunTests command to evaluate your solution
         */
        return new int[][]{{0, 0}, {0, 0}};
    }

    public static void main(String[] args) {
        int input = 3;
        int[][] expectedOutput = new int[][]{
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}
        };
        int[][] result = doSpiralOrder(input);
        System.out.println("Input value : " + input);
        System.out.println("Expected Output: " + Arrays.deepToString(expectedOutput));
        System.out.println("Solution Output: " + Arrays.deepToString(result));
    }
}
