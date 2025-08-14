package christianjay;

import java.util.Scanner;

public class Christianjay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks in Science: ");
        int Science = sc.nextInt();

        System.out.print("Enter marks in History: ");
        int History = sc.nextInt();

        System.out.print("Enter marks in Math: ");
        int Math = sc.nextInt();

        System.out.print("Enter marks in Soc: ");
        int Soc = sc.nextInt();

        System.out.print("Enter marks in Arts: ");
        int Arts = sc.nextInt();

        int total = Science + History + Math + Soc + Arts;
        double percentage = total / 5.0;

        String remarks;
        if (percentage < 70) {
            remarks = "Fail";
            System.out.println("\nTotal Marks: " + total);
            System.out.printf("Total Percentage: %.2f\n", percentage);
            System.out.println("Remarks: " + remarks);
            System.out.println("Try Again " + name);
        } else if (percentage <= 75) {
            remarks = "Poor";
        } else if (percentage <= 80) {
            remarks = "Fair";
        } else if (percentage <= 85) {
            remarks = "Good";
        } else if (percentage <= 90) {
            remarks = "Good";
        } else {
            remarks = "Excellent";
        }

        if (percentage >= 70) {
            System.out.println("\nTotal Marks: " + total);
            System.out.printf("Total Percentage: %.2f\n", percentage);
            System.out.println("Remarks: " + remarks);
            System.out.println("Congrats " + name + " you Passed.");
        }
    }
}