/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aurin.arraydemo;

/**
 *
 * @author SK
 */


public class Student {
    private String name,id;
 
    Student(String name,String id){
        this.name= name;
        this.id = id;
    }
    Student(){
        this.name = "";
        this.id = "";
    }
    String getName(){
        return name;
    }
    String getId(){
        return id;
    }
    void showName(){
        System.out.println("Name: "+ name);
    }
    void showId(){
        System.out.println("ID: "+ id);
    }
}

