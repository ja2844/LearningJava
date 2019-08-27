package app;

class Car{
    public String name;
    public int speed;
    Car(String n,int s){
        name = n;
        speed = s;
    }
    public String getName() {
        return name;
    }
}
public class OOP{
  
    public static void main(String[] args) {
        Car A = new Car("ABC", 123);
       System.out.println(A.getName());

    }
}