package christianjay;


import java.util.Scanner;

public class AirFare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       System.out.print("Enter distance in kilometer: ");
       double distance = scanner.nextDouble();
       
       System.out.print("Enter Class (1 for Economny, 2 for Business): ");
       int ClassChoice = scanner.nextInt();
       
       double baseFarePerKm = 0;
       if (ClassChoice == 1) {
           baseFarePerKm = 250;
       } else if (ClassChoice == 2){
           baseFarePerKm = 500;
       } else {
           System.out.println("Invalid class choice.");
           return;
       }
       
       double totalFare = distance * baseFarePerKm;
       if (distance > 1000){
           totalFare -= totalFare * 0.10;
       }
       System.out.printf("Total fare: %.2f\n", totalFare);
       
       scanner.close();
    }
}