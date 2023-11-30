/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aurin.arraydemo;

/**
 *
 * @author SK
 */
import java.util.Scanner;
public class ArrayDemo {

    public static void main(String[] args) {
        int arr[]= new int[3];
        Scanner takeInput = new Scanner(System.in);
        
        Student stdArray[] = new Student[2];
        
        for(int i=0;i<stdArray.length;i++){
            
            String n = takeInput.next();
            String id = takeInput.next();
            
            Student s = new Student (n,id);
            stdArray[i] = s;
            
}
        for(int i = 0;i<stdArray.length;i++){
            Student s;
            s = stdArray[i];
            s.showName();
            s.showId();
            
        }
    }
}
