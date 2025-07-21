/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.division;

/**
 *
 * @author nishe
 */
public class InternationalDivision extends Division {
    private String country;
    private String language;

    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.println("International Division:");
        System.out.println("  Name: " + divisionName);
        System.out.println("  Account Number: " + accountNumber);
        System.out.println("  Country: " + country);
        System.out.println("  Language: " + language);
        System.out.println();
    }
}

