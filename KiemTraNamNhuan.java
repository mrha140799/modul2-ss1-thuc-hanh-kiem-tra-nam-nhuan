package SS1TH7;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter year : ");
        int year = scn.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.printf("%d is a leap year", year);
                } else {
                    System.out.printf("%d is NOT a leap year", year);
                }
            } else {
                System.out.printf("%d is a leap year", year);
            }
        } else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}
