/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_operators_2;
import java.util.Scanner;
/**
 *
 * @author Zemmy
 */
public class Java_Operators_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        int width;
        int depth;
        int result;
        
     System.out.println("What is the garden's width?");
     width = input.nextInt();
     
     System.out.println("What's the garden's depth?");
     depth = input.nextInt();
     
     result = width*depth;
     System.out.println("The garden size is: " + result + " square feet.");
        // TODO code application logic here
    }
    
}
