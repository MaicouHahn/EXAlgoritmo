import java.util.Scanner;

public class EX1 {
    /*
     * Crie um algoritmo que, dado um número informado pelo usuário, imprima a
     * tabuada
     * dele de 1 a 10. Use o formato de apresentação (considerando que o usuário
     * informou
     * o número 5):
     * 
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;

        System.out.println("Digite a tabuada desejada");
        num = scan.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.printf("%d X %d = %d\n", num, i, num * i);

        }

    }

}