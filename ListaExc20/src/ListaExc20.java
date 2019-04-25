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
public class ListaExc20 {
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        //variáveis referentes à altura e o sexo
        float altura, peso;
        char sexo;
        
        //coletando dados
        System.out.println("Oi ^^ pode me dizer qual é o seu sexo (M|F)?");
        sexo = teclado.nextLine().charAt(0);
        
        System.out.println("E a sua altura?");
        altura = teclado.nextFloat();
        if(sexo == 'M' || sexo == 'm'){
            peso = altura * 72.7f - 58f;
            System.out.println("Meu brother, seu peso ideal é " + peso);
        }else if(sexo == 'F' || sexo == 'f'){
            peso = altura * 62.1f - 44.7f;
            System.out.println("Moça, seu peso ideal seria aproximadamente" + peso);
        }
    }
    
}
