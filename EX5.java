import java.util.Scanner;

public class EX5 {

    /*
     * Construa um algoritmo que, dado o primeiro elemento e a razão de uma
     * progressão
     * aritmética (PA), imprima todos os n primeiros elementos da PA, onde n também
     * é
     * informado pelo usuário. Lembre-se que uma PA pode ser crescente ou
     * decrescente.
     */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int a1, r, an;
        System.out.println("Digite o primeiro elemento");
        a1=scan.nextInt();
        System.out.println("Digite a razao da PA");
        r=scan.nextInt();
        System.out.println("Digite o numero de termos");
        an=scan.nextInt();

        if(r>0){

            System.out.println(a1);
            for (int i = 1; i < an; i++) {
    
                a1=a1+r;
                System.out.println(a1);
            }
        }else{

            System.out.println(a1);
            for (int i = 1; i < an; i++) {
    
                a1=a1+r;
                System.out.println(a1);
            }

        }

    }
}
