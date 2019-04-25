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
public class ListaExc17 {
    public static void main (String args[]){
       //decorando como preparar o teclado
        Scanner teclado = new Scanner(System.in);
        
        //vars
        float salBruto, salLiquido, imposto;
        
        System.out.println("Qual o seu salário Bruto?");
        salBruto = teclado.nextFloat();
        if(salBruto < 1000.0f){
            imposto = 0.0f;
        }else if(salBruto < 2500.0f){
            imposto = salBruto * 12.5f/100;
        }else if(salBruto < 5000.0f){
            imposto = salBruto * 25.0f/100;
        }else{
            imposto = 1300.0f;
        }
        
        salLiquido = salBruto - imposto;
        
        System.out.println("Seu salário líquido é " + salLiquido);
    }
}
