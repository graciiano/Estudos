public class ListaDuplamenteEncadeada {
    public static void main(String[] args) {
        int[] arr = {5, 2, 42, 6, 1, 3, 2};
        int tamanho = arr.length;

        for (int j = 0; j < tamanho; j++) {
            int x =  arr[j];
            int i = j - 1;

            while (i > 0 && arr[i] > x) {
                arr[i + 1] = arr[i];
                i -= 1;
            }
            arr[i +1 ] = x;
        }
    }
}
