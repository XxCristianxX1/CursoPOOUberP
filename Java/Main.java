package Java;

public class Main {
    public static void main(String[] args) {
        System.out.println("Musica en texto");
        Account account = new Account("1005045759","Kikin2001");
        Car car = new Car("QW548");    
        SFD sfd = new SFD("|SH| Gold D Cristian" , "|SH|" , 10 , "Waiter" ); 
        car.driver = "Diego";
        car.passenger = 4 ;
        System.out.println("Nombre del chofer: "+ car.driver);
        Account account2 = new Account("4512369875","Kakan2002");
        account2.email = "cris.cas.contreras@gmail.com";
        account.email = "cas.con.cris@gmail.com";
        account.document = "1005045759";
        account.name = "XxCristianxX";
        System.out.println("Star name: " + account.name);
        System.out.println("Second account: "+ account2.email);
        System.out.println("First account: " + account.email);
        car.motor = "155 kW (211 CV)";
        System.out.println("Motor de mi futuro coche: "+ car.motor);
        System.out.println("Nickname de una promesa: "+ sfd.nickname+ "Nombre de la promesa: "+ account.name);
        Random random = new Random ("Papaya", "SSJ");
        random.printDataRandom();
        sfd.printDataSFD();
        Wealpons wealpons = new Wealpons(" Sfd ", " Luffy ", " Sfd ", " Sfd ", " Sfd ", " Pixel Gun 3D ", " Sanji ", " Sfd ", " Imaginated ");
        wealpons.printDataWealpons();
	    Super super = new Super("Pepsi 140ml","Coca Cola 150ml","Postobon 150ml");
	    super.printDataSuper();
        //sfd.printDataSFD(); //imprime los objetos creados en la clase SFD
        //car.printDataCar(); //imprime los objetos creados en la clase Car
    }
}
