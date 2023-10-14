package javaabstraction3;
class Electronics extends Products{
    private String category;
    private String productName;
    private long price;
    private String manufacturer;

    public Electronics(String category, String productName, long price, String manufacturer){
        //this.category = category;
        //this.productName = productName;
        super(category,productName,price);
        this.manufacturer = manufacturer;
    }
    public String getManufacturer(){
        return manufacturer;
    }
}