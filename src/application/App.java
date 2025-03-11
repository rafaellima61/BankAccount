package application;

import dominio.Account;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account();

        System.out.println("Enter account number: ");
        account.setNumber(sc.nextInt());
        sc.nextLine();

        System.out.println("Type your name: ");
        account.setName(sc.nextLine());

        System.out.println("Enter initial deposit value: ");
        account.setDepositValue(sc.nextDouble());

        System.out.println("Account data: ");
        System.out.printf("Account %d, Holder: %s, Balance: $%.2f%n", account.getNumber(), account.getName(), account.getDepositValue());

        System.out.println("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        account.addDeposit(deposit);

        System.out.printf("Updated account %d, Holder: %s, Balance: $%.2f%n", account.getNumber(), account.getName(), account.getDepositValue());

        System.out.println("Enter withdraw value: ");
        double withdraw = sc.nextDouble();
        account.withDrawDeposit(withdraw);

        System.out.printf("Updated account %d, Holder: %s, Balance: $%.2f%n", account.getNumber(), account.getName(), account.getDepositValue());

        sc.close();
    }
}
