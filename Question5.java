package Twentyquestion;

public class Question5 {public static String getSecondToLastElement(String[] names) {
   String elem = names[1];
    return elem;
}
    public static void main(String[] args) {
        String[] siblings ={"Nelson","Carmen","Nichelle"};
        System.out.println(getSecondToLastElement(siblings));}
}
