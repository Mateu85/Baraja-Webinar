import java.util.ArrayList;
import java.util.List;


public class Jugador<Carta> {
    private String nombre;
    private List<Carta> Carta;

    public Jugador(String palo, int numero){
        this.nombre = palo;
       this.Carta = new ArrayList<>();
    }
}
