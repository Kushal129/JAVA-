package Package2;

import Package1.Gems;
import Package1.Price;

public class Jewellery extends Gems implements Price {
    private String jewelleryId;
    private String jewelleryName;
    private double goldWeight;
    private int numDiamonds;
    private double makingChargesPerGram;
    private Diamond diamond;

    public Jewellery(String jewelleryId, String jewelleryName, double goldWeight, int numDiamonds, double makingChargesPerGram, String gemId, String gemName) {
        super(gemId, gemName);
        this.jewelleryId = jewelleryId;
        this.jewelleryName = jewelleryName;
        this.goldWeight = goldWeight;
        this.numDiamonds = numDiamonds;
        this.makingChargesPerGram = makingChargesPerGram;
    }

    public double calculatePrice() {
        double goldPrice = getGoldPrice();
        double diamondPrice = getDiamondPrice();
        double totalGoldPrice = goldWeight * goldPrice;
        double totalDiamondPrice = numDiamonds * diamondPrice;
        double totalMakingCharges = makingChargesPerGram * goldWeight;
        return totalGoldPrice + totalDiamondPrice + totalMakingCharges;
    }

    @Override
    public double getGoldPrice() {
        return 50; 
    }

    @Override
    public double getDiamondPrice() {
        return 1000;
    }

    public void displayData() {
        System.out.println("Jewellery ID: " + jewelleryId);
        System.out.println("Jewellery Name: " + jewelleryName);
        System.out.println("Gold Weight (in grams): " + goldWeight);
        System.out.println("Number of Diamonds: " + numDiamonds);
        System.out.println("Making Charges Per Gram: " + makingChargesPerGram);
        System.out.println("Gem ID: " + getGemId());
        System.out.println("Gem Name: " + getGemName());
        System.out.println("Total Price: " + calculatePrice());
    }
}
