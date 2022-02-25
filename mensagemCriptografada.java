import java.util.Scanner;

public class mensagemCifrada {
    public static void main(String[] args) {

        Scanner scanMsg = new Scanner(System.in);
        System.out.print("Digite a mensagfem a ser cifrada: ");
        String mensagem = scanMsg.next();

        Scanner scanInt = new Scanner(System.in);
        System.out.print("Digite um numero de rotacoes: ");
        int rotacoes = scanInt.nextInt(); {
            while (rotacoes < 0) {
                System.out.println("Favor digitar um valor valido! ");
                rotacoes = scanInt.nextInt();
            }
        }
    }
