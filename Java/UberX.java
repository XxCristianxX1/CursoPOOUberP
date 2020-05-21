package Java;

public class UberX extends Car {
    Integer id ;
    String brand ;
    String model ;

    public UberX (String license, String brand, String model){
        super(license);
        this.brand = brand;
        this.model = model;
    }

    void printDataUberX (){
        System.out.println("Marca: " + brand + " Model: " + model + " License: " + license);
    }
}