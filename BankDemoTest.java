import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
public class BankDemoTest{
    public static void main(String[] args) {
        int option=0;
        CheckingAccount c = new CheckingAccount(0, "acc1");
        while (option!=3) {
            Scanner sc = new Scanner(System.in);
            System.out.println("options:");
            System.out.println("(1): deposit");
            System.out.println("(2): Withdraw");
            System.out.println("(3): Exit");
            System.out.print("input option: ");
            option = sc.nextInt();
            double temp;
            if (option == 1) {
                System.out.print("Amount to deposit: ");
                temp = sc.nextDouble();
                c.deposit(temp);
                System.out.println("Bank balance: " + c.getBalance());
            } else if (option == 2) {
                System.out.println("Amount to withdraw");
                temp= sc.nextDouble();
                c.withdraw(temp);
                System.out.println("Bank balance: " + c.getBalance());
            }
        }
    }
}
