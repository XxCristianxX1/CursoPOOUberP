package Java;

public class Account {
    Integer id;
    String name;
    String document;
    String email;
    String password;

    public Account (String document, String password){
            this.document = document;
            this.password = password;
    }

    void printDataAccount () {
        System.out.println("Nombre: "+ name + "Documento: "+ document + "Email: "+ email + "Contraseña: "+ password);
    }
}