public class Test {
    public static void main(String[] args) {


    BankAccount account1 = new BankAccount(10.0, 10.0);

    account1.addAmount("Checkings", 100.0);
    account1.addAmount("Savings", 100.0);
    account1.withdraw("Savings", 100.0);

    System.out.println(account1.getCheckBalance());
    System.out.println(account1.getSaveBalance());
    
    System.out.println(BankAccount.getTotal());
    
    }
}