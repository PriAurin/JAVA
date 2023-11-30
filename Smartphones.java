/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.smartphones;

/**
 *
 * @author SK
 */
public class Smartphones {

    public static void main(String[] args) {
        
        //int a = 5;
        Smartphone obj = new Smartphone("Samsung","Android",16);
        Smartphone obj1 = new Smartphone("Pixel","Android",16);
         
        //obj.setVariables("Samsung","Android",16);
        
        /*obj.model = "Samsung";
        obj.OS = "Android";
        obj.RAM = 16;
        
        obj.model = "Pixel";
        obj.OS = "Android";
        obj.RAM = 16;*/
        
        System.out.println("Model " + obj.model);
        System.out.println("OS " + obj.OS);
        System.out.println("RAM " + obj.RAM);
        
        System.out.println("Model " + obj1.model);
        System.out.println("OS " + obj1.OS);
        System.out.println("RAM " + obj1.RAM);
        
        
    }
}
