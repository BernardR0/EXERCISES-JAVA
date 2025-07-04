import java.util.Locale;
import java.util.Scanner;

public class vetorpares {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("QUANTOS NUMEROS VOCE VAI DIGITAR? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < numeros.length; i++) {
            sc.nextLine();
            System.out.print("DIGITE UM NÚMERO: ");
            int number = sc.nextInt();
            numeros[i] = number;
        }
        int count = 0;
        System.out.println("NÚMEROS PARES: ");
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]%2==0) {
                System.out.print(numeros[i] + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println();
        System.out.print("QUANTIDADE DE PARES = " + count);
    }

}
