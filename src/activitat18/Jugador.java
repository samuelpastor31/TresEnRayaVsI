package activitat18;


public abstract class Jugador {

    protected EstadoCasilla ficha;

    public Jugador(EstadoCasilla ficha) {
        assert ficha == EstadoCasilla.FICHA_O || ficha == EstadoCasilla.FICHA_X;
        this.ficha = ficha;
    }

    public abstract void ponerFicha(Tablero tablero);

    public void cantarVictoria() {
        System.out.println("¡El jugador " + ficha + " es el ganador!");
    }

   
}
