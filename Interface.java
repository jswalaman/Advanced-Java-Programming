/* This is another way of achieving abstraction in java. Interface is nothing but abstract class which is used to group related methods with empty bodies */

/* Code snippet :*/

interface Animals{
    void speed();
    void run();
}
interface FastAnimals{
    void roar();
}

class Tiger implements Animals, FastAnimals{
    public void speed(){
        System.out.println("Tiger's speed is 30-50kmph");
    }
    public void run(){
        System.out.println("Run when you see a tiger");
    }
    public void roar(){
        System.out.println("Tiger roar");
    }
}

class Cow implements Animals{
    public void speed(){
        System.out.println("Cow's speed is 10-20kmph");
    }
    public void run(){
        System.out.println("You dont need to run");
    }
}

class Interface{
    public static void main(String[] args){
        Animals u = new Tiger();
        u.speed();
        u.run();
        
        Tiger t = new Tiger();
        t.speed();
        t.roar();
        t.run();
    }
}

/* Output :
Tiger's speed is 30-50kmph
Run when you see a tiger
Tiger's speed is 30-50kmph
Tiger roar
Run when you see a tiger*/
