package Package1;

import Package2.Manufacturer;
public class Item extends Manufacturer implements Concession {
    private String itemCode;
    private String itemName;
    private String itemCategory;
    private double price;
    private int stockPosition;
    private double apparelDiscount;
    private double electronicDiscount;
    private Supplier supplier;

    public Item(String itemCode, String itemName, String itemCategory, double price, int stockPosition, String manufacturerId, String manufacturerName, String manufacturerCity, int rating, double apparelDiscount, double electronicDiscount, Supplier supplier) {
        super(manufacturerId, manufacturerName, manufacturerCity, rating);
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.itemCategory = itemCategory;
        this.price = price;
        this.stockPosition = stockPosition;
        this.apparelDiscount = apparelDiscount;
        this.electronicDiscount = electronicDiscount;
        this.supplier = supplier;
    }

    @Override
    public double getApparelDiscount() {
        return apparelDiscount;
    }

    @Override
    public double getElectronicDiscount() {
        return electronicDiscount;
    }
}
