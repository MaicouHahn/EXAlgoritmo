import java.util.Scanner;

public class EX3 {
    /*
     * Modifique o algoritmo do exercício 1, de maneira que sejam impressos somente
     * as
     * multiplicações da tabuada cujo resultado seja um número par.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;

        System.out.println("Digite a tabuada desejada");
        num = scan.nextInt();

        for (int i = 1; i <= 10; i++) {

            if ((num * i) % 2 == 0) {

                System.out.printf("%d X %d = %d\n", num, i, num * i);

            }

        }
    }
}
