package chapterTwo;

import java.util.Scanner;
public class FindingRunawayLength{
public static void main(String[] args){
 Scanner following = new Scanner(System.in);

System.out.print("The value of speed in meter/second is:");
double speedMeter = following.nextDouble();

System.out.print("The value of acceleration in meters/secondSquared is :");
double accelerationSquared = following.nextDouble();

double minimumLength = speedMeter * speedMeter/(2*accelerationSquared);
System.out.printf("%.2f%n", minimumLength);

}
}
