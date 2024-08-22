package com.company;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String inputNome = scanner.nextLine();

        System.out.println("Digite o numero da conta: ");
        String inputConta = scanner.nextLine();

        System.out.println("Digite o numero da agencia: ");
        String inputAgencia = scanner.nextLine();

        System.out.println("Digite o saldo: ");
        String inputSaldo = scanner.nextLine();

        System.out.println("Olá " + inputNome +", obrigado por criar uma conta em nosso banco, sua agência é "+ inputAgencia + ", conta "+ inputConta +" e seu saldo " + inputSaldo + " já está disponível para saque");
        scanner.close();
    }
}
