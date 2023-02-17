package activitat18;

class Tablero {

    private EstadoCasilla[][] casillas;

    public static final int DIMENSION = 3;

    public Tablero() {
        casillas = new EstadoCasilla[DIMENSION][DIMENSION];
        vaciar();
    }

    public void mostrar() {

        System.out.println();
        imprimirDivisionTabla();

        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                System.out.printf("| %1s ", casillas[i][j]);
            }
            System.out.println("|");
            imprimirDivisionTabla();
        }
        System.out.println();
    }

    public boolean hayTresEnRaya() {
        return this.hayTresEnRaya(EstadoCasilla.FICHA_X)
                || this.hayTresEnRaya(EstadoCasilla.FICHA_O);
    }

    public boolean isOcupada(Coordenada coordenada) {
        return casillas[coordenada.getFila()-1][coordenada.getColumna()-1] != EstadoCasilla.VACIO;
    }

    public void ponerFicha(Coordenada coordenada, EstadoCasilla ficha) {
        casillas[coordenada.getFila()-1][coordenada.getColumna()-1] = ficha;
    }

    private void imprimirDivisionTabla() {
        for (int i = 0; i < DIMENSION; i++) {
            System.out.print("+----");
        }
        System.out.println("+");
    }
    public boolean estaLleno() {
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                if (casillas[i][j] == EstadoCasilla.VACIO) {
                    return false;
                }
            }
        }
        return true;
    }
    public void vaciar() {
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                casillas[i][j] = EstadoCasilla.VACIO;
            }
        }
    }

    private boolean hayTresEnRaya(EstadoCasilla color) {
        int totalDiagonal = 0;
        int totalSubdiagonal = 0;
        for (int i = 0; i < DIMENSION; i++) {
            int totalHorizontal = 0;
            int totalVertical = 0;
            for (int j = 0; j < DIMENSION; j++) {
                if (color == casillas[i][j]) {
                    totalHorizontal++;
                    if (i == j) {
                        totalDiagonal++;
                    }
                    if ((i + j) == DIMENSION - 1) {
                        totalSubdiagonal++;
                    }
                }
                if (color == casillas[j][i]) {
                    totalVertical++;
                }
            }
            if (totalHorizontal == DIMENSION || totalVertical == DIMENSION
                    || totalDiagonal == DIMENSION || totalSubdiagonal == DIMENSION ){
                return true;
            }
        }
        return false;
    }
}
