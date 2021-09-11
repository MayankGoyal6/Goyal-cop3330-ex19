/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 19
 *  Copyright 2021 Mayank Goyal
 */

 import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  
  Scanner scanner = new Scanner(System.in);

   System.out.println("What is your weight? ");
   double weight = scanner.nextInt();

   System.out.println("What is your height? ");
   double height = scanner.nextInt();
  
   double BMI = ((weight / (height * height)) * 703);

   if(BMI > 18.5 && BMI < 25)
   {
     System.out.print("Your BMI is " + String.format("%.1f", BMI) + "\nYou are within the ideal weight range.");
   }

   if(BMI < 18.5)
   {
     System.out.print("Your BMI is " + String.format("%.1f", BMI) + "\nYou are underweight. You should see your doctor.");
   }

   if(BMI > 25.0)
   {
     System.out.print("Your BMI is " + String.format("%.1f", BMI) + "\nYou are overweight. You should see your doctor.");
   }

  }
}