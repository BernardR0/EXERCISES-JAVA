import entities.Pessoa;
import java.util.Locale;
import java.util.Scanner;

public class altura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[n];

        for(int i = 0; i<pessoas.length; i++) {
           sc.nextLine();
           System.out.printf("Dados da %da pessoa:\n", i+1);
           System.out.print("Nome: ");
           String nome = sc.nextLine();
           System.out.print("Idade: ");
           int idade = sc.nextInt();
           System.out.print("Altura: ");
           double altura = sc.nextDouble();

           pessoas[i] = new Pessoa(nome, idade, altura);

        }
        double sum = 0;
        for(int j = 0; j<pessoas.length; j++) {
            sum += pessoas[j].getAltura();
        }
        double avg = sum / pessoas.length;
        System.out.printf("Altura média: %.2f\n", avg);



        double count = 0;
        for(int k = 0; k<pessoas.length; k++) {
            if(pessoas[k].getIdade()<16) {
                count++;
            }
        }



        double percent = (count/n) * 100;

        System.out.printf("Porcentagem de pessoas com menos de 16 anos: %.2f%%\n", percent);


        for (int i = 0; i < n; i++) {
            if (pessoas[i].getIdade() < 16) {
                System.out.println(pessoas[i].getNome());
            }
        }


       sc.close();
    }

}
