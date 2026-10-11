package lecture_4;

import java.util.Scanner;

public class Loops {
    public static void main(String args[]){

        // hello world 100 print 

        
        // for(int counter = 0; counter < 100; counter = counter + 1){
        //     System.out.println("Hello world");
        // }


        // 1 to 100 print for loops


        // for(int counter = 0; counter < 11; counter++){
        //     System.out.print(counter+" ");
        // }


        // 1 to 100 print for loops

        // for(int i = 0; i < 11; i++){
        //     System.out.println(i);
        // }


        // 1 to 100 print while loops

        // int i = 0;
        // while(i < 11){
        //     System.out.println(i);
        //     i = i + 1;
        // }


        // 1 to 100 print do loops

        // int i = 0;
        // do{
        //     System.out.println(i);
        //     i = i + 1;
        // } while(i < 11);


        // print the sum of first n Natural Numbers

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // int sum = 0;
        // for(int i = 0; i<=n; i++){
        //     sum = sum + i;
        // }

        // System.out.println(sum);

        // sc.close();


        // print the table of a number input by user

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<11; i++){
            System.out.println(i*n);
        }

        sc.close();


        
    }
}
