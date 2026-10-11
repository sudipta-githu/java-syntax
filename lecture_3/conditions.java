package lecture_3;

import java.util.*;

public class conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1st program
        // int age = sc.nextInt();
        // if(age > 18) {
        //     System.out.println("Adult");
        // }else{
        //     System.out.print("Not Adult");
        // }
        // 1st program closed



        // 2nd program
        // int x = sc.nextInt();

        // if(x % 2 == 0) {
        //     System.out.println("Even");
        // }else{
        //     System.out.println("Odd");
        // }
        // 2nd program closed



        // 3rd program
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // if(a == b){
        //     System.out.println("Equal");
        // }else{
        //     if(a > b){
        //         System.out.println("a is greater");
        //     }else{
        //         System.out.println("a is lesser");
        //     }
        // }
        // 3rd program closed


        // 4th program

        // int button = sc.nextInt();

        // if(button == 1){
        //     System.out.println("Hello");
        // }else if(button == 2){
        //     System.out.println("Namaste");
        // }else if(button == 3){
        //     System.out.println("Bonjour");
        // }else{
        //     System.out.println("Invalid Button");
        // }
        // 4th program closed



        // 5th program open

        int button = sc.nextInt();

        switch(button){
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default : System.out.println("Invalid Button");
        }
        // 5th program closed
        sc.close();

    }
}
