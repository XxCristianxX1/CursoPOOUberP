package Java;

public class SFD  {
    Integer id ;
    String nickname ;
    String clan ;
    Integer aim ;
    String meele ;

    public SFD (String nickname , String clan , Integer aim ,String meele ){
        this.nickname = nickname;
        this.clan = clan;
        this.meele = meele;
        this.aim = aim;;
    }

    void printDataSFD (){
        System.out.println("nickname: "+ nickname + " clan: "+ clan + " aim: "+ aim + " meele: "+ meele);
    }
}