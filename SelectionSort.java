public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Percorre todos os elementos do array
        for (int i = 0; i < n - 1; i++) {
            // Encontra o índice do menor elemento restante
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            // Troca o elemento atual pelo menor elemento encontrado
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.print("Array original: ");
        printArray(arr);

        selectionSort(arr);

        System.out.print("Array ordenado: ");
        printArray(arr);
    }

    // Método auxiliar para imprimir o array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
