import java.util.Scanner;

import javafx.scene.transform.Scale;

public class conceito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota;
        System.out.println("Que nota voce tirou: ");
        nota = scan.nextDouble();
        System.out.println("Seu conceito foi: "+classificarNota(nota));
    }

    public static char classificarNota(double nota){
        char notas;
        if(nota>=9){
            notas='A';
        }
        else if(nota>=8 & nota<9){
            notas='B';
        }
        else if(nota>=7 & nota<8){
            notas='C';
        }
        else if(nota>=6 & nota<7){
            notas='D';
        }
        else{
            notas='E';
        }

        return notas;
    }
}