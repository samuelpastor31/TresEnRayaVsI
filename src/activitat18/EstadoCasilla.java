package activitat18;

public enum EstadoCasilla {
    FICHA_O (){
        @Override
        public String toString() {
            return "⭕";
        }
    }, FICHA_X () {
        @Override
        public String toString() {
            return "✖️";
        }
    }, VACIO () {
        @Override
        public String toString() {
            return "\uD83C\uDFFB";
        }
    }
}
