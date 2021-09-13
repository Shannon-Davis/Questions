package Twentyquestion;

public class Question1 {
    public static int getLastIndex(String[] names) {
        int nums= names.length-1;
        return nums;
    }

    public static void main(String[] args) {
        String[] siblings ={"Nelson","Carmen","Nichelle"};
        System.out.println(getLastIndex(siblings));
    }

}
