package Java;

public class Wealpons {
    Integer id ;
    String francotirador ;
    String jetpistol ;
    String bazooka ;
    String pistol ;
    String magnum ;
    String minigun ;
    String diablechambe ;
    String grenadelauncher ;
    String supachicken;

    void printDataWealpons (){
        System.out.println("Francotirador: " + francotirador + "  Jetpistol: " + jetpistol + "  Bazooka: " + bazooka + "  pistol: " + pistol + "  magnum: " + magnum + "  minugun: " + minigun + "  diablechamble: " + diablechambe + "  granadelauncher: " + grenadelauncher + "  supachicken: " + supachicken);
    }

    public Wealpons (String francotirador,
                     String jetpistol,
                     String bazooka,
                     String pistol ,
                     String magnum ,
                     String minigun ,
                     String diablechambe ,
                     String grenadelauncher ,
                     String supachicken){
                        this.francotirador = francotirador;
                        this.jetpistol = jetpistol;
                        this.bazooka = bazooka;
                        this.pistol = pistol ;
                        this.magnum = magnum ;
                        this.minigun = minigun ;
                        this.diablechambe = diablechambe ;
                        this.grenadelauncher = grenadelauncher ;
                        this.supachicken = supachicken ;
    }
}