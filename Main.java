public class Main {

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Nao e possivel dividir por zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        double a = 10;
        double b = 5;

        System.out.println("Calculadora Java");
        System.out.println(a + " + " + b + " = " + somar(a, b));
        System.out.println(a + " - " + b + " = " + subtrair(a, b));
        System.out.println(a + " * " + b + " = " + multiplicar(a, b));
        System.out.println(a + " / " + b + " = " + dividir(a, b));

        try {
            dividir(a, 0);
        } catch (ArithmeticException e) {
            System.out.println("Erro tratado: " + e.getMessage());
        }
    }
}
