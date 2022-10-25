import java.util.Scanner;

public class EX16 {
    public static void main(String[] args) {

        Scanner scan2 = new Scanner(System.in);

        char[] n = new char[9];
        char simb = ' ';
        int jogo = 1, pos = 0, cont = 0;

        for (int i = 0; i < 9; i++) {
            n[i] = ' ';
        }

        while (jogo == 1) {
            cont++;
            if (cont % 2 == 0) {
                simb = 'X';
                System.out.println("Turno do: "+simb);
            }
            if (cont % 2 != 0) {
                simb = 'O';
                System.out.println("Turno do: "+simb);
            }
            System.out.println("");
            System.out.println("     1    2    3  ");
            System.out.println(" 1-  " + n[0] + " | " + n[1] + " | " + n[2]);
            System.out.println(" 2-  " + n[3] + " | " + n[4] + " | " + n[5]);
            System.out.println(" 3-  " + n[6] + " | " + n[7] + " | " + n[8]);

            System.out.println("Qual a posicao da jogada?");
            pos = scan2.nextInt();
            
            switch (pos) {

                case 11:
                    n[0] = simb;
                    break;
                case 12:
                    n[1] = simb;
                    break;
                case 13:
                    n[2] = simb;
                    break;
                case 21:
                    n[3] = simb;
                    break;
                case 22:
                    n[4] = simb;
                    break;
                case 23:
                    n[5] = simb;
                    break;
                case 31:
                    n[6] = simb;
                    break;
                case 32:
                    n[7] = simb;
                    break;
                case 33:
                    n[8] = simb;
                    break;
            }
            if      (n[0] == n[1] && n[0] == n[2] && n[0] != ' ') {
                System.out.println("Vitoria de : " + simb);
                jogo = 2;
            } 
            else if (n[0] == n[4] && n[0] == n[8] && n[0] != ' ') {
                System.out.println("Vitoria de : " + simb);
                jogo = 2;
            } 
            else if (n[0] == n[3] && n[0] == n[6] && n[0] != ' ') {
                System.out.println("Vitoria de : " + simb);
                jogo = 2;
            }            
            else if (n[1] == n[4] && n[1] == n[7] && n[1] != ' ') {
                System.out.println("Vitoria de : " + simb);
                jogo = 2;
            }            
            else if (n[2] == n[4] && n[2] == n[6] && n[2] != ' ') {
                System.out.println("Vitoria de : " + simb);
                jogo = 2;
            }
            else if (n[2] == n[5] && n[2] == n[8] && n[2] != ' ') {
                System.out.println("Vitoria de : " + simb);
                jogo = 2;
            }
            else if (n[3] == n[4] && n[3] == n[5] && n[3] != ' ') {
                System.out.println("Vitoria de : " + simb);
                jogo = 2;
            }            
            else if (n[6] == n[7] && n[6] == n[8] && n[6] != ' ') {
                System.out.println("Vitoria de : " + simb);
                jogo = 2;
            } 
            else if (cont == 9) {
                System.out.println("O jogo empatou nao houveram vencedores");
                jogo = 2;
            }
        }

    }

}
