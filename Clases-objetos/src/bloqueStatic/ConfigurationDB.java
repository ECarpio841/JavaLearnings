package bloqueStatic;

public class ConfigurationDB {
    static String URL;
    static String USER;


    static {
        URL = "https://";
        USER = "ADMIN";
        System.out.println("Configuración cargada");
    }

    static void main(String[] args) {
        System.out.println(URL);
        System.out.println(USER);
    }

}
