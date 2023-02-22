package activitat18;

import java.util.Scanner;

public class Menu {

    public static void textoMenu(){
        System.out.println(" Bienvenido al 3 en Raya    \n" +
                "================================\n" +
                "1 - Jugador vs Ordenador\n" +
                "2 - Jugador 1 vs Jugador 2\n" +
                "3 - Ordenador vs Ordenador\n" +
                "4 - Salir\n");
    }

    public static int sacarMenu(String mensaje){
        textoMenu();
        int opcion=0;

        do {
            System.out.println(mensaje);
            if (TresEnRaya.scanner.hasNextInt()) {
                opcion = TresEnRaya.scanner.nextInt();
                if (opcion <= 4) {
                    return opcion;
                } else {
                    System.out.println("¡ERROR! La opción seleccionada no es válida");
                }
            }
        }
            while (true) ;

    }

    public static void menu(){

        do {
            int menu = sacarMenu("Seleccione una opción:");

            switch (menu){
                case 1:
                    JugadorManual jugador1 = new JugadorManual(EstadoCasilla.FICHA_O);
                    JugadorPC jugador2 = new JugadorPC(EstadoCasilla.FICHA_X);
                    Partida partida = new Partida(jugador1, jugador2);
                    partida.jugar();
                    break;

                case 2:
                    JugadorManual jugador3 = new JugadorManual(EstadoCasilla.FICHA_O);
                    JugadorManual jugador4 = new JugadorManual(EstadoCasilla.FICHA_X);
                    Partida partida2 = new Partida(jugador3, jugador4);
                    partida2.jugar();
                    break;

                case 3:
                    JugadorPC jugador5 = new JugadorPC(EstadoCasilla.FICHA_O);
                    JugadorPC jugador6 = new JugadorPC(EstadoCasilla.FICHA_X);
                    Partida partida3 = new Partida(jugador5, jugador6);
                    partida3.jugar();
                    break;

                case 4:
                    System.out.println("Adiós");
                    return;

            }
        }while (true);

    }
}
