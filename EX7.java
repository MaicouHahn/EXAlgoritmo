import java.util.Scanner;

public class EX7 {

    /*
     * Faça um algoritmo que leia tantos números quanto o usuário desejar e imprima
     * a
     * soma deles.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        float num, res = 056;
        char bt = 'n';

        while (bt != 's') {

            System.out.println("s - finaliza n- continua a digitar");

            bt = scan.nextLine().charAt(0);
            if (bt == 's') {
                System.out.println("Soma de todos os numeros digitados: " + res);
                break;
            }
            System.out.println("Digite um numero que deseja somar");
            num = scan2.nextFloat();
        }
    }
}
