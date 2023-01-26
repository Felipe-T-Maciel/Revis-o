import java.util.Scanner;

public class cesar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String texto;
        int chave;

        System.out.println("Digite seu texto: ");
        texto = scan.next();
        
        System.out.println("A chave: ");
        chave = scan.nextInt();

        System.out.println("Criptografado: "+criptografa(texto, chave));

    }

    public static String criptografa(String texto, int chave){
        String vazio= "";
            for(int j=0;j<texto.length();j++){
                vazio = vazio + (char)(texto.charAt(j)+chave);
            }
        return vazio;
    }
}
"# Revis-o" 
