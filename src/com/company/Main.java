package com.company;

public class Main
{
    public static void main(String[] args)
    {
	    // write your code here
        BonusMilesService milesCalculationService = new BonusMilesService();
        int price = 10_017;
        int miles = milesCalculationService.calculate(price);
        
        System.out.println("бонусные мили: "+ miles);
    }
}
