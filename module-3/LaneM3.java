/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lane.m3;

/**Rachel Lane M3 programming assignment 
 *
 * @author nishe
 */
public class LaneM3 {

    public static void main(String[] args) {
        int rows = 7; 
        
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print("  ");
            }
           
            for (int j = 0; j < i; j++) {
                System.out.print((int)Math.pow(2, j) + " ");
            }

            for (int j = i - 2; j >= 0; j--) {
                System.out.print((int)Math.pow(2, j) + " ");
            }

            int spacesForAt = (rows - i) * 2;
            for (int k = 0; k < spacesForAt; k++) {
                System.out.print(" ");
            }

            System.out.println("@");
        }
    }
}
