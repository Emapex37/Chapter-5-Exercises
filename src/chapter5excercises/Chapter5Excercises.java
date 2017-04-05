/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chapter5excercises;

import java.util.Scanner;
import java.text.*;
/**
 *
 * @author EvMcQ5970
 */
public class Chapter5Excercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Number format
        NumberFormat currency = new DecimalFormat("$#,###,###.00");
        
        //Variables
        int copynum;
        double cost;
        
        
        //Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of copies to be printed: ");
        copynum = input.nextInt();
        
        
        //If statements
        if (copynum > 0 && copynum <= 99) {
            System.out.println("Price per copy is: $0.30");
            cost = (double)copynum * 0.30;
            System.out.println("Total cost is: " + (currency.format(cost)));
        } else if (copynum >= 100 && copynum <= 499){
            System.out.println("Price per copy is: $0.28");
            cost = (double)copynum * 0.28;
            System.out.println("Total cost is: " + (currency.format(cost)));
        } else if (copynum >= 500 && copynum <= 749) {
            System.out.println("Price per copy is: $0.27");
            cost = (double)copynum * 0.27;
            System.out.println("Total cost is: " + (currency.format(cost)));
        } else if (copynum >= 750 && copynum <= 1000) {
            System.out.println("Price per copy is: $0.26");
            cost = (double)copynum * 0.26;
            System.out.println("Total cost is: " + (currency.format(cost)));
        } else if (copynum > 1000) {
            System.out.println("Price per copy is: $0.25");
            cost = (double)copynum * 0.25;
            System.out.println("Total cost is: " + (currency.format(cost)));
        }
        
        input.close();
        
    }
    
}
