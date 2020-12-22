/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exc;


import java.util.Scanner;


public class Exc {
private static String name = "Sana";
private static int age = 19;

public static void print(String name,int age){
    if(age>=18)
        System.out.println(  "مبروك يا " +name + "سوف تحصل على شهادة قيادة ");
    else 
         System.out.println(  "للأسف يا " +name + " ما زلت صغيرا للحصول على الرخصة");
}
    public static void main(String args[]) {
        for (int i = 0; i < 3; i++) {
            print(name,age);
        }
    }}
        
    

