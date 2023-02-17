package activitat18;


class Jugador {

    private EstadoCasilla ficha;

    public Jugador(EstadoCasilla ficha) {
        assert ficha == EstadoCasilla.FICHA_O || ficha == EstadoCasilla.FICHA_X;
        this.ficha = ficha;
    }

    public void ponerFicha(Tablero tablero) {
        assert tablero != null;
        assert !tablero.estaLleno();

        do {
            Coordenada coordenada = recogerCoordenada();

            if (!tablero.isOcupada(coordenada)) {
                tablero.ponerFicha(coordenada, ficha);
                return;
            }

            System.out.println("¡Error! Coordenada ocupada en el tablero");
        } while (true);
    }

    public void cantarVictoria() {
        System.out.println("¡El jugador " + ficha + " es el ganador!");
    }

    private Coordenada recogerCoordenada() {
        do {
            System.out.println("Jugador con " + ficha);
            int fila = GestorIO.obtenerEntero( "Introduce fila [1-" + Tablero.DIMENSION + "]: ");
            int columna = GestorIO.obtenerEntero("Introduce columna [1-" + Tablero.DIMENSION + "]: ");
            Coordenada coordenada = new Coordenada(fila, columna);

            if (coordenada.isValida(Tablero.DIMENSION)) {
                return coordenada;
            }

            System.out.println("¡Error! Introduce una coordenada válida");
        } while (true);
    }
}
