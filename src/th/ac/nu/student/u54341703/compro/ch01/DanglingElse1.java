package th.ac.nu.student.u54341703.compro.ch01;
public class DanglingElse1 {

 public static void main(String[] args) {
 int x = 5;
 if (x < 5)
 if (x > 5)
 System.out.println('b');
 else
 System.out.println('a');
 }
 }