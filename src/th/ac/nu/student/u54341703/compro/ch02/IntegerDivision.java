package th.ac.nu.student.u54341703.compro.ch02;

import java.util.Scanner;
public class IntegerDivision {
public static void main(String[]args){
System.out.print("Please enter your last three test scores:");
Scanner in = new Scanner(System.in);
int s1 = in.nextInt();
int s2 = in.nextInt();
int s3 = in.nextInt();
double average = (s1 + s2 + s3)/3;//Error
System.out.printf("Your averge score is %8.2f", average);

}
}
