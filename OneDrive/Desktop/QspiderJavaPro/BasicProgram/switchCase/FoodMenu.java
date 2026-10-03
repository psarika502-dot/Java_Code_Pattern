package switchCase;

import java.util.Scanner;

public class FoodMenu {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1| dosa");
        System.out.println("2| Idli");
        System.out.println("3| Sambhar");
        System.out.println("4| Chatni");

        System.out.println("");
        System.out.println("================================");
        System.out.println();

        //select choise and enter
        System.out.println("Enter the Dish Number: ");
        int choice = sc.nextInt();
        System.out.print("______________________");
        System.out.println();
        System.out.println("");

        //condition
        switch (choice){
            case 1: {
                System.out.println("dosa ordered");
            }break;
            case 2:{
                System.out.println("Idli ordered");
            }break;
            case 3:{
                System.out.println("Sambhar oredered");
            }break;
            case 4:{
                System.out.println("Chatni ordered");
            }break;
            default :{
                System.out.println("Not Available");
            }
        }
    }
}
