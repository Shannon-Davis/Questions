package Twentyquestion;

public class Question15 {
// Write a java method to count all the words in a string

    public static int WordsInAStringCounter(String str) {
        if (str == null || str.isEmpty())
        { return 0;
        }
        String[] words = str.split("\\s+");
        return words.length;

    }

    public static void main(String[] args) {
        System.out.println(WordsInAStringCounter("Shannon is slacking right now!"));
    }


}
