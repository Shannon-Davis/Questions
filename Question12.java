package Twentyquestion;

public class Question12 {
    public static void printOddNumbersInRange(int start, int end) {
       for(int x = start; x <= end; x++){
           if(x % 2 != 0){
               System.out.println(x);
           }
       }
    }

    public static void main(String[] args) {
        printOddNumbersInRange(15,30);
    }
}
