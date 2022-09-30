/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hroapp;

import java.util.ArrayList;

/**
 *
 * @author kcsar
 */
public class HROApp {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Employee> employeesList = new ArrayList<Employee>(); 
    
    public static void main(String[] args) {
        // TODO code application logic here
        landingPage lp = new landingPage();
        lp.show();
    }
}
