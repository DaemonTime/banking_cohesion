import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Product {
    // variables
    DateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

    // save the Manufacture object
    Manufacturer manufacture;

    // save product name
    String productName;

    // save qty
    int quantity;

    // save the unit price
    double unitPrice;

    // save product date
    Date productCreated;

    // constructor
    public Product() {
        this.productName = "";
        this.quantity = 0;
        this.unitPrice = 0.0;
        this.productCreated = null;
        this.manufacture = null;
    }

    // parameter
    public Product(String prodName, int quantity, double unitPrice, Date productCreated, Manufacturer manufact) {
        this.productName = prodName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.productCreated = productCreated;
        this.manufacture = manufact;
    }

    // get date of the product
    public Date getProductCreated() {
        return productCreated;
    }

    // set date of the product
    public void setProductCreated(Date productCreated){
        this.productCreated = productCreated;
    }

    //get manufacturer object
    public Manufacturer getManufacture(){
        return manufacture;
    }

    //set manufacturer object
    public void setManufacture(Manufacturer manufacture){
        this.manufacture = manufacture;
    }

    // get name of product
    public String getProductName(){
        return productName;
    }

    // set name of product
    public void setProductName(String prodName){
        this.productName = prodName;
    }

    //get qty of product
    public int getQuantity(){
    return quantity;
    }

    // set qty of product
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    // get unit price
    public double getUnitPrice(){
        return unitPrice;
    }

    // set unit price
    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }

    // update qty of product
    public void updateQuantity(int quantityUpdate){
        quantity += quantityUpdate;
    }

    // update price of product
    public void updatePrice(double priceUpdate){
        this.unitPrice = priceUpdate;
    }

    // get product info
    public String getProductInfo(){
        String result = "";
        result += String.format("%-30s", productName);
        String dateForm = sdf.format(productCreated);
        result += String.format("\t %s", dateForm);
        result += String.format("%10d", quantity);
        result += String.format("\t%15.2f", unitPrice);
        result += String.format("\t%15s", manufacture.getCompanyName());
        result += String.format("\t%20s", manufacture.getCompanyAddress().getState());

        return result;
    }
}
