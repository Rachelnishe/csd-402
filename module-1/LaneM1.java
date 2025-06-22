/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lane.m1;

/**
 *
 * @author nishe
 */
import java.util.Scanner;

public class LaneM1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Water Heating Energy Calculator");
        System.out.println("-------------------------------");
        System.out.println("This program calculates the energy needed to heat water.");
        System.out.println("Formula: Q = waterMass ( finalTemperature – initialTemperature ) x 4184");
        System.out.println();
        
        try {            
            System.out.print("Enter the amount of water in kilograms: ");
            double waterMass = scanner.nextDouble();
            
            System.out.print("Enter the initial temperature in Celsius: ");
            double initialTemperature = scanner.nextDouble();
            
            System.out.print("Enter the final temperature in Celsius: ");
            double finalTemperature = scanner.nextDouble();
            
            
            if (waterMass <= 0) {
                System.out.println("Error: Water mass must be positive.");
                return;
            }
            
            if (finalTemperature <= initialTemperature) {
                System.out.println("Error: Final temperature must be higher than initial temperature.");
                return;
            }
            
            
            double temperatureDifference = finalTemperature - initialTemperature;
            double energyJoules = waterMass * temperatureDifference * 4184;
            
            
            System.out.println();
            System.out.println("===============================");
            System.out.println("RESULTS");
            System.out.println("===============================");
            System.out.printf("Water mass: %.2f kg%n", waterMass);
            System.out.printf("Initial temperature: %.2f°C%n", initialTemperature);
            System.out.printf("Final temperature: %.2f°C%n", finalTemperature);
            System.out.printf("Temperature difference: %.2f°C%n", temperatureDifference);
            System.out.printf("Energy required: %,.2f Joules%n", energyJoules);
            
            
            double energyKJ = energyJoules / 1000;
            double energyKWh = energyJoules / 3600000;
            
            System.out.println();
            System.out.println("Additional conversions:");
            System.out.printf("Energy required: %,.2f kJ (kilojoules)%n", energyKJ);
            System.out.printf("Energy required: %.6f kWh (kilowatt-hours)%n", energyKWh);
            
        } catch (Exception e) {
            System.out.println("Error: Please enter valid numeric values.");
        } finally {
            scanner.close();
        }
    }
}