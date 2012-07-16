package th.ac.nu.student.u54341703.compro.ch02;

import java.util.Scanner;
/**
  This program  print the total volum of a number of bottles and cans.
	*/
public class volume2 {
    public static void main(String[]args){
        final double BOTTLE_VOLUME = 2;
        final double LITER_PER_OUNCE = 0.0296;
        final double CAN_VOLUME = 12 * LITER_PER_OUNCE;
        //Display prompt
        System.out.print("Please enter the number of bottles: ");
        //Read number of bottles
        Scanner in = new Scanner(System.in);
        int bottles = in.nextInt();
        //Start the computation of the total volume
        double totalVolume = bottles * BOTTLE_VOLUME;
        //Read number of cans
        System.out.print("Please enter the number of cans: ");
        int cans = in.nextInt();
        double additionalVolume = cans * CAN_VOLUME;
        //Upadate the total volume
        totalVolume = totalVolume + additionalVolume;
        System.out.print("Total volume:");
        System.out.print(totalVolume);
}
}
