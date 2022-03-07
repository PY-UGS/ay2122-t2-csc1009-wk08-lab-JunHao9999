public class CheckingAccount{
    private double balance;
    private String accNum;

    public CheckingAccount(){
        this.balance=0;
        this.accNum="";
    }
    public CheckingAccount(double balance,String accNum){
            this.balance=balance;
            this.accNum=accNum;
    }
    public void deposit(double amt){
        this.balance=this.balance+amt;
    }
    public void withdraw(double amt) {
        try {
            if(amt>this.balance) {
                double temp=this.balance-amt;
                throw new InsufficientFundsException("Sorry, but your account is short by :"+temp);
            }
        } catch (InsufficientFundsException i) {
            i.printStackTrace();
        } finally {
            if (amt<this.balance){
                this.balance = this.balance-amt;
            }
        }
    }

    public double getBalance(){
        return balance;
    }
    public String getNumber(){
        return accNum;
    }

}
