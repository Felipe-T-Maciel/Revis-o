import java.util.Scanner;

public class saldo {
    public static void main(String[] args) {
        float saldo;
        boolean saque;
        double saldoIncial=0, depositar=0, sacar=0;
        int escolha=0;

        do{
            menu();
            switch(menu()){
                case 1:
                saldoIncial(saldoIncial);
                saldoIncial = saldoIncial(saldoIncial);
                break;
                case 2:
                Depositar(depositar, saldoIncial);
                saldoIncial = Depositar(depositar, saldoIncial);
                break;
                case 3:
                sacar(sacar, saldoIncial);
                if(sacar(sacar, saldoIncial)!=0){
                    System.out.println("\nSaque concluido");
                    saldoIncial = sacar(sacar, saldoIncial);
                }
                break;
                case 4:
                System.out.println("finish");
                break;
            }
            System.out.println("Saldo atual: "+saldoIncial+"\n");
        }while(menu()!=4);
    }
    public static int menu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Que metodo deseja escolher:\n\n[1] Digitar saldo inicial\n[2] Depositar\n[3] Sacar\n[4] Finalizar Programa\n> ");
        return Integer.parseInt(scan.nextLine());
    }

    public static double saldoIncial(double saldoIncial){
        Scanner scan = new Scanner(System.in);
        System.out.println("\nQual o saldo inicial: ");
        return Double.parseDouble(scan.nextLine());
    }

    public static boolean verificaSaque(double sacar, double saldoIncial){
        if(sacar<=saldoIncial){
            return true;
        }else{
            return false;
        }
    }

    public static double Depositar(double depositar, double saldoIncial){
        Scanner scan = new Scanner(System.in);
        System.out.println("\nQual o valor a ser depositado: ");
        depositar = scan.nextDouble();
        System.out.println("\nDeposito de "+depositar+" concluido");
        depositar = depositar+saldoIncial;
        return depositar;
    }

    public static double sacar(double sacar, double saldoIncial){
        Scanner scan = new Scanner(System.in);
        System.out.println("\nQual o valor a ser sacado: ");
        sacar = scan.nextDouble();
        if(verificaSaque(sacar, saldoIncial)==true){
            sacar = saldoIncial - sacar;
            return sacar;
        }else{
            System.out.println("\nSaldo insuficiente para saque");
            return sacar = 0;
        }
    }
}