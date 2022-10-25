import java.util.Scanner;

public class EX18 {
            /*
         * Faça um programa que desenhe na tela losangos ou triângulos utilizando
         * somente o
         * caractere “%” (veja exemplos abaixo). O usuário é quem escolhe o que deve ser
         * impresso. O usuário também deve ter a opção de escolher o tamanho (em linhas)
         * da
         * figura a ser desenhada.
         */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int bt;
        int tamL,ctL=1,tam2L;
        int tam,ct=1;
        
        System.out.println("1- Triangulo 2- Losango");
        bt=scan.nextInt();
        switch(bt){

        case 1:

            System.out.println("Qual o tamanho em linhas desse Triangulo?");
            tam=scan.nextInt();

            while(ct<tam*2){//essa multiplicação é para obter o numero correto de linhas impressas
                
                for(int i=0;i<ct;i++){
                    System.out.print("%");  
                }
                System.out.print("\n");
                    ct+=2;
            }
         break;

        case 2:
            System.out.println("Qual o tamanho em linhas desse Losango?");
            tamL=scan.nextInt();
            tam2L=tamL;
        
             while(tamL>0){
        
                for(int i=0;i<tamL;i++){
                    System.out.print(" ");
                }
                for(int i=0;i<ctL;i++){
                    System.out.print("%");
                }
                System.out.print("\n");
                tamL-=2;
                ctL+=4;
            } 

            while(tamL<=tam2L){//tamL é 0 e tam2L tem o valor antigo
        
            for(int i=0;i<tamL;i++){
                System.out.print(" ");
            }
            for(int i=0;i<ctL;i++){
                System.out.print("%");
            }
            System.out.print("\n");
            tamL+=2;
            ctL-=4;
            }
        break;

        }


       
  
    }
}
