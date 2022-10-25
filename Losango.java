public class Losango {
    public static void main(String[] args) {

    int tam=10,ct=1,tam2;
    tam2=tam;

     while(tam>0){

        for(int i=0;i<tam;i++){
            System.out.print(" ");
        }
        for(int i=0;i<ct;i++){
            System.out.print("%");
        }
        System.out.print("\n");
        tam-=2;
        ct+=4;
    } 

    while(tam<tam2+1){

    for(int i=0;i<tam;i++){
        System.out.print(" ");
    }
    for(int i=0;i<ct;i++){
        System.out.print("%");
    }
    System.out.print("\n");
    tam+=2;
    ct-=4;
} 


    }
}
