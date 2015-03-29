/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolist;

import java.util.Date;

/**
 *
 * @author lokesh
 */
public class Task {

    String name;
    String descrption;
    Date date;
    /**
     * @param args the command line arguments
     */
    
    Task(String name,String descrption,Date date)
    {
        this.name = name;
        this.descrption = descrption;
        this.date = date;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
