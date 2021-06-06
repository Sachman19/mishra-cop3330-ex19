/*
 *  UCF COP3330 Summer 2021 Assignment 19 Solution
 *  Copyright 2021 Sachin Mishra
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your weight in lbs. ");
        double weight = input.nextDouble();

        System.out.print("Please enter your height in inches. ");
        double height = input.nextDouble();

        double bmi = (weight / (height * height)) * 703;
        System.out.printf("Your BMI is %.1f.%n", bmi);

        if(bmi < 18.5){
            System.out.print("You are underweight. Please see a doctor.");
        }
        else if(bmi <= 25){
            System.out.print("You are within a healthy weight range.");
        }
        else{
            System.out.print("You are overweight. Please see a doctor.");
        }
    }
}