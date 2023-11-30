/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SK
 */
public class Staff {
    public String officeName;
    private String firstName;
    private String lastName;
    private double monthlySalary;
    
    public Staff(){
    
}
    public Staff(String officeName){
        this.officeName = officeName;
    }
    
public Staff(String firstName, String lastName, double monthlySalary){
    this.firstName = firstName;
    this.lastName= lastName;
    this.monthlySalary = monthlySalary;
}
public String getfirstName(){
    return firstName;
}
public String getlastName(){
    return lastName;
}
public double getmonthlySalary(){
    return monthlySalary;
}

public double AnnualSalary(){
    double totalSalary= 12*monthlySalary;
    return totalSalary;
}

}
    
