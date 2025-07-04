import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("QUANTOS NÚMEROS VOCÊ VAI DIGITAR? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        if(n<=10 && n>0) {
            for (int i = 0; i < numeros.length; i++) {
                sc.nextLine();
                System.out.print("DIGITE UM NÚMERO: ");
                int number = sc.nextInt();
                numeros[i] = number;
            }

                System.out.println("NÚMEROS NEGATIVOS:");
                boolean negative = false;
                for (int numero : numeros) {
                    if (numero < 0) {
                        System.out.println(numero);
                        negative = true;
                    }

                }

                if(!negative){
                    System.out.println("Nenhum número negativo digitado");
            }

        } else {
            System.out.println("Número inválido");
        }
     sc.close();
    }
}