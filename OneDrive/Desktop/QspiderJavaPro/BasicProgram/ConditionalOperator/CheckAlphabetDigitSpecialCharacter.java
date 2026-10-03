package ConditionalOperator;

import java.util.Scanner;

public class CheckAlphabetDigitSpecialCharacter {
    public static void main(String[]agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character: ");
        char ch = sc.next().charAt(0);
        check(ch);
    }
    //check the alphabet,digit,special character
    public static void check(char ch){
        String result = (ch>='A'&& ch<='Z'|| ch>='a' &&ch<='z')?  "Alphabet: "+ch: (ch>='0' && ch<='9')? "Digit:"+ch:"Special Symbol: "+ch;
        System.out.println(result);
    }
}
