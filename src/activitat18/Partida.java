package activitat18;

import java.util.Random;

public class Partida {

    private Jugador[] jugadores;
    protected Tablero tablero;

    public Partida(JugadorPC jugador1, JugadorPC jugador2) {
        this.jugadores = new Jugador[2];
        jugadores[0]= new JugadorPC(EstadoCasilla.FICHA_O);
        jugadores[1]= new JugadorPC(EstadoCasilla.FICHA_X);
        tablero = new Tablero();
    }

    public Partida(JugadorManual jugador1, JugadorManual jugador2) {
        this.jugadores = new Jugador[2];
        jugadores[0]= new JugadorManual(EstadoCasilla.FICHA_O);
        jugadores[1]= new JugadorManual(EstadoCasilla.FICHA_X);
        tablero = new Tablero();
    }

    public Partida(JugadorManual jugador1, JugadorPC jugador2) {
        this.jugadores = new Jugador[2];
        jugadores[0]= new JugadorManual(EstadoCasilla.FICHA_O);
        jugadores[1]= new JugadorPC(EstadoCasilla.FICHA_X);
        tablero = new Tablero();
    }

    public void jugar() {
        tablero.vaciar();
        comenzarPartida();
    }


    private void comenzarPartida() {
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
}
