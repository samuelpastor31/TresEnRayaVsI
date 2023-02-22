package activitat18;

import java.util.Random;

public class JugadorPC extends Jugador{
    public JugadorPC(EstadoCasilla ficha) {
        super(ficha);
    }


    @Override
    public void ponerFicha(Tablero tablero) {
            assert tablero != null;
            assert !tablero.estaLleno();

            fraseAleatoria(new Random().nextInt(5));
            try {
            Thread.sleep(200);
            } catch (InterruptedException e) {
            e.printStackTrace();
            }

                Coordenada coordenada = generarCoordenada(tablero);
                tablero.ponerFicha(coordenada,ficha);

    }

    private Coordenada generarCoordenada(Tablero tablero) {

        do {
            int fila = new Random().nextInt(Tablero.DIMENSION);
            int columna = new Random().nextInt(Tablero.DIMENSION);

            Coordenada coordenada = new Coordenada(fila, columna);

            if (!tablero.isOcupada(coordenada)) {

                return coordenada;
            }
        }while (true);
    }

    public void fraseAleatoria(int numero){
        switch (numero) {
            case 1 :
                System.out.println("Te voy a ganar..." +ficha);
                break;

            case 2 :
                System.out.println(" Estás a punto de perder..." +ficha);
                break;

            case 3:
                System.out.println("¡Ésta es la mía! ..." +ficha);

            case 4 :
                System.out.println("Ya va mi jugada maestra.." +ficha);
        }
    }


    @Override
    public void cantarVictoria() {
        super.cantarVictoria();
    }
}
