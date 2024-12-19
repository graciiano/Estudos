public class PercorrerArray {

    public static void main(String[] args) {

        int [] arr = {1, 3, 4, 5, 6, 8};
        int menorValor = arr[0];
        int indiceMenor = 0;
        double soma = 0;

        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] < menorValor) {
                menorValor = arr[i];
                indiceMenor = i;
            }
            soma += arr[i];
        }
        double media = soma / arr.length;

        System.out.println("Menor valor: " + menorValor);
        System.out.println("Indice menor valor: " + indiceMenor);
        System.out.println("Soma dos valores: " + soma);
        System.out.println("Media dos valores: " + media);
    }


}
