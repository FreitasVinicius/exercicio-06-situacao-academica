import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        double nota1;
        double nota2;
        double media;

        System.out.println("Digite a Nota 1: ");
        nota1 = entrada.nextDouble();

        System.out.println("Digite a Nota 2: ");
        nota2 = entrada.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.println("Nota1: " + nota1);
        System.out.println("Nota2: " + nota2);
        System.out.println("Media: " + media);

        System.out.print("Situação Esperada: ");


        if(media >= 7){
            System.out.println("Aprovado!");
        }else{
            System.out.println("Em Recuperação!");
        }

        entrada.close();

    }
}
