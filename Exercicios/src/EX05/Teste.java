package EX05;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) throws Exception {

        ContaBancaria conta = new ContaBancaria(1500.0, 1000.0);
        double saque = 0, deposito = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("insira o valor do depósito: ");
        deposito = sc.nextDouble();
        try {
            conta.depositar(deposito);
        } catch (contaException e) {
            System.out.println("Erro ao depositar!O deposito não pode passar de  R$1000.00\n");
        }
        System.out.print("Insira o valor do saque: ");
        saque = sc.nextDouble();
        try {
            conta.sacar(saque);
        } catch (contaException e) {
            if (saque > 500) {
                System.out.println("Erro ao sacar!Valor máximo disponível para saque é de R$500.00");
            } else {
                System.out.println("Saldo indisponível");
            }
        }
    }
}