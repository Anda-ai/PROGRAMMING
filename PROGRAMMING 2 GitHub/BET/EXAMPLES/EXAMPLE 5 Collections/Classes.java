/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.util.ArrayList;
/**
 *
 * @author anda
 */
public class Classes {
    /**
     * @param args the command line arguments
     */
    ClassA people = new ClassA();
    ClassB deeds = new ClassB();
    public Classes(){
        System.out.println("Students: ");
        System.out.println(people.students);
        //or
        for(String student:people.students)  {
            System.out.println(student);
        }
        System.out.println("First student: ");
        System.out.println(people.students.get(0));
        System.out.println("Lectures: ");
        System.out.println(people.lectures);
        System.out.println("First lecture: ");
        System.out.println(people.lectures.get(0));
        System.out.println("Modules: ");
        //System.out.println(deeds.modules.toString());//this prints systematic values
        for (int i = 0; i < deeds.modules.length; i++) {
            System.out.println(deeds.modules[i]);
          }
        System.out.println("First module: ");
        System.out.println(deeds.modules[0]);
        
    }
    public static void main(String[] args) {
        Classes stud = new Classes();
    }
}
