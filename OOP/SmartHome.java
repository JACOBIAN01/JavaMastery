// 1️⃣ Smart Home Automation System
// Design a Smart Home System where:

// Create an abstract class Appliance with attributes like brand, powerConsumption, and abstract methods turnOn() and turnOff().
// Create subclasses Fan, Light, and AirConditioner, each implementing the abstract methods differently.
// Implement a SmartHome class to manage all appliances.

package OOP;

abstract class Appliance{
    String brand;
    int Power;
    abstract void turnOn();
    abstract void turnOff();
}

class Fan extends Appliance{

    public Fan(String brand,int Power)
    {
    this.brand = brand;
    this.Power = Power;
    }

    void turnOff(){
        System.out.println("Fan OFF");
    }

    void turnOn(){
        System.out.println("Fan ON");
    }
}

public class SmartHome{
 public static void main(String[] args) {
       Fan f=new Fan("NeoFan",500);
       System.out.println(f.Power);
       System.out.println(f.brand);
       f.turnOff();
       f.turnOn();
 }
}

