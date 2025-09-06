import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        //Tamanho do vetor
        int[] numeros = new int[100];
        Random random = new Random();

        //Adiciona valores aleatórios a cada posição do vetor
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
    /*
     * O primeiro for vai percorrer desde a primeira posição do vetor até o final.
     * O segundo for é usado para mover os valores de posição.
     * tamanho - 1 - i <- pois os maiores valores tendem a ficar nas últimas posições nos primeiros loops;
     */
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
