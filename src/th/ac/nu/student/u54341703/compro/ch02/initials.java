package th.ac.nu.student.u54341703.compro.ch02;
import java.util.Scanner;
/**
  This program prints a pair of initials.
 */
public class initials {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        //Get the names of the couple
        System.out.print("Enter your first name:");
        String first = in.nextLine();
        System.out.print("Enter your significant other's first name:");
        String second = in.nextLine();
        //Compute and display the inscription
        String initials = first.substring(0,1);
        second.substring(0,1);
        System.out.println(initials);
    }
    
    
}

