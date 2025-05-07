package s5_reto_01;

public class S5_Reto_01 {

    public static void main(String[] args) {
        Ambulancia ambulancia = new Ambulancia("Ambulancia", "Juanita");
        Patrulla patrulla = new Patrulla("Patrulla", "Victoria");
        UnidadBomberos bomberos = new UnidadBomberos("UnidadBomberos", "Gerardo");

        ambulancia.iniciarOperacion();
        patrulla.iniciarOperacion();
        bomberos.iniciarOperacion();
    }
    
}
