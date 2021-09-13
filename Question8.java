package Twentyquestion;

public class Question8 {
    public static String extractAllOddNumbers(int[] numbers) {
String num= " ";
for (int num2=0; num2< numbers.length;num2++){
    if (numbers[num2] % 2 !=0){
        num += numbers[num2] +" ";
    }
}
    return num;
}

    public static void main(String[] args) {
        int[] ages= {20,23, 28,35,48,49};
        System.out.println(extractAllOddNumbers(ages));
    }
}
