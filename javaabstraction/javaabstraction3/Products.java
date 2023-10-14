package javaabstraction3;
abstract class Products{
    private String category;
    private String productName;
    private long price;
    public Products(String category, String productName, long price){
        this.category = category;
        this.productName = productName;
        this.price = price;
    }
    abstract public String getManufacturer();
    abstract public String getAuthor();

    // non abstract method
    public void justAName(){
        System.out.println("This is just a testing that abstract class can include abstract method also");
    }
}