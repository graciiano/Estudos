import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] vetor = {5, 2, 42, 6, 1, 3, 2};
        int tamanho = vetor.length;

        for (int j = 0; j < tamanho; j++) {
            int x = vetor[j];
            int i = j - 1;

            while (i >= 0 && vetor[i] > x) {
                vetor[i + 1] = vetor[i];
                i = i - 1;
            }
            vetor[i + 1] = x;
        }

        System.out.println(Arrays.toString(vetor));

        int [] arr = {1, 3, 4, 5, 6};
        int tam = arr.length;

        for (int j = 0; j < tam; j++) {
            int x = arr[j];
            int i = j - 1;

            while( i >=0 && arr[i] > x) {
                arr[i + 1] = arr[i];
                i = i - 1;
            }
            arr[i + 1] = x;
        }

    }
}
