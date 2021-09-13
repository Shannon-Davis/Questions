package Twentyquestion;

public class Question2 { public static int getSecondToLastIndex(String[] names) {
    int nums= names.length-2;
    return nums;
}

    public static void main(String[] args) {
        String[] siblings ={"Nelson","Carmen","Nichelle"};
        System.out.println(getSecondToLastIndex(siblings));
    }

}

