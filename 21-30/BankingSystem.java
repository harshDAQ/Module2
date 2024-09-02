import java.util.ArrayList;
import java.util.Scanner;

interface Account {
    void displayBalance();

    void deposit(int amount);

    void withdraw(int amount);

    void calculateInterest(double rate, double time);
}

class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();

    // Add a new account to the bank
    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added successfully.");
    }

    // Display all account balances
    public void displayAccounts() {
        for (Account account : accounts) {
            account.displayBalance();
        }
    }

    // Find an account by account number
    public Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if ((account instanceof SavingsAccount
                    && ((SavingsAccount) account).getAccountNumber().equals(accountNumber)) ||
                    (account instanceof CurrentAccount
                            && ((CurrentAccount) account).getAccountNumber().equals(accountNumber))) {
                return account;
            }
        }
        return null;
    }
}

class SavingsAccount implements Account {
    private int balance;
    private String accountNumber;

    SavingsAccount(String accountNumber, int initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " successful");
    }

    @Override
    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful");
        }
    }

    @Override
    public void displayBalance() {
        System.out.println("Savings Account " + accountNumber + " Balance: " + balance);
    }

    @Override
    public void calculateInterest(double rate, double time) {
        double interest = balance * rate * time / 100;
        System.out.println("Interest earned: " + interest);
    }
}

class CurrentAccount implements Account {
    private int balance;
    private String accountNumber;

    CurrentAccount(String accountNumber, int initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " successful");
    }

    @Override
    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful");
        }
    }

    @Override
    public void displayBalance() {
        System.out.println("Current Account " + accountNumber + " Balance: " + balance);
    }

    @Override
    public void calculateInterest(double rate, double time) {
        System.out.println("Current Accounts do not earn interest.");
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("\nMenu:\n" +
                    "1) Add Savings Account\n" +
                    "2) Add Current Account\n" +
                    "3) Display All Account Balances\n" +
                    "4) Deposit\n" +
                    "5) Withdraw\n" +
                    "6) Calculate Interest\n" +
                    "7) Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter Account Number: ");
                    String savAccNo = sc.nextLine();
                    System.out.println("Enter Initial Balance: ");
                    int savInitBalance = sc.nextInt();
                    SavingsAccount savingsAccount = new SavingsAccount(savAccNo, savInitBalance);
                    bank.addAccount(savingsAccount);
                    break;

                case 2:
                    System.out.println("Enter Account Number: ");
                    String curAccNo = sc.nextLine();
                    System.out.println("Enter Initial Balance: ");
                    int curInitBalance = sc.nextInt();
                    CurrentAccount currentAccount = new CurrentAccount(curAccNo, curInitBalance);
                    bank.addAccount(currentAccount);
                    break;

                case 3:
                    bank.displayAccounts();
                    break;

                case 4:
                    System.out.println("Enter Account Number: ");
                    String accNo = sc.nextLine();
                    System.out.println("Enter Amount to Deposit: ");
                    int depAmount = sc.nextInt();
                    Account accountToDeposit = bank.findAccount(accNo);
                    if (accountToDeposit != null) {
                        accountToDeposit.deposit(depAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 5:
                    System.out.println("Enter Account Number: ");
                    accNo = sc.nextLine();
                    System.out.println("Enter Amount to Withdraw: ");
                    int withAmount = sc.nextInt();
                    Account accountToWithdraw = bank.findAccount(accNo);
                    if (accountToWithdraw != null) {
                        accountToWithdraw.withdraw(withAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 6:
                    System.out.println("Enter Account Number: ");
                    accNo = sc.nextLine();
                    Account accountToCalculateInterest = bank.findAccount(accNo);
                    if (accountToCalculateInterest != null) {
                        if (accountToCalculateInterest instanceof SavingsAccount) {
                            System.out.println("Enter Rate of Interest: ");
                            double interestRate = sc.nextDouble();
                            System.out.println("Enter Time Period (years): ");
                            double timePeriod = sc.nextDouble();
                            accountToCalculateInterest.calculateInterest(interestRate, timePeriod);
                        } else {
                            accountToCalculateInterest.calculateInterest(0, 0);
                        }
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 7:
                    System.out.println("Exiting the system.");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
