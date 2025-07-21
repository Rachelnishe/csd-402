/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.division;

/**
 *
 * @author nishe
 */
public class DomesticDivision extends Division {
    private String state;

    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    @Override
    public void display() {
        System.out.println("Domestic Division:");
        System.out.println("  Name: " + divisionName);
        System.out.println("  Account Number: " + accountNumber);
        System.out.println("  State: " + state);
        System.out.println();
    }
}

