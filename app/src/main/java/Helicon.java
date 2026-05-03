import java.util.Scanner;

public class Helicon {
    
    public static void main(String[] args) {
        
        int N=0;
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o Tamanho do Vetor: ");
        N = input.nextInt();

        int[] vetor = new int[N];

        for (int i=0; i < N; i++){
            System.out.println("Insira o " + (i + 1) + "º elemento: ");
            vetor[i] = input.nextInt();
        }

        int max = vetor[0];
        int maxGlobal = vetor[0];

        for(int i=1; i < N; i++){

            max = Math.max(vetor[i], max + vetor[i]);

        }

        System.out.println("A maior soma é: " + max);

    }

}
