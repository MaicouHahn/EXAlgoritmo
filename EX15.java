public class EX15 {
    /*
     * Um circo deseja saber qual o preço ideal dos ingressos, de acordo com a
     * cidade que
     * visitam. Para tanto, eles descobriram que em média 120 pessoas comparecem em
     * cada sessão, quando o preço do ingresso é R$ 5,00. A partir disso, a cada
     * redução de
     * R$ 0,50 há um aumento de público, que difere em cada cidade. Cada sessão tem
     * um
     * custo de R$ 200,00 ao circo. Faça um programa que, dado o número adicional de
     * pessoas a cada redução de R$ 0,50 no preço do ingresso, imprima a tabela de
     * lucro de
     * cada sessão. Considere a variação de preço entre R$ 5,00 e R$ 1,00. Informe
     * também
     * ao usuário, qual é o valor de ingresso que gera o maior lucro. Dica: para
     * testar o
     * algoritmo, considere taxas de aumento de 26 e 30 pessoas
     */

    public static void main(String[] args) {
        float total, val;
        int pessoas = 120;

        for (float i = 5f; i >= 1;) {

            val = (pessoas * i) - 200;
            System.out.println(
                    "(caso aumente 30)Valor do ingresso: " + i + " Pessoas: " + pessoas + " Valor total: " + val);
            i = i - 0.50f;
            pessoas = pessoas + 26;
            total = (pessoas * i) - 200;
        }
        System.out.println("================================================");
        pessoas = 120;
        val = 0;
        for (float i = 5f; i >= 1;) {

            val = (pessoas * i) - 200;
            System.out.println(
                    "(caso aumente 30)Valor do ingresso: " + i + " Pessoas: " + pessoas + " Valor total: " + val);
            i = i - 0.50f;
            pessoas = pessoas + 30;
        }
    }

}
