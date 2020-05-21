package Java;

public class Car {
 Integer id ;
 String license ;
 private String driver ;
 Integer passenger;
 String motor;

 public Car (final String license){
        this.license = license;
 }
 void printDataCar (){
     System.out.println("license: " + license );
 }

// + " driver: " + driver + " passenger: " + passenger + " motor: " + motor
 public String getDriver (){
     return driver;
 }

 public void setDriver (final String driver) {
     if(driver == "Diego"){
        System.out.println("Su conductor es correcto");
     }else{
         System.out.println("Ese conductor no esta verificado para UberX");
     }
    this.driver = driver;
 }

 public String geMotor (){
    return motor;
}

public void setMotor (final String motor) {
    if(motor == "W16 cuádruple Turbo de 8,0 L"){
       this.motor = motor;
       System.out.println("El motor es apto para UberX");
    }else{
        System.out.println("Ese motor no es apto para UberX");
    }
}
}
