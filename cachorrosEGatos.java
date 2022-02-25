
import java.lang.*;
import java.util.Scanner;

class  cachorrosEGatos {

    // Metodo busca o elemento mais proximo que estiver dentro da array definida
    public static int encontrarMaisProximo(int arr[], int obj) {
        int num = arr.length;

        int i = 0, j = num, meio = 0;
        while (i < j) {
            meio = (i + j) / 2;

            if (arr[meio] == obj)
                return arr[meio];

            if (obj < arr[meio]) {
                if (meio > 0 && obj > arr[meio - 1])
                    return retornaMaisProximo(arr[meio - 1], arr[meio], obj);
                j = meio;
            } else {
                if (meio < num -1 && obj < arr[meio + 1])
                    return retornaMaisProximo(arr[meio], arr[meio + 1], obj);
                i = meio + 1;
            }
        }
        return arr[meio];
    }

    // Metodo que compara os valores
    public static int retornaMaisProximo (int val1, int val2, int obj) {
        if (obj - val1 >= val2 - obj)
            return val2;
        else
            return val1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a posicao do cachorro 1: ");
        int bob = scan.nextInt();

        System.out.print("Digite a posicao do cachorro 2: ");
        int rex = scan.nextInt();

        System.out.print("Digite a posicao do gato: ");
        int oli = scan.nextInt();

        System.out.println(encontrarMaisProximo(arr, bob));
        System.out.println(encontrarMaisProximo(arr, rex));
        System.out.println(encontrarMaisProximo(arr, oli));

    }
}
