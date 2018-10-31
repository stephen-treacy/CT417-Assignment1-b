
package com.mycompany.assignment1partb;

import com.mycompany.assignment1parta.*;
import java.util.ArrayList;
import org.joda.time.DateTime;

public class Driver {
    
    public static void main(String[] args)  {
        ArrayList<Module> modules = new ArrayList<Module>();
        ArrayList<Course> course = new ArrayList<Course>();
        
        Course ComputerScience = new Course("BCT", new DateTime("2015-09-05"), new DateTime("2019-05-20"));
        Course Commerce = new Course("BC", new DateTime("2015-09-05"), new DateTime("2019-05-20"));
        
        Student KevinHart = new Student("Kevin Hart", 20, "04/10/1998", "15326154");
        Student KevinBridges = new Student("Kevin Bridges", 19, "02/03/1999", "14215497");
        Student NickCannon = new Student("Nick Cannon", 21, "20/06/1997", "16544846");
        Student TommyTiernan = new Student("Tommy Tiernan", 25, "16/14/1993", "16442012");
        
        Module SoftEng = new Module("Software Engineering", "CT417", KevinHart, ComputerScience);
        Module Data = new Module("Database Systems", "CT411", KevinBridges, ComputerScience);
        Module Management = new Module("Management Accounting", "MA421", NickCannon, Commerce);
        Module Money = new Module("Money and Banking", "MA416", TommyTiernan, Commerce);
        
        SoftEng.setStudents(new Student[]{KevinBridges});
        Data.setStudents(new Student[]{KevinHart});
        Management.setStudents(new Student[]{TommyTiernan});
        Money.setStudents(new Student[]{NickCannon});
        
        modules.add(SoftEng);
        modules.add(Data);
        modules.add(Management);
        modules.add(Money);
        
        ComputerScience.setModules(new Module[]{SoftEng, Data});
        Commerce.setModules(new Module[]{Management, Money});
        course.add(ComputerScience);
        course.add(Commerce);
        
        System.out.println("Courses");
        for(int i=0;i<course.size();i++)    {
            
            System.out.println(course.get(i).getName());
            System.out.println("Modules in this course");
            
             for (int j = 0; j < course.get(i).getModules().length; j++)    {
                 
                 System.out.println(course.get(i).getModules()[j].getName());
                 System.out.println("Students in this module");
                 
                 for (Student k : modules.get(j).getStudents()) {
                     
                    System.out.println("Name: " + k.getName());
                     System.out.println(" ID: " + k.getUsername());
                }
             }
                 
        }
        
        
        
    }
}
