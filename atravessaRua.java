import java.util.Scanner;

public class atravessaRua {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x,y,d;

        System.out.println("Qual a distancia inicial que voce ja percorreu: ");
        x = scan.nextInt();

        System.out.println("A distancia que cada passo percorre: ");
        d = scan.nextInt();

        System.out.println("A distancia que precisa ser percorrida: ");
        y = scan.nextInt();

        atravessaRua(x, y, d);
    }

    public static void atravessaRua(int x, int y, int d){
        int contadorDePassos=0;
        while(x<y){
            contadorDePassos++;
            x+=d;
        }
        if(x>=y){
            System.out.println("Foram dados "+contadorDePassos+" passos");
        }
    }
}