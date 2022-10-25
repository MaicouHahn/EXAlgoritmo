import java.util.Scanner;

public class EX9 {
    /*
     * Agora altere o algoritmo anterior, de maneira que ele imprima o percentual
     * de
     * pessoas considerando as faixas de idade: 0-17 anos, 18 a 35 anos, 35 a 50
     * anos, 50 a 65
     * anos e maiores de 65 anos. Lembrete: a soma dos percentuais das faixas deve
     * totalizar
     * 100%
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        float num, res = 0, cont = 0, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
        char bt = 'n';

        while (bt != 's') {

            System.out.println("s - finaliza n- continua a digitar");

            bt = scan.nextLine().charAt(0);

            if (bt == 's') {
                System.out.println("0-17: "+(cont1/cont)*100+"%");
                System.out.println("18-35: "+(cont2/cont)*100+"%");
                System.out.println("36-50: "+(cont3/cont)*100+"%");
                System.out.println("51-65: "+(cont4/cont)*100+"%");
                System.out.println("66+: "+(cont5/cont)*100+"%");
                break;
            }

            System.out.println("Digite uma idade");
            num = scan2.nextFloat();

            cont++;
            if (num <= 17) {
                cont1++;
            } else if (num > 17 && num <= 35) {
                cont2++;
            } else if (num > 35 && num <= 50) {
                cont3++;
            } else if (num > 50 && num <= 65) {
                cont4++;
            } else {
                cont5++;
            }

        }
    }
}
