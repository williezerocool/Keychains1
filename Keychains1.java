/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keychains1;

import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class Keychains1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ky = new Scanner(System.in);
        int userInput;
        
        System.out.print("Ye Olde Keychain Shoppe\n" + "1. Add Keychains to Order\n" + "2. Remove Keychains from Order\n" + "3. View Current Order\n" + "4. Checkout\n" + "Please enter your choice: ");
        userInput = ky.nextInt();
        
        while(true){
        
            add_keychains();
            System.out.print("Please enter your choice: ");
            userInput = ky.nextInt();
            
            remove_keychains();
            System.out.print("Please enter your choice: ");
            userInput = ky.nextInt();
            
            view_order();
            System.out.print("Please enter your choice: ");
            userInput = ky.nextInt();
            
            checkout();
            System.out.print("Please enter your choice: ");
            userInput = ky.nextInt();
        }
    
    
    }
    
    public static void add_keychains(){
    
        
        System.out.print("ADD KEYCHAINS" + "\n" + "1. Add Keychains to Order\n" + "2. Remove Keychains from Order\n" + "3. View Current Order\n" + "4. Checkout\n" + "\n");
        
    }
    
    public static void remove_keychains(){
    
        
        System.out.print("REMOVE KEYCHAINS FROM ORDER" + "\n" + "1. Remove Keychains from Order\n" + "2. Add Keychains to Order\n"+ "3. View Current Order\n" + "4. Checkout\n" + "\n");
    }
    
    public static void view_order(){
    
        
        System.out.print("VIEW CURRENT ORDER" + "\n" + "1. View Current Order\n" + "2. Remove Keychains from Order\n" + "3. Add Keychains to Order\n" + "4. Checkout\n" + "\n");
   }
    
    public static void checkout(){
    
        
        System.out.print("CHECKOUT" + "\n" + "1. Checkout\n" + "2. View Current Order\n" + "3. Remove Keychains from Order\n" + "4. Add Keychains to Order\n" + "\n");
   }
    


}
