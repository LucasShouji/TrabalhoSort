import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        Random random = new Random();

        // Preenche o vetor com números aleatórios entre 0 e 999
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(5000);
        }

        System.out.println("Vetor original:");
        imprimirVetor(numeros);

        // Ordena com Bubble Sort
        bubbleSort(numeros);

        System.out.println("\nVetor ordenado:");
        imprimirVetor(numeros);
    }

    // Método Bubble Sort
    public static void bubbleSort(int[] vetor) {
        int tamanho = vetor.length;
        boolean trocou;
        for (int i = 0; i < tamanho - 1; i++) {
            trocou = false;
            for (int j = 0; j < tamanho - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    trocou = true;
                }
            }
            // Se não houve troca, já está ordenado
            if (!trocou) break;
        }
    }

    // Método para imprimir o vetor
    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
