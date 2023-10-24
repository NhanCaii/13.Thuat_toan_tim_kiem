import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int temp=0;
        String inputString = "Welcome" ;

        char[] charArray = inputString.toCharArray();
        Stack<String> str = new Stack<>();

        for (int i = 0; i < charArray.length; i++) {
            int num=(int) charArray[i];
            if (temp<num){
                str.push(String.valueOf(charArray[i]));
                temp=num;
            }
        }
        System.out.println(str);
    }
}