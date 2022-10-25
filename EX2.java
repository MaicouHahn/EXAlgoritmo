import java.util.Scanner;

public class EX2 {
    /*
     * Modifique o algoritmo anterior, de maneira que o usuário também informe o
     * início e o
     * fim da tabuada. Por exemplo: usuário solicitando a tabuada do número 6, com
     * início
     * em 5 e fim em 8.
     * 
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1, num2 = 0, num3;

        System.out.println("Digite a tabuada desejada");
        num1 = scan.nextInt();
        System.out.println("Digite o ponto de inicio");
        num2 = scan.nextInt();
        System.out.println("Digite o ponto final");
        num3 = scan.nextInt();

        for (int i = num2; i <= num3; i++) {

            System.out.printf("%d X %d = %d\n", num1, i, num1 * i);

        }
    }
}
