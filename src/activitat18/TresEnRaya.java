package activitat18;

import java.util.Random;
import java.util.Scanner;

class TresEnRaya {

    private Tablero tablero;
    private Jugador[] jugadores;
    public static Scanner scanner;

    public TresEnRaya(){
        jugadores = new Jugador[2];
        tablero = new Tablero();
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
            Menu.menu();


    }
}
