package chapterFour;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        to calculate the combined miles per gallon
        int combinedMilesPerGallons = 0;



        System.out.println("enter any number to start program or -1 to end program ");
        int sentinel = scanner.nextInt();

        while(sentinel != -1){
            System.out.println("enter the miles driven: ");
             int miles = scanner.nextInt();

            System.out.println("enter the gallon used per drive: ");
            int gallonUsedPerDrive = scanner.nextInt();

            int milesPerGallon = miles * gallonUsedPerDrive;

            combinedMilesPerGallons += milesPerGallon;


            System.out.println("enter any number to continue program or -1 to end program ");
            sentinel = scanner.nextInt();

        }
        System.out.println("The total miles per gallon driven is "+combinedMilesPerGallons);


    }


}