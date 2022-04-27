/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem;

/**
 *
 * @author Rishabh
 */
public class SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=90;
        switch(x){
            case 100:
                System.out.println("Very good");
                break;
            case 90:
                System.out.println("good");
                break;
            case 80:
                System.out.println("A+");
                break;
            case 70:
                System.out.println("A");
                break;
            case 60:
                System.out.println("A-");
                break;
            case 50:
                System.out.println("okk");
                break;
            default:
                System.out.println("Fail");
            
        }
    }
    
}
