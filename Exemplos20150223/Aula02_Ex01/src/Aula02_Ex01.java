/*
resolucao do exercicio 3 da lista que esta no tidia que o 
isidro colocou para que a gente possa programar, passar de ano e
 ser feliz! :D
 */
import java.util.Scanner;
public class Aula02_Ex01 {
    public static void main(String args[]){
        //preparar teclado
        Scanner teclado =  new Scanner(System.in);
        float salarioM, valorKw, valorBruto, valorLiquido;
        int   qtdeKw;
        
        System.out.println("Qual o valor do Salario Minimo?");
        salarioM = teclado.nextFloat();
        System.out.println("Quantos Kw consumidos?");
        qtdeKw   = teclado.nextInt();
        
        valorKw      = salarioM / 700;
        valorBruto   = qtdeKw * valorKw;
        valorLiquido = valorBruto * 0.9f;
        
        System.out.println("Valor do Kw          R$ "+valorKw);
        System.out.println("Valor total da Conta R$ "+valorBruto);
        System.out.println("Valor com Desconto   R$ "+valorLiquido);
    }    
}
