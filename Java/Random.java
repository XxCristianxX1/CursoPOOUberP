package Java;

public class Random {
    String fruits;
    Integer id;
    String band ;
    String goku ;
    String random ;

    public Random (String fruits, String goku){
            this.goku = goku ;
            this.fruits = fruits ;
    }

    void printDataRandom(){
        System.out.println(goku + fruits);
    }
}