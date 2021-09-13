package Twentyquestion;

public class Question3 {
    public static String getFirstElement(String[] names) {
String elem=names[0];
    return elem;
}
    public static void main(String[] args) {
        String[] siblings ={"Nelson","Carmen","Nichelle"};
        System.out.println(getFirstElement(siblings));
    }

}
