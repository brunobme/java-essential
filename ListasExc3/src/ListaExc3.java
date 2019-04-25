/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marques.bruno
 */
import java.util.Scanner;
public class ListaExc3 {
    public static void main(String arg[]){
        //preparando o teclado
        Scanner teclado = new Scanner(System.in);
        
        //declarando variaveis loucas
        float valSal, valPorKw, total, desc10;
        int kw;
        
        //coletando os valores
        System.out.println("Digite o valor do salário mínimo:");
        valSal = teclado.nextFloat();
        System.out.println("Digite a quantidade de KW gasta:");
        kw = teclado.nextInt();
        
        //calculando as variaveis
        valPorKw = valSal / 700;
        total = kw * valPorKw;
        desc10 = total - (total / 10);

        //printando as paradas
        System.out.println("O valor bruto é R$ " + total + " com desconto de R$ " + total/10 + ", logo o valor líquido é: ");
        System.out.println("R$ " + desc10);
        
        
        
        
    }
}
