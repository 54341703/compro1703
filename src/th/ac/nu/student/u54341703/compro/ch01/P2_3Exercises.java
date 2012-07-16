package th.ac.nu.student.u54341703.compro.ch01;
import java.util.Scanner;
public class P2_3Exercises {
    public static void main(String args[]) {
        
        double miles=0.0006;  //1 meters=0.0006miles//
        double feet=3.2808399;  //1 meters=3.2808399feet//
        double inches=39.3700787;  //1 meters=39.3700787inches//
       
        Scanner in=new Scanner(System.in);
        System.out.print("Enter meters:");
        double meters=in.nextDouble();
        System.out.println("Miles is:"+meters*(miles));
        System.out.println("Feet is:"+meters*(feet));
        System.out.println("Inches is:"+meters*(inches)); 
    }
}