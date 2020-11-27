/*


                   Bismillahir Rahmanir Rahim 
            Read the name of Allah, who created you.
            
            Author : Tabanoon mim
            Department of CSE, Institute of science & technology,Dhaka, Bangladesh.

*/
//simple input out
package com.Yuki;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


                String name,adress,subject;
                int roll;
                float weather;

                Scanner input=new Scanner(System.in);
                System.out.println("Enter your Name:");
                name=input.nextLine();

                Scanner input2=new Scanner(System.in);
                System.out.println("Enter your Adress:");
                adress=input2.nextLine();

                Scanner input3=new Scanner(System.in);
                System.out.println("Enter your Subject:");
                subject=input3.nextLine();

                Scanner input4=new Scanner(System.in);
                System.out.println("Enter your Roll:");
                roll=input4.nextInt();

                Scanner input5=new Scanner(System.in);
                System.out.println("Today's weather:");
                weather=input5.nextFloat();

                LocalDate now=LocalDate.now();
                //using java cureent time

                System.out.println("Name:"+name);
                System.out.println("Adress:"+adress);
                System.out.println("Subject:"+subject);
                System.out.println("Roll:"+roll);
                System.out.println("\n");
                System.out.println("Today's weather:"+weather+"F");
                System.out.println("Today's date:"+now);



    }
}
