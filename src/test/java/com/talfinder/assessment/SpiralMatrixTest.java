package com.talfinder.assessment;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SpiralMatrixTest {

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][] {
                {2, new int[][]{{1,2},{4,3}}},
                {3, new int[][]{{1,2,3},{8,9,4},{7,6,5}}},
                {1, new int[][]{{1}}},
                {5, new int[][]{{1, 2, 3, 4, 5},{16, 17, 18, 19, 6},{15, 24, 25, 20, 7},{14, 23, 22, 21, 8},{13, 12, 11, 10, 9}}},
                {0, new int[][]{}},
                {4, new int[][]{{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}}}
        });
    }

    int input;
    int[][] expectedValue;

    public SpiralMatrixTest(int input, int[][] expectedValue) {
        this.input = input;
        this.expectedValue = expectedValue;
    }

    @Test
    public void doSpiralOrder() {
        Assert.assertEquals("input:" + input , Arrays.deepToString(expectedValue), Arrays.deepToString(SpiralMatrix.doSpiralOrder(input)));
    }
}
