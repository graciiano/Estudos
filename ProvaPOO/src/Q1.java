public class Q1 {

    public static void main(String[] args) {

        int soma = 0;
        int div = 0 ;
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            soma += arr[i];
            div = soma / arr.length;
        }

        System.out.println("A soma dos valores é: " + soma);
        System.out.println("A divisão é: " + div);
    }
}