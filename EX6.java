import java.util.Scanner;

public class EX6 {
    /*
     * Agora faça outro algoritmo semelhante ao anterior, só que agora considerando
     * progressões geométricas.
     */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int a1, r, an,sw;
        System.out.println("Digite o primeiro elemento");
        a1=scan.nextInt();
        System.out.println("Digite a razao da PG");
        r=scan.nextInt();
        System.out.println("Digite o numero de termos");
        an=scan.nextInt();
        System.out.println("1- PG crescente 2- PG decrescente");
        sw=scan.nextInt();
        switch(sw){

            case 1:

            System.out.println(a1);
            for (int i = 1; i < an; i++) {
    
                a1=a1*r;
                System.out.println(a1);
            }
            break;

            case 2:
            System.out.println(a1);
            for (int i = 1; i < an; i++) {
    
                a1=a1/r;
                System.out.println(a1);
            }
            break;

        }

           

        

    }

}
