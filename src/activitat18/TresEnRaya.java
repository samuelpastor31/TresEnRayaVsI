package activitat18;

import java.util.Random;
import java.util.Scanner;

class TresEnRaya {

    private Tablero tablero;
    private Jugador[] jugadores;
    public static Scanner scanner;

    public TresEnRaya(){
        jugadores = new Jugador[2];
        jugadores[0] = new Jugador(EstadoCasilla.FICHA_X);
        jugadores[1] = new Jugador(EstadoCasilla.FICHA_O);
        tablero = new Tablero();
    }

    public void jugar(){
        do {
            tablero.vaciar();
            comenzarPartida(0);
        } while (seConfirmaNuevaPartida());
    }

    private void comenzarPartida(int modoJuego) {
        System.out.println("Vamos a jugar al \"Tres en Raya\"");
        int turno = new Random().nextInt(2);
        do {
            tablero.mostrar();
            jugadores[turno].ponerFicha(tablero);
            if (tablero.hayTresEnRaya()) {
                jugadores[turno].cantarVictoria();
                break;
            } else if(tablero.estaLleno()) {
                System.out.println("Empate");
                break;
            }
            turno = (turno + 1) % 2;
        } while (true);
        tablero.mostrar();
    }
    public boolean seConfirmaNuevaPartida() {
        return GestorIO.confirmar("¿Quieres volver a jugar?");
    }
    public static void main(String[] args){
        scanner = new Scanner(System.in);
        TresEnRaya tresEnRaya = new TresEnRaya();
        tresEnRaya.jugar();
    }
}
