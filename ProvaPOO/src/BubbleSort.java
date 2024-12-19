import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] vetor = {5, 2, 42, 6, 1, 3, 2};
        int tamanho = vetor.length;

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho - 1; j++) {
                if (vetor[j] < vetor[j + 1]) {
                    int auxiliar = vetor[j+1];
                    vetor[j + 1] = vetor[j];
                    vetor[j] = auxiliar;
                }
            }
        }
    }
}
