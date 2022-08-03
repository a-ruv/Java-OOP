public class BankAccount {
    private double checkBalance;
    private double saveBalance;
    public static int members = 0;
    public static int total = 0;

    public BankAccount(double checkBalance, double saveBalance){
        this.checkBalance = checkBalance;
        this.saveBalance = saveBalance;
        members++;
        total += checkBalance;
        total += saveBalance;
    }

    public double getCheckBalance(){
        return checkBalance;
    }

    public double getSaveBalance(){
        return saveBalance;
    }

    public void addAmount(String account, double amount){
        if (account == "Checkings"){
            this.checkBalance += amount;
            total += amount;
        }
        if(account == "Savings"){
            this.saveBalance += amount;
            total += amount;
        }
    }

    public void withdraw(String account, double amount){
        if(amount > 0){
            if (account == "Checkings" && amount < this.checkBalance ){
                this.checkBalance -= amount;
                total -= amount;
            }

            if(account == "Savings" && amount < this.saveBalance){
                this.saveBalance -= amount;
                total -= amount;
            }
        }
    }

    public static int getTotal(){
        return  total;
    }
}