import java.util.Scanner;

public class EX8 {

    /*
     * Faça um algoritmo que permita ao usuário informar a idade de quantas pessoas
     * ele
     * desejar. Após isso o algoritmo deve informar a soma das pessoas maiores de
     * idade e a
     * média de idade das pessoas maiores de idade informadas.
     */

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        float num, res = 0,cont=0;
        char bt = 'n';

        while (bt != 's') {

            System.out.println("s - finaliza n- continua a digitar");

            bt = scan.nextLine().charAt(0);
            if (bt == 's') {
                System.out.println("Soma de todas as idades maiores de 18: " + res);
                res=res/cont;
                System.out.println("Media de todas as idades maiores de 18: " + res);
                break;
            }
            System.out.println("Digite uma idade");
            num = scan2.nextFloat();
            if(num>=18){

                cont++;
                res=res+num;
                
            }
        }
    }
}
