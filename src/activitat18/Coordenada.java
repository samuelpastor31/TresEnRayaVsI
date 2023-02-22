package activitat18;

class Coordenada {

    private int fila;
    private int columna;

    public Coordenada(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public boolean isValida(int dimension){
        if ((this.fila>=0&&this.fila<=dimension)&&(this.columna>=0&&this.columna<=dimension)){
            return true;
        }else{
            return false;
        }

    }
}
