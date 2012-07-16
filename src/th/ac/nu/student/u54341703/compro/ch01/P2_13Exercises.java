package th.ac.nu.student.u54341703.compro.ch01;
import java.util.Scanner;
public class P2_13Exercises {
public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
        System.out.print("Enter Drive Letter(C,D,E):");
        String drive=in.nextLine();
        System.out.print("Enter Path:");
        String path=in.nextLine();
        System.out.print("Enter File name:");
        String fileName=in.nextLine();
        System.out.print("Enter Extension:");
        String extension=in.nextLine();
        System.out.println(drive+":\\"+path+"\\"+fileName+"."+extension+".");
         }
    }

