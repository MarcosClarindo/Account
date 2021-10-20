package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Account account;
		
		// Entrada de dados
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine(); 
		System.out.print("Is there an initial deposit (y/n)? ");
		// para ler um caractere
		char response = sc.next().charAt(0);
		
		if(response == 'y') {
			System.out.print("Enter initial value: ");
			double initialDeposit = sc.nextDouble();
			// na variável account, foi instanciada com o construtor de três argumentos
			account = new Account(number, holder, initialDeposit);
		}
		else {
			// instaciada com o construtor de dois argumentos
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		// Entrada de dados
		double depositValue = sc.nextDouble();
		// Chamando a classe Account
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		// Entrada de dados
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		
		
		
		
		
		sc.close();
	}

}
