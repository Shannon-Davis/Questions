package Twentyquestion;

public class Question5 {public static String getSecondToLastElement(String[] names) {
   String elem = names[names.length-2];
    return elem;
}
    public static void main(String[] args) {
        String[] siblings ={"Nelson","Carmen","Nichelle", "Diego"};
        System.out.println(getSecondToLastElement(siblings));}
}
