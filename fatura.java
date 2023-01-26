import java.util.Scanner;
public class fatura 
{
    public static void main(String[] args) 
    {
        Scanner leia = new Scanner(System.in);
        String numero[]=new String[5], descricao[]=new String[5];
        int quantidade[]=new int[5];
        double preco[]=new double[5],total[]=new double[5];
        
        for(int l=0;l<5;l++) 
        {
            numero[l] = numero();
            descricao[l] = descricao();
            quantidade[l] = quantidade();
            preco[l] = preco();
        }
        for(int l=0;l<5;l++) 
        {
            System.out.println("------------------------------------------");
            System.out.println("produto "+(l+1)+"\nNúmero: "+numero[l]+"\nDescrição: "+descricao[l]+"\nQuantidade: "+quantidade[l]+"\nPreco: "+preco[l]);
            System.out.println("------------------------------------------");
        }
        for(int l=0;l<5;l++) 
        {
            total[l]=preco[l]*quantidade[l];
            System.out.println("----------------Faturamento---------------");
            System.out.println("Produto "+(l+1)+"\nNúmero: "+numero[l]+" Descrição: "+descricao[l]+" Quantidade "+quantidade[l]+" Preço: "+preco[l]+"\nTOTAL "+total[l]);
            System.out.println("------------------------------------------");
        }
    }
    public static String numero() 
    {
        String numero;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite O numero do item");
        numero=leia.next();
        return numero;
    }
    public static String descricao() 
    {
        String descricao;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a descrição do item");
        descricao=leia.next();
        return descricao;
    }
    public static int quantidade() 
    {
        int quantidade;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a quantidade de itens");
        quantidade=leia.nextInt();
        return quantidade;
    }
    public static double preco() 
    {
        double preco;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite O preço do item");
        preco=leia.nextDouble();
        return preco;
    }
}