import java.util.Scanner;
import java.math.*;

public class EX14 {

    /*
     * Crie um algoritmo que permita que um usuário informe ATÉ 10 números reais
     * positivos. Após isso, o algoritmo deve informar a média e o desvio padrão
     * amostral
     * dos valores informados.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float[] nota = new float[10];
        float[] res = new float[10];
        float media, resM = 0, resR = 0;
        Double resF;
        int cont = 0;

        for (int i = 0; i < nota.length; i++) {
            System.out.println("Digite a nota " + (i + 1));
            nota[i] = scan.nextFloat();
            resM = nota[i] + resM;
            cont++;
        }

        media = resM / cont;

        for (int i = 0; i < nota.length; i++) {

            res[i] = (nota[i] - media) * (nota[i] - media);
            resR = resR + res[i];

        }

        resF = Math.sqrt(resR / cont);
        System.out.println("A media foi: " + media + " Com desvio padrão amostral de: " + resF);
    }
}
