/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author anda
 */


/*
This class in not used, but for demonstration of abstract class
*/
public class ClassC extends Classes{
    public ClassC(){
        /*ClassB calc = new ClassB();*/ //class B is abstract so cannot be accessed like this
                                        // can only be accessed through inheritance
        ClassA calc = new ClassA(5); //class A is not abstract so can be accessed like this
                                     // and also through inheritance
    }
}
