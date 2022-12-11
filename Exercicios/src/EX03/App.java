package EX03;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);
        String user, password;
        System.out.println("Informe o usuario: ");
        user = entrada.next();
        System.out.println("Informe a senha: ");
        password = entrada.next();

        try {
            if(user.equals("Carlos") && password.equals("12232323")){
                throw new Exception("Login efetuado");
            } else{
                System.out.println("Login ou senha nao correspondem");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
        
}
