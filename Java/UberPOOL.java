package Java;

public class UberPOOL extends Car {
    Integer id;
    String brand;
    String model;

    void printDataUberPOOL(){
        System.out.println("Marca: " + brand + " Modelo: " + model );
    }

    public UberPOOL (String license,String brand,String model){
        super(license);
        this.brand = brand ;
        this.model = model;
    }
}