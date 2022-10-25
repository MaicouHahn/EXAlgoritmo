import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1=0,n2=1,res=0,lim;
        System.out.println("Quantos elementos de fibonacci voce quer imprimir?");
        lim=scan.nextInt();
        for(int i=0;i<lim;i++){

            res=n1+n2;
            System.out.println(res);
            n2=n1;
            n1=res;

        }
    }
}
