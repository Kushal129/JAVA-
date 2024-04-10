package Package3;

public class Supplier {
	private String supplierId;
    private String supplierName;
    private String contactNumber;
    private String emailId;
    private String supplierCategory;

    public Supplier(String supplierId, String supplierName, String contactNumber, String emailId, String supplierCategory) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.contactNumber = contactNumber;
        this.emailId = emailId;
        this.supplierCategory = supplierCategory;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getSupplierCategory() {
        return supplierCategory;
    }
}
