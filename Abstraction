/* Abstraction basically means hiding sensitive information and only displaying the required information to the user. There are basically two main components in abstraction - abstract method and abstract class*/

Code Snippet :

abstract class Vehicle{
    abstract void engine();
    void cost(double price){
        System.out.println("Price is:" + (price + 10000));
    }
}
class Car extends Vehicle{
    void engine(){
        System.out.println("Car engine");
    }
}
class Bus extends Vehicle{
    void engine(){
        System.out.println("Bus engine");
    }
}
class Main{
    public static void main(String[] args){
        Vehicle v1 = new Car();
        v1.engine();
        Car c1 = new Car();
        c1.engine();
        Vehicle v2 = new Bus();
        v2.engine();
        Bus b1 = new Bus();
        b1.engine();
    }
}

Output:

Car engine
Car engine
Bus engine
Bus engine
