package Java;

import java.util.ArrayList;
import java.util.Map;

public class UberBlack extends Car {
    Integer id;
    String brand;
    String model;
    Map<String, ArrayList<String>> typeCarAccepted ;
    ArrayList<String> seatsMaterials;

    void printDataUberBlack(){
        System.out.println("Marca: " + brand + " Modelo: " + model );
    }

    public UberBlack (String license,String brand,String model,
    Map<String, ArrayList<String>> typeCarAccepted ,
    ArrayList<String> seatsMaterials){
        super(license);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterials = seatsMaterials;
        this.brand = brand ;
        this.model = model;
    }
}