/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SK
 */
public class Circle {
    
    public double radius;
    public String color;
    
   public Circle(){
}
   public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    
   public double calculateArea( double radius)
    {
        double area = Math.PI * radius * radius;
        return area;
    }
    
}


