class Truck extends Vehicle{
    String fuelType;    //fuel such as petrol,diesel, cng, battery.

    public void setFuelType(String fuelType){
        this.fuelType = fuelType;
    }

    public void getFuelType(){
        System.out.println("Fuel : "+fuelType);
    }

    public static void main(String args[]){
        Truck truck = new Truck();
        truck.setVehicle("BharatBenz","Truck",2019);
        truck.setFuelType("Diesel");
        truck.getVehicle();
        truck.getFuelType();
    }
    

}