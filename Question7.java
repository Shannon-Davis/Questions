package Twentyquestion;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Question7 {
    public static OptionalDouble getAverage(int[] ints) {
     OptionalDouble average= Arrays.stream(ints).average();
    return average;
}

    public static void main(String[] args) {
        int[] nums={24,22,20,28,30};
        System.out.println(getAverage(nums));
    }

}

