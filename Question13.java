package Twentyquestion;

public class Question13 {

    public static String printGivenStringTimesNumberGiven(String str, int n) {
        System.out.println(str + " " + n);
        return str.repeat(n);
    }

    public static void main(String[] args) {
        System.out.println(printGivenStringTimesNumberGiven("SND",4));
    }

}
