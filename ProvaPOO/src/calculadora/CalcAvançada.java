package calculadora;

public class CalcAvançada implements Calculadora{

    @Override
    public double multiplicar(double a, double b) {
        return 0;
    }

    @Override
    public double dividir(double a, double b) {
        return 0;
    }

    @Override
    public double expo(double base, double expo) {
        return Math.pow(base, expo);
    }

    @Override
    public double rad(double numero, double indice) {
        if (indice == 0) {
            System.out.println("Erro");
        }
        return Math.pow(numero, 1.0 / indice);
    }
}
