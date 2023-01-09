package com.mycompany.calculadorasimples;

import java.util.Scanner;

/**
 * @author PBPaschoal
 */
public class CalculadoraSimples {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o primeiro valor: ");
        double n1 = teclado.nextDouble();
        System.out.println("Informe o segundo valor: ");
        double n2 = teclado.nextDouble();
        
        System.out.println("###### Selecione uma operação ######");
        System.out.println("[1] - SOMAR");
        System.out.println("[2] - SUBTRAIR");
        System.out.println("[3] - MULTIPLICAR");
        System.out.println("[4] - DIVIDIR");
        System.out.println(">>>>> ");
        int expressao = teclado.nextInt();
        
        switch(expressao){
            case 1:
                double soma = n1 + n2;
                System.out.println("Resultado: " + soma);
                break;
            case 2:
                double subtracao = n1 - n2;
                System.out.println("Resultado: " + subtracao );
                break;
            case 3:
                double multiplicacao = n1 * n2;
                System.out.printf("Resultado: %.2f", multiplicacao);
                break;
            case 4:
                double divisao = n1 / n2;
                System.out.printf("Resultado: %.2f", divisao);
                break;
            default:
                System.out.println("Opção invalida");
        }
        System.out.println("");
        teclado.close();
    }
}
