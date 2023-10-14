package vehicleabstraction;
abstract class Vehicle{
    abstract void start();
    public abstract void stop();
}
class Car extends Vehicle{
    void start(){
        System.out.println("The Car is start");
    }
    public void stop(){
        System.out.println("The Car is stop");
    }
}
class MotorCycle extends Vehicle{
    void start(){
        System.out.println("The MotorCycle is start");
    }
    public void stop(){
        System.out.println("The MotorCycle is stop");
    }
}
class VehicleAbstraction{
    public static void main(String args[]){
        Vehicle v = new Car();
        v.start();
        Car car = new Car();
        car.start();
        car.stop();
        MotorCycle motorCycle = new MotorCycle();
        motorCycle.start();
        motorCycle.stop();
    }
}