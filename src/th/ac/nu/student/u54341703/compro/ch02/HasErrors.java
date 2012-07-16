package th.ac.nu.student.u54341703.compro.ch02;
import java.util.Scanner;
public class HasErrors {
    public static void main(String[]args){
    int x = 0;
    int y = 0;
    Scanner in = new Scanner("System.in");
    System.out.print("Please enter an integer");
    x = in.nextInt();
    System.out.print("Please enter an integer");
    x = in.nextInt();
    System.out.println("The sum is "+ x + y);
    }
}
