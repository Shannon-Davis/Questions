package Twentyquestion;

public class Question4 {
    public static String getLastElement(String[] names) {
        String elem = names[names.length - 1];
        return elem;
    }

    public static void main(String[] args) {
        String[] siblings = {"Nelson", "Carmen", "Nichelle"};
        System.out.println(getLastElement(siblings));
    }

}
