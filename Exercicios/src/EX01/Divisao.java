package EX01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

    Scanner entrada = new Scanner(System.in);
        
    int num1;
    int num2;
    double divisao;
    
    public void Calcula() throws Exception {
        try{
            System.out.println("Digite um numero: ");
            num1 = entrada.nextInt();
            System.out.println("Digite um segundo numero:");
            num2 = entrada.nextInt();
            divisao = num1/num2;
            if(divisao >= 1 ){
                System.out.println("A divisao de " + num1 + " por "+ num2 + " é " + divisao);
            }else{
                throw new Exception();
            }
        }catch(ArithmeticException e){
            System.out.println("Nao é possivel dividir por zero!");
        }
        catch(InputMismatchException e){
            System.out.println("Erro..Infelizmente nao é possivel dividir algo que nao seja numeros!");
        }
    }   
}