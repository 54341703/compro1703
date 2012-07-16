package th.ac.nu.student.u54341703.compro.ch01;

public class BooleanBitwiseOperator {
 public static void main(String[] args) {

 final int A = 1234;
 final int B = 9876;
 System.out.println("A = " + Integer.toBinaryString(A));
 System.out.println("B = " + Integer.toBinaryString(B));
 System.out.println("A & B = " + Integer.toBinaryString(A & B));
 System.out.println("A | B = " + Integer.toBinaryString(A | B));
 System.out.println("A ^ B = " + Integer.toBinaryString(A ^ B));
 System.out.println("A >> 4 = " + Integer.toBinaryString(A >> 4));
 System.out.println("A << 4 = " + Integer.toBinaryString(A << 4));
 System.out.println("~A = " + Integer.toBinaryString(~A));
 System.out.println("-A = " + Integer.toBinaryString(-A));
 System.out.println("-A >> 4 = " + Integer.toBinaryString(-A >> 4));
 System.out.println("-A >>> 4 = " + Integer.toBinaryString(-A >>> 4));
 }
 }   
