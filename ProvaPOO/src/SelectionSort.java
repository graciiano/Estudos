public class SelectionSort {
    public static void main(String[] args) {

        int[] vetor = {5, 2, 42, 6, 1, 3, 2};
        int tamanho = vetor.length;

        for (int i = 0; i < tamanho; i++) {
            int menor = i;
            for (int j = i + 1; j < tamanho; j++) {
                if (vetor[j] < vetor[menor]) {
                    menor = j;
                }
            }
            int auxiliar = vetor[i];
            vetor[i] = vetor[menor];
            vetor[menor] = auxiliar;
        }
    }
}
