import java.util.Scanner;

public class estruturaModular {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;

        System.out.println("de o valor para 'n': ");
        n = scan.nextInt();

        n(n);
    }

    public static void n(int n){
        int contador=0;
        System.out.println("*=======================*");
        while(n!=0){
            System.out.print("*");
            do{
                contador++;
                System.out.print(n);
            }while(n!=contador);

            System.out.print("*");

            do{
                contador++;
                System.out.print(n);
            }while(contador!=n*2);

            System.out.print("*");

            System.out.println("\n");
            n--;
            contador=0;
        }
        System.out.println("***");
        System.out.println("*-----------------------*");
    }
}

