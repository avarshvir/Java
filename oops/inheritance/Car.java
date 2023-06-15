class Car extends Vehicle{
    
    String fuelType;    //fuel such as petrol,diesel, cng, battery.

    public void setFuelType(String fuelType){
        this.fuelType = fuelType;
    }

    public void getFuelType(){
        System.out.println("Fuel : "+fuelType);
    }
    public static void main(String args[]){
        Car car = new Car();
        car.setVehicle("Mahindra","Thar",2021);
        car.setFuelType("Diesel");
        car.getVehicle();
        car.getFuelType();
        
    }
}