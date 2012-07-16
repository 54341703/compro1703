package th.ac.nu.student.u54341703.compro.ch01;

import java.util.Scanner;
/**
   This program prints the price per liter for a six-pack of cans.
 */
public class volume3 {
    public static void main(String[]args){
    //Red price per pack
     Scanner in = new Scanner(System.in);
     System.out.print("Please enter the print for a six-pack; ");
     double packPrice = in.nextInt();
     //Compute pack volume
     final double LITER_PER_OUNCE = 0.0296;
     final double CAN_VOLUME = 12 * LITER_PER_OUNCE;
     final double PACK_VOLUME = 6 * CAN_VOLUME;
     //Compute and print price per liter
     double pricePerLiter = packPrice / PACK_VOLUME;
     System.out.printf("Price per liter : %8.2f",pricePerLiter);
     System.out.println();
}
}
