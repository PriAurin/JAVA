/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aurin.structuretest;

/**
 *
 * @author SK
 */
public class DevelopStructure {
     Structure Obj = new Structure();
    
    public DevelopStructure() {
       
    }

    
    public double produceStructure(double radius) {
        double volume = ((double) 4 / 3) * Math.PI * Math.pow(radius, 3);
        Obj.setStructureVolume(volume);
        return volume;
    }

     
    public double produceStructure(double radius, double height) {
        double volume = ((double) 1 / 3) * Math.PI * Math.pow(radius, 2) * height;
        Obj.setStructureVolume(volume);
        return volume;
    }

    
    public double produceStructure(double base, double height, double length) {
        double volume = ((double) 1 / 2) * (base * height) * length;
        Obj.setStructureVolume(volume);
        return volume;
    }
    
}
