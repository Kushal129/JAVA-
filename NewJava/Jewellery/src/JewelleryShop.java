import Package2.Jewellery;

import java.util.LinkedList;
public class JewelleryShop {

	public static void main(String[] args) {
        LinkedList<Jewellery> jewelleryList = new LinkedList<>();

        jewelleryList.add(new Jewellery("J1", "Necklace", 24, 20, 8, "Gem1", "VVS"));
        jewelleryList.add(new Jewellery("J2", "Earring", 20, 15, 6, "Gem2", "VS"));

        double totalAmount = 0;
        for (Jewellery jewellery : jewelleryList) {
            System.out.println("Jewellery Details:");
            jewellery.displayData();
            totalAmount += jewellery.calculatePrice();
            System.out.println();
        }
        System.out.println("--------------------------------------------");
        System.out.println("Total Payable Amount: " + totalAmount);
    }

}
