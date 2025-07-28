/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Rachel Lane M12
 * @author nishe
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Standard service cost: " + YearlyService.yearlyService());
        System.out.println("The cost of standard service with an oil change is: " + YearlyService.yearlyService(50));
        System.out.println("The cost of a standard service with an oil change and tire rotation is: " + YearlyService.yearlyService(50, 20));
        System.out.println("The cost of a standard service with an oil change, tire rotation, and a coupon for $25 is: " + YearlyService.yearlyService(50, 20, 25));
    }
}
