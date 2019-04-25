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

public class meteoros {
    public static void main(String args[]){
        //preparando o teclado de novo
        Scanner teclado = new Scanner(System.in);
        
        //declarando as variáveis inteiras para o plano (x,y)
        int x1, x2, y1, y2, x, y;
        
        //valor das variáveis que determinam onde o meteoro vai cair
        System.out.print("Digite a coordenada x1 da sua fazenda: ");
        x1 = teclado.nextInt();
        System.out.print("agora a coordenada y1: ");
        y1 = teclado.nextInt();
        System.out.println();
        System.out.print("Digite a coordenada x2 da sua fazenda: ");
        x2 = teclado.nextInt();
        System.out.print("agora a coordenada y2: ");
        y2 = teclado.nextInt();
        
        System.out.print("Digite a coordenada x de queda do meteoro: ");
        x = teclado.nextInt();
        System.out.print("agora a coordenada y: ");
        y = teclado.nextInt();
       
        System.out.println();
        
        if(x <= x2 && x >= x1 && y <= y2 && y >= y1){
            System.out.println("Que droga! Sua fazenda foi atingida =/");
        }else{
            System.out.println("Ufa... Dessa vez você escapou");
        }
        
    }
}
