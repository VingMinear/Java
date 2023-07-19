/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package after.midterm;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author N E A
 */
public class AfterMidterm {

    private static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
  try {
            int n;
            System.out.print("Enter number of element = ");
            n = cin.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                System.out.print("Enter a[" + i + "] : ");
                a[i] = cin.nextInt();
            }
            int[] temp = a;
            int value;
            int count = 0;
            
            print("Enter index to remove : ");
            value = cin.nextInt();
            
            for (int item : a) {
                if (value == item) {
                    count++;
                }
            }
            
            if (count == 0) {
                println("\nNot Found value in array!\n");
            } else {
                println("\nFound " + count + " value(s) in array!\n");
            }
            
            a = new int[a.length - count];
       
            for (int i = 0, j = 0; i < temp.length; i++) {
                if (value == temp[i]) {
                    continue;
                }
                a[j] = temp[i];
                j++;
            }
            temp = null;
            println("------------Data--------------\n");
            if (a.length != 0) {
                for (int i = 0; i < a.length; i++) {
                    println(" - a[" + i + "] \t: " + a[i]);
                }
            } else {
                println("\tNo more Data");
            }
            println("\n------------------------------");
            
        } catch (Exception e) {
            println("Error : " + e);
        }
    }
    private static void println(Object text) {
        System.out.println(text);
    }

    private static void print(Object text) {
        System.out.print(text);
    }

}
