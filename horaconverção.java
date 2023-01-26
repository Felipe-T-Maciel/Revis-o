import java.util.Scanner;

public class horaconverção {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hora, minuto;
        boolean AM=false;

        System.out.println("Que horas são: ");
        hora = scan.nextInt();
        System.out.println("Minutos: ");
        minuto = scan.nextInt();

        if(conversao(hora, AM)==true){
            System.out.println(hora+":"+minuto+"AM");
        }
        else{
            System.out.println((hora-12)+":"+minuto+"PM");
        }

    }

    public static boolean conversao(int hora, boolean AM){
        hora -= 12;
        if(hora<0){
            return true;
        }else{
            return false;
        }
    }
}
