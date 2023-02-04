import java.util.Scanner;
import java.math.*;
import java.util.concurrent.LinkedTransferQueue;

public class PositivoNegativo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um numero: ");
        double num1 = sc.nextDouble();

        if (num1>0){
            System.out.println("O numero e POSITIVO!");
        }
        if (num1<0){
            System.out.println("O numero e NEGATIVO!");
        } else if (num1==0)
            System.out.println("O numero e ZERO.");
        {

        }


    }
}
