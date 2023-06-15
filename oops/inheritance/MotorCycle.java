class MotorCycle extends Vehicle{
    
    String fuelType;    //fuel such as petrol,diesel, cng, battery.

    public void setFuelType(String fuelType){
        this.fuelType = fuelType;
    }

    public void getFuelType(){
        System.out.println("Fuel : "+fuelType);
    }
    public static void main(String args[]){
        MotorCycle motorcycle = new MotorCycle();
        motorcycle.setVehicle("Hero Motors","Splendor",2012);
        motorcycle.setFuelType("Petrol");
        motorcycle.getVehicle();
        motorcycle.getFuelType();
        
    }
}