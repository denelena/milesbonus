package com.company;

public class Main {
    public static void main(String[] args) {
        // write your code here
        BonusMilesService milesCalculationService = new BonusMilesService();
        int pricePaid = 10_017;
        int bonusMiles = milesCalculationService.calculate(pricePaid);

        System.out.println("бонусные мили: " + bonusMiles);
    }
}
