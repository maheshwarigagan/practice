package arrays.productOfArrayExceptSelf;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductOfArrayExceptSelfTest {

    @Test
    public void productExceptSelf() {
        int[] input = new int[] {1,2,3,4};
        int[] output = new int[] {24,12,8,6};
        assertArrayEquals(output, ProductOfArrayExceptSelf.productExceptSelf(input));
    }

    @Test
    public void productExceptSelfWithASingleZero() {
        int[] input = new int[] {1,2,3,0};
        int[] output = new int[] {0,0,0,6};
        assertArrayEquals(output, ProductOfArrayExceptSelf.productExceptSelf(input));
    }

    @Test
    public void productExceptSelfWithATwoZero() {
        int[] input = new int[] {1,2,0,0};
        int[] output = new int[] {0,0,0,0};
        assertArrayEquals(output, ProductOfArrayExceptSelf.productExceptSelf(input));
    }

}