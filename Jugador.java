//Definir una clase
public class Jugador {

    String avatar;
    int edad;
    String pais;

    //Metodos constructores: Inicializar las variables
    public Jugador(String avatar, int edad, String pais) {
        this.avatar = avatar;
        this.edad = edad;
        this.pais = pais;
    }
    //Metodo constructor con datos quemados para el jugador 1
    public Jugador() {
        avatar = "Danna";
        edad = 21;
        pais = "Ecuador";
    }

    public void patear() {
        System.out.println("Nombre del avatar: " + avatar);
        System.out.println("Edad: " + avatar);
        System.out.println("Pais: " + pais);
        System.out.println("El jugador pateó.");

    }

    public void correr() {
        System.out.println("El jugador corrió.");
    }

    public void saltar(int s) {
        int saltos = 2+s;
        System.out.println("El jugador saltó.");
        System.out.println("No saltos: " + saltos);
    }
}