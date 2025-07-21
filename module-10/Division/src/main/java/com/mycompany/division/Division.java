/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.division;

/**
 *
 * @author nishe
 */
public abstract class Division {
    protected String divisionName;
    protected int accountNumber;

    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    public abstract void display();
}

