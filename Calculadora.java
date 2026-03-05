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
<<<<<<< HEAD
        } else if (operacion.equalsIgnoreCase("resta")) {
            return resta();
=======
        } else if (operacion.equalsIgnoreCase("multiplicacion")) {
            return multiplicacion();
        } else if (operacion.equalsIgnoreCase("division")) {
            return (int) dividir();
>>>>>>> dividir
        }
        return 0; // Por defecto
    }

    public int suma() {
        return num1 + num2;
    }

<<<<<<< HEAD
    
    public int resta() {
    return num1 - num2;
=======
    public int multiplicacion() {
        return num1 * num2;
    }

    public double dividir() {
        if (num2 != 0) {
            return (double) num1 / num2;
        } else {
            throw new ArithmeticException("No se puede dividir por cero");
        }
>>>>>>> dividir
    }
}