import java.util.Scanner;

public class EX4 {
    /*
     * Agora modifique o exercício anterior, considerando agora somente os
     * resultados que
     * forem ímpares.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;

        System.out.println("Digite a tabuada desejada");
        num = scan.nextInt();

        for (int i = 1; i <= 10; i++) {

            if ((num * i) % 2 != 0) {

                System.out.printf("%d X %d = %d\n", num, i, num * i);

            }

        }
    }
}