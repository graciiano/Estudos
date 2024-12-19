package calculadora;

public class CalcSimples implements Calculadora {

    @Override
    public double multiplicar(double a, double b) {
        return a * b;
    }

    @Override
    public double dividir(double a, double b) {
        if (b <= 0) {
            System.out.println("Divisão por 0 não é possivel");
        }
        return a / b;
    }

    public double expo(double a, double b) {
        return 0;
    }

    public double rad(double a, double b) {
        return 0;
    }

}
