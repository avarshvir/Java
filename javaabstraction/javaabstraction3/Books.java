package javaabstraction3;
class Books extends Products{
    private String category;
    private String productName;
    private long price;
    private String author;
    private String manufacturer;

    public Books(String category, String productName, long price, String manufacturer, String author){
        //this.category = category;
        //this.productName = productName;
        super(category,productName,price);
        this.manufacturer = manufacturer;
        this.author = author;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public String getAuthor(){
        return author;
    }
}