package Zadanie3;

public class Account {
    private int accountNumber;
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    private String owner;
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    private int balance;
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public Account(String owner, int balance, int accountNumber)
    {
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void transferMoney(int money) throws NotEnoughMoneyException
    {
        if (money > balance)
        {
            throw new NotEnoughMoneyException();
        }
        balance -= money;
    }
}
