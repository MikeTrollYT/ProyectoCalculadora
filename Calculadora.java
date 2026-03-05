public class Calculadora {
    private int num1;
    private int num2;

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int realizarOperacion(String operacion) {
        if (operacion.equalsIgnoreCase("suma")) {
            return suma();
        } else if (operacion.equalsIgnoreCase("multiplicacion")) {
            return multiplicacion();
        }
        return 0; // Por defecto
    }

    public int suma() {
        return num1 + num2;
    }

    public int multiplicacion() {
        return num1 * num2;
    }
}