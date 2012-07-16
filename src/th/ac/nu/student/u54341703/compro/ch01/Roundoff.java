package th.ac.nu.student.u54341703.compro.ch01;

public class Roundoff {
    public static void main(String[]args){
        double price = 4.3;
        int cents = (int) (100*price); //Should be 100* 4.35 =435
        System.out.println(cents); //Print 434!
    }
    
}
