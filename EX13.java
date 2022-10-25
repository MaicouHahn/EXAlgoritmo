import java.util.Scanner;

public class EX13 {

    /*
     * Construa uma calculadora que permita realiza somas, subtrações,
     * multiplicações e
     * divisões. Considere que o usuário pode acumular resultados, como em uma
     * calculadora normal.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float n1, n2, res;
        int sw, sw2, calc = 1, calc2 = 2;
        sw = 1;

        while (calc == 1) {

            System.out.println("Digite o primeiro numero");
            n1 = scan.nextInt();
            calc2 = 2;

            do {
                System.out.println("Digite o Segundo numero");
                n2 = scan.nextInt();
                System.out.println(
                        "Digite a função que deseja realizar: 1-soma, 2-subtração, 3- multiplicação, 4 - divisão 0-Para fechar a calculadora");
                sw = scan.nextInt();

                switch (sw) {
                    case 0:
                        calc = 2;
                        break;

                    case 1:
                        res = n1 + n2;
                        System.out.println(res);
                        System.out.println("Deseja reutilizar o resultado?1-sim 2-nao");
                        sw2 = scan.nextInt();
                        if (sw2 == 1) {
                            n1 = res;

                        } else {
                            calc2 = 1;
                        }
                        break;

                    case 2:
                        res = n1 - n2;
                        System.out.println(res);
                        System.out.println("Deseja reutilizar o resultado?1-sim 2-nao");
                        sw2 = scan.nextInt();
                        if (sw2 == 1) {
                            n1 = res;
                        } else {
                            calc2 = 1;
                        }
                        break;

                    case 3:
                        res = n1 * n2;
                        System.out.println(res);
                        System.out.println("Deseja reutilizar o resultado?1-sim 2-nao");
                        sw2 = scan.nextInt();
                        if (sw2 == 1) {
                            n1 = res;
                        } else {
                            calc2 = 1;
                        }
                        break;

                    case 4:
                        res = n1 / n2;
                        System.out.println(res);
                        System.out.println("Deseja reutilizar o resultado?1-sim 2-nao");
                        sw2 = scan.nextInt();
                        if (sw2 == 1) {
                            n1 = res;
                        } else {
                            calc2 = 1;
                        }
                        break;
                }
            } while (calc2 != 1);

        }
    }
}
