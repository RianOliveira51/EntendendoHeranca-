package com.example.aprendendoheranca;

import com.example.aprendendoheranca.entities.BusinessAccount;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class AprendendoHerancaApplication {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter with number Account");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("Name Holder");
        String holder = sc.nextLine();
        System.out.println("balance");
        double balance = sc.nextDouble();
        System.out.println("Limit Account");
        double limit = sc.nextDouble();
        BusinessAccount b1 = new BusinessAccount(number,holder,balance,limit);
        System.out.println(b1);
        int opc;
        System.out.println("1 - Deposit  or 2 - withdraw or 3 - loan");
        opc = sc.nextInt();
        double amount;
        if(opc == 1){
            System.out.println("Quantity the deposit");
            amount = sc.nextDouble();
            b1.deposit(amount);
        }else if (opc == 2) {
            System.out.println("Quantity the withdraw");
            amount = sc.nextDouble();
            b1.withdraw(amount);
        }else{
            System.out.println("Quantity the loan");
            amount = sc.nextInt();
            b1.loan(amount);
        }
        System.out.println(b1);
    }

}
