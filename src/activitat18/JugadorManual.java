package activitat18;

public class JugadorManual extends Jugador{
    public JugadorManual(EstadoCasilla ficha) {
        super(ficha);
    }

    @Override
    public void ponerFicha(Tablero tablero) {
        {
            assert tablero != null;
            assert !tablero.estaLleno();

            do {
                Coordenada coordenada = recogerCoordenada();

                if (!tablero.isOcupada(coordenada)) {
                    tablero.ponerFicha(coordenada, ficha);
                    return;
                }
                System.out.println("Coordenada ocupada");
            } while (true);

        }
    }


    @Override
    public void cantarVictoria() {
        super.cantarVictoria();
    }


    private Coordenada recogerCoordenada() {
        do {
            System.out.println("Jugador con " + ficha);
            int fila = GestorIO.obtenerEntero( "Introduce fila [1-" + Tablero.DIMENSION + "]: ");
            int columna = GestorIO.obtenerEntero("Introduce columna [1-" + Tablero.DIMENSION + "]: ");
            Coordenada coordenada = new Coordenada(fila-1, columna-1);

            if (coordenada.isValida(Tablero.DIMENSION-1)) {
                return coordenada;
            }

            System.out.println("¡Error! Introduce una coordenada válida");
        } while (true);
    }
}
