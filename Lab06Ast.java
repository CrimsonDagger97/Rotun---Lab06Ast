// Lab06Ast.java
// The First Bank Program
// Object Methods and Output Formatting
// This is the student, starting version of Lab 06A.

import java.text.DecimalFormat;

public class Lab06Ast
{
	public static void main(String args[])
	{
      // Create DecimalFormat and Bank Objects
      DecimalFormat money = new DecimalFormat("$00,000.00");
      Bank tom  = new Bank();
      Bank suzy = new Bank(1600,32000);
      Bank bill = new Bank(8000,Expo.random(20000,90000));

      // Display Initial Balances
      System.out.println("INTIAL BALANCES");
      System.out.println("Tom's checking balance: " + money.format(tom.getChecking()));
      System.out.println("Tom's savings balance: " + money.format(tom.getSavings()));
      System.out.println("Suzy's checking balance: " + money.format(suzy.getChecking()));
      System.out.println("Suzy's savings balance: " + money.format(suzy.getSavings()));
      System.out.println("bill's checking balance: " + money.format(bill.getChecking()));
      System.out.println("bill's savings balance: " + money.format(bill.getSavings()));
      





      // Deposits and Withdrawals
      tom.checkingDeposit(500);
      tom.savingsDeposit(7000);
      suzy.checkingDeposit(20000);
      suzy.savingsDeposit(4000);
      bill.checkingWithdrawal(8000);
      bill.savingsWithdrawal(bill.getSavings());
      
      





      // Display Final Balances
      System.out.println("FINAL BALANCES");
      System.out.println("Tom's checking balance: " + money.format(tom.getChecking()));
      System.out.println("Tom's savings balance: " + money.format(tom.getSavings()));
      System.out.println("Suzy's checking balance: " + money.format(suzy.getChecking()));
      System.out.println("Suzy's savings balance: " + money.format(suzy.getSavings()));
      System.out.println("bill's checking balance: " + money.format(bill.getChecking()));
      System.out.println("bill's savings balance: " + money.format(bill.getSavings()));







	}
}
