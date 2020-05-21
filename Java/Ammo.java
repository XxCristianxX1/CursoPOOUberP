package Java;

public class Ammo extends Wealpons {
    Integer id ;
    String typeammo ;
    String ammofrancotirador ;
    String ammojetpistol ;
    String ammobazooka ;
    String ammopistol ;
    String ammomagnum ;
    String ammominigun ;
    String ammodiablechambe ;
    String ammogrenadelauncher ;
    String ammosupachicken ;

    void printDataAmmo (){
        System.out.println("Tipo de municion: " + typeammo);
    }

    public Ammo (String typeammo ,
    String ammofrancotirador ,
    String ammojetpistol ,
    String ammobazooka ,
    String ammopistol ,
    String ammomagnum ,
    String ammominigun ,
    String ammodiablechambe ,
    String ammogrenadelauncher ,
    String ammosupachicken ,
    String francotirador,
    String jetpistol,
    String bazooka,
    String pistol ,
    String magnum ,
    String minigun ,
    String diablechambe ,
    String grenadelauncher ,
    String supachicken){

        super(francotirador, jetpistol, bazooka, pistol, magnum, minigun, diablechambe, grenadelauncher, supachicken);
        this.typeammo = typeammo ;
        this.ammofrancotirador = ammofrancotirador ;
        this.ammojetpistol = jetpistol ;
        this.ammobazooka = ammobazooka ;
        this.ammopistol = ammopistol ; 
        this.ammomagnum = ammomagnum ;
        this.ammominigun = ammominigun ;
        this.ammogrenadelauncher = ammogrenadelauncher ;
        this.ammodiablechambe = ammodiablechambe ;
        this.ammosupachicken = ammosupachicken ;
        
    }

}