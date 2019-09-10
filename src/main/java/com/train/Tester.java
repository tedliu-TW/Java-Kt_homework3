package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        int num1=0,num2;  //num1 = ticked
        Scanner scanner = new Scanner(System.in);
        while (num1!=-1 ){
            System.out.println("Please enter number of tickets: ");
            num1 = scanner.nextInt();
            if (num1==-1){ //ticked=-1 end the process
                break;
            }
            System.out.println("How many round-trip tickets: ");
            num2 =scanner.nextInt();
            System.out.println("Total tickets:" + num1 );
            System.out.println("Round-Trip:" + num2 );
            Ticket num = new Ticket(num1,num2);
            System.out.println("Total:"+num.cal());


        }








    }

}
