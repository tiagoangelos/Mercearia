package ambrosio;

import java.util.HashMap;
import java.util.Scanner;

public class Ambrosio {
    public static void main(String[] args) {
        //MERCEARIA AMBRÓSIO
        HashMap<Integer, Double> itens = new HashMap<Integer, Double>();
        
        //ITENS COM KEY CHAVE
        itens.put(1, 5.30);
        itens.put(2, 6.00);
        itens.put(3, 3.20);
        itens.put(4, 2.50);        
        
        //AMBIENTE
        System.out.println("===============================");
        System.out.println("PRODUTOS MERCEARIA AMBRÓSIO");
        System.out.println("===============================");
    
        //PRODUTOS CODIGO E PREÇO
        System.out.println("===============================");
        System.out.println("CODIGO " + " PRODUTOS: " + "  PREÇOS");
        System.out.println("  1"     + "      FEIJÃO "    +  "     5,30");
        System.out.println("  2"     + "      ARROZ "    +   "      6,00");
        System.out.println("  3"     + "      AÇUCAR "    +   "     3,20");
        System.out.println("  4"     + "      MACARRÃO "    +   "   2,50");
        System.out.println("===============================");
        
        //SOLICITANDO O TAMANHO DO VETOR:
        Scanner ler = new Scanner(System.in);
        System.out.print("Quantos Produtos Você Deseja Comprar: ");
        int q = ler.nextInt();
        double vetor[] = new double[q];
        
        //SOLICITANDO DADOS DE ACORDO COM O TAMANHO DO VETOR:
        for(int i = 0; i < q; i++){
            System.out.print("DIGITE O CÓDIGO DO PRODUTO DESEJADO: ");
            int p = ler.nextInt();
            vetor[i] = itens.get(p);
            double res = vetor[i];
        }
 
        //PARA PODER ACESSAR OS VALORES OU RESULTADO
        double res = 0;
        for(int i = 0; i < q; i++){ 
            res = res + vetor[i];
        }
       
        //POSSIBILIDADE DE DESCONTO:
        if(q >= 15 || res >= 40){
            double des = res - 1.15;
            System.out.println("DESCONTO DE 15% CONCEDIDO!!!");
            System.out.println("TOTAL A PAGAR " + des + " REAIS");
        }else{
            System.out.println("TOTAL A PAGAR : " + res + " REAIS");
        }     
    }      
}