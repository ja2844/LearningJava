package app;

class Car{
    public String name;
    public int speed;
    public Car(String n,int s){
        name = n;
        speed = s;
    }
    public String getName() {
        return name;
    }
}
class Taxi extends Car{
    public Taxi(String n, int s,String C) {
        super(n, s);
        company = C;
        }

    public String company;
}
public class OOP{
  
    public static void main(String[] args) {
        Car A = new Car("ABC", 123);
        Taxi T = new Taxi("AAA", 001,"BBB");
        System.out.println(A.getName());
        System.out.println(T.getName());

    }
}