public class llamar_clase {
    public static void main(String[] args) {
        System.out.println("Datos de los jugadores: ");
        System.out.println("Jugador 1: ");
        Jugador jugador1 = new Jugador();
        jugador1.patear();
        jugador1.correr();

        System.out.println("Jugador 2: ");
        Jugador jugador2 = new Jugador("Sandra", 21, "Ecuador");
        jugador2.patear();
        jugador2.correr();
        jugador2.saltar(7);
    }
}