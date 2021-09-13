package Twentyquestion;

import java.util.Arrays;

public class Question6 { public static int getSum(int[] ints) {
        int sum= Arrays.stream(ints).sum();
    return sum;
    }

    public static void main(String[] args) {
        int[] nums={24,22,20,28,30,10};
        System.out.println(getSum(nums));
    }

}
