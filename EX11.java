import java.util.Scanner;

public class EX11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1,fim,in,tb;
        System.out.println("Digite a Tabuada");
        tb=scan.nextInt();
        System.out.println("Digite o ponto de inicio da tabuada");
        in=scan.nextInt();
        System.out.println("Digite o ponto de termino da tabuada");
        fim=scan.nextInt();

        for(int i=in;i>fim-1;i--){

            System.out.printf("%d x %d = %d %n",tb,i,tb*i);

        }

        
    }
}
