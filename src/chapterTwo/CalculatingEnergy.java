package chapterTwo;

import java.util.Scanner;
public class CalculatingEnergy{
public static void main(String[] args){
Scanner dekanords = new Scanner(System.in);


System.out.print("Enter the amount of water in kilogram: ");
double amountOfWaterInKilogram = dekanords.nextDouble();

System.out.print("Enter the initial temperature: ");
double initialTemperature = dekanords.nextDouble();

System.out.print("Enter the final temperature: ");
double finalTemperature = dekanords.nextDouble();

double Q = amountOfWaterInKilogram *(finalTemperature -initialTemperature)*4184;
System.out.print("The energy needed is" + Q);

}
}
