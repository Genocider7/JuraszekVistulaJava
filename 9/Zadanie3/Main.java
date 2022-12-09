package Zadanie3;

public class Main {
    public static void main(String[] args) {
        Account billsAccount = new Account("Bill", 3, 234);
        try
        {
            billsAccount.transferMoney(10);
        }
        catch (NotEnoughMoneyException moneyException)
        {
            System.out.println("Not enough money on balance");
            moneyException.printStackTrace();
            System.out.println(moneyException);
        }
        catch (Exception e)
        {
            System.out.println("Error occured");
            e.printStackTrace();
            System.out.println(e);
        }
        finally
        {
            System.out.println("Balance on account: " + billsAccount.getBalance());
        }
    }
}
