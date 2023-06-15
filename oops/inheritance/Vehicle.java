class Vehicle{
    String manufacturer;    //make, brand.
    String model;           //suv,xuv,family car, truck, motorcycle etc..
    int year;               //in which year car is launch.

    public void setVehicle(String manufacturer, String model, int year){
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

    public void getVehicle(){
        System.out.println("Manufacturer : "+manufacturer);
        System.out.println("Model : "+model);
        System.out.println("Year : "+year);
    }

    public static void main(String args[]){
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicle("TATA"," ",20);
        vehicle.getVehicle();

    }
}