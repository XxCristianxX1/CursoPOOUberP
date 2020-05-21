package Java;

public class Car {
 Integer id ;
 String license ;
 String driver ;
 Integer passenger;
 String motor;

 public Car (String license){
        this.license = license;
 }
 void printDataCar (){
     System.out.println("license: " + license + " driver: " + driver + " passenger: " + passenger + " motor: " + motor);
 }
}
