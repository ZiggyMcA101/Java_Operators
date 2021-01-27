/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_operators_5;

import java.util.Scanner;

/**
 *
 * @author Zemmy
 */
public class Java_Operators_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String goc1;
        String goc2;
        String goc3;
        String goc4;
        String goc5;
        float price1;
        float price2;
        float price3;
        float price4;
        float price5;
        float total;

        System.out.println("We are making your Grocery List!");
        System.out.println();
        System.out.print("Enter in the 5 names of the groceries <press enter after each name>:");
        goc1 = input.next();
        goc2 = input.next();
        goc3 = input.next();
        goc4 = input.next();
        goc5 = input.next();

        System.out.println();

        System.out.print("Great! Now enter their corrisponding prices <press enter after each price>:");
        price1 = input.nextFloat();
        price2 = input.nextFloat();
        price3 = input.nextFloat();
        price4 = input.nextFloat();
        price5 = input.nextFloat();

        System.out.println();

        System.out.println("Grocery List");
        System.out.println();
        System.out.println(goc1 + ": $" + price1);
        System.out.println(goc2 + ": $" + price2);
        System.out.println(goc3 + ": $" + price3);
        System.out.println(goc4 + ": $" + price4);
        System.out.println(goc5 + ": $" + price5);

        System.out.println();

        total = price1 + price2 + price3 + price4 + price5;
        System.out.println("Total: $" + total);

        // TODO code application logic here
    }

}
