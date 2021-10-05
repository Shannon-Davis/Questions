package Twentyquestion;

public class Question11{
    public static int getIndexByElement(String[] names, String element) {
int place =0;
        for( int index = 0; index < names.length; index++  ){
            if (names[index].equals(element)){
            place = index;
        }}
        return place ;
    }
        public static void main(String[] args) {
        String[] gang={"Shannon", "Adrian", "Jordan", "Alex", "Ty", "Sy" };
            System.out.println(getIndexByElement(gang,"Alex"));
    }
}



// Use element to find the index
        //Loop through the list
        //Check if element match index position
        //if true return index