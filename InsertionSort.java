import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        Random random = new Random();

        // Preenche cada valor do vetor com um número aleatório entre 0 e 4999
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(5000);
        }

        System.out.println("Vetor original:");
        imprimirVetor(numeros);

        // Ordena com Insertion Sort e conta passagens
        int numPassagens = insertionSort(numeros);

        System.out.println("\nVetor ordenado:");
        imprimirVetor(numeros);

        System.out.println("\nNúmero de passagens até a ordenação: " + numPassagens);
    }

    // Método Insertion Sort com contador de passagens
    public static int insertionSort(int[] vetor) {
        int contadorPassagens = 0;

        for (int i = 1; i < vetor.length; i++) {
            contadorPassagens++; // Conta cada passagem (cada elemento inserido)
            int chave = vetor[i];
            int j = i - 1;

            // Desloca os elementos maiores que a chave para a direita
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }

            // Insere a chave na posição correta
            vetor[j + 1] = chave;
        }

        return contadorPassagens;
    }

    // Método para imprimir o vetor
    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
