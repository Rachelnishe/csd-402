/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Rachel Lane M12
 * @author nishe
 */
public class YearlyService {

    public static double yearlyService() {
        return 75;
    }

    public static double yearlyService(double oilChangeFee) {
        return yearlyService() + oilChangeFee;
    }

    public static double yearlyService(double oilChangeFee, double tireRotationFee) {
        return yearlyService(oilChangeFee) + tireRotationFee;
    }

    public static double yearlyService(double oilChangeFee, double tireRotationFee, double couponAmount) {
        return yearlyService(oilChangeFee, tireRotationFee) - couponAmount;
    }
}
