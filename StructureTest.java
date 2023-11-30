/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aurin.structuretest;

/**
 *
 * @author SK
 */
public class StructureTest {

   public static void main(String[] args) {
        DevelopStructure Struct = new DevelopStructure();

       
        double volume1 = Struct.produceStructure(7.0);
        double volume2 = Struct.produceStructure(3.0, 4.0);
        double volume3 = Struct.produceStructure(2.5, 3.0, 4.0);

        System.out.println("Structure Volume 1: " + volume1);
        System.out.println("Structure Volume 2: " + volume2);
        System.out.println("Structure Volume 3: " + volume3);
    }
    
}
