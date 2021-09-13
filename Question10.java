package Twentyquestion;

public class Question10 {
    public static boolean contains(String[] names, String element) {
    for (String family : names){
        if (family.equals(element)){
            return true;

        }
    }
        return false;
}

    public static void main(String[] args) {
        String[] cousins ={"BJ", "Boutit", "Snapper", "Brandon", "KiKi","QB"};
        System.out.println(contains(cousins, "LJ"));
    }
}
