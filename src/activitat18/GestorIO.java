package activitat18;

class GestorIO {
    public static int obtenerEntero(String mensaje) {
        do {
            System.out.print(mensaje);
            if (TresEnRaya.scanner.hasNextInt()) {
                return TresEnRaya.scanner.nextInt();
            }
            System.out.println("Debe introducir un entero");
            TresEnRaya.scanner.next();
        } while (true);
    }

    public static boolean confirmar(String mensaje) {
        do {
            System.out.print(mensaje + " [S/N]:");
            String respuesta = TresEnRaya.scanner.next().toUpperCase();
            if (respuesta.equals("S")) {
                return true;
            } else if (respuesta.equals("N")) {
                return false;
            }

            System.out.println("¡Error! Debe introducir S o N");
        } while (true);
    }

}