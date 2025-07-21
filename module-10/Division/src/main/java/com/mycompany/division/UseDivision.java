/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.division;

/**
 *
 * @author nishe
 */

public class UseDivision {
    public static void main(String[] args) {
        Division intDiv1 = new InternationalDivision("Alibaba Group", 784974, "China", "Chinese");
        Division intDiv2 = new InternationalDivision("AEON", 989898, "Japan", "Japanese");

        Division domDiv1 = new DomesticDivision("Apple", 589645, "California");
        Division domDiv2 = new DomesticDivision("Microsoft", 246784, "Washington");

        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}

