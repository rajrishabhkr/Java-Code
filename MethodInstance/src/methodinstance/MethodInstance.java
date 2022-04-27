/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodinstance;

/**
 *
 * @author Rishabh
 */
public class MethodInstance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MethodId stu1 =new MethodId();
        stu1.id =10;
        stu1.name = "Rishi";
        stu1.age = 25;
        System.out.println(stu1.name + " is " + stu1.age + " Years old.");
    }
    
}
