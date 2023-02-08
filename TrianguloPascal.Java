import java.util.Scanner;

public class TrianguloPascal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int linha, valor, numero, c;
        System.out.println("Digite o numero de linhas que deseja: ");
        numero = sc.nextInt();

        for (linha = 1; linha <= numero; linha++) {

            valor = 1;
            System.out.print(valor);
            System.out.println("  ");

            if (numero != 1) {
                for (linha = 1; linha < numero; linha++) {
                    valor = 1;
                    System.out.print(valor + " ");

                    for (c = 1; c <= linha; c++) {
                        valor = (valor * (linha - c + 1)) / c;
                        System.out.print(valor + " ");
                    }
                    System.out.println("  ");
                }
            }
        }
    }
}

