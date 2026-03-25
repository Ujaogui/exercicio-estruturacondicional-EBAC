import java.util.Scanner;

public class Estrutura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite um outro número: ");
        int num2 = scanner.nextInt();

        if (num1 > num2){
            System.out.println("o maior numero é: " + num1 + " o menor número é: " + num2 );
        }else if (num1 < num2) {
            System.out.println("o maior numero é: " + num2 + " o menor número é: " + num1 );
        }else {
            System.out.println("Os dois numeros são iguais");
        }



    }
}
