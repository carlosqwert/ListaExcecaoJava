package EX02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Vetor {
    Scanner sc = new Scanner(System.in);

    int v = 10;
    int Vetor[] = new int[v];

    public void vetor() throws Exception {

        try {
            int p = 0;
            System.out.println("Digite os numeros: ");
            do {
                Vetor[p] = sc.nextInt();
                p++;
            } while (Vetor[p - 1] != 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro! Você não pode informar mais que 10 números");
        } catch (InputMismatchException e) {
            System.out.println("Erro! Você só pode informar numeros");
        }
    }
}