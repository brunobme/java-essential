import java.util.Scanner;

public class Aula01_Ex01 {
    public static void main(String args[]) {
        // declarei um decodificador do tipo Scanner
        // que chamei de teclado
        Scanner teclado;
        // o meu decodificador vai ler do teclado
        teclado = new Scanner(System.in);
        
        String texto;
        System.out.println("Digite um texto");
        texto = teclado.nextLine();
        System.out.println("Seu texto "+texto);
        
        char letra;
        System.out.println("Digite uma letra");
        letra = teclado.nextLine().charAt(0);
        System.out.println("Sua letra "+letra);
        System.out.println("digite um valor inteiro");
        int v1 = teclado.nextInt();
        System.out.println("voce digitou "+v1);
        float v2;
        System.out.println("Digite um valor real");
        v2 = teclado.nextFloat();
        System.out.println("Voce digitou "+v2);
        System.out.println("Digite outro texto");
        texto = teclado.nextLine();
        texto = teclado.nextLine();
        System.out.println("Seu texto "+texto);
        
        
        

    }
}
