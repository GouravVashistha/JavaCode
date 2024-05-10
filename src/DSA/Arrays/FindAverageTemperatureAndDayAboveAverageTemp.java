package DSA.Arrays;

import java.util.Scanner;

public class FindAverageTemperatureAndDayAboveAverageTemp {
    public static void main(String[] args) {

        // without using Array
        /**
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How Many Days Temperature? ");
        int numberOfDays = sc.nextInt();
        int sum = 0;
        int above  = 0;
        for(int i =1 ;i<=numberOfDays;i++){
            System.out.println("Day "+ i+" 's Temp: ");
            int next = sc.nextInt();
            sum = sum+next;
            if (next > (double) sum / i) {
                above++;
            }
        }
        double avg = sum/numberOfDays;
        System.out.println("Average Temperature is "+ avg);
        System.out.println("Number of days above average temperature: " + above);
        **/

        // using array

        Scanner sc = new Scanner(System.in);
        System.out.print("How many day's Temprature ? ");
        int numberOfDays = sc.nextInt();
        int[] temps= new int[numberOfDays];
        // find temp and average
        int sum = 0;
        for(int i = 0;i<numberOfDays;i++) {
            System.out.print("Days " + (i+1) +"'s high temp: ");
            temps[i] = sc.nextInt();
            sum+=temps[i];
        }
        // count  days above the
        double avg = sum/numberOfDays;

        int above = 0;
        for(int i= 0;i<temps.length;i++) {
            if(temps[i]>avg) {
                above++;
            }
        }
        System.out.println("Average Temp :"+ avg);

        System.out.println(above+ " days above the averge");


    }
}
