import java.util.Scanner;

class UserBankAccount{
    int ta;
    UserBankAccount(int ta){
        this.ta = ta;
    }

    public void deposit(int ta) {
        this.ta += ta;
        System.out.println("AMOUNT DEPOSITED!");
    }

    public void withdraw(int ta) {
        if(ta <= this.ta){
            this.ta -= ta;
            System.out.println("AMOUNT WITHDRAWN!");
        }else{
            System.out.println("INSUFFICIENT BALANCE!");
            System.out.println("Balance : " + this.ta);
        }
    }

    public int checkBalance() {
        return this.ta;
    }
}

public class auto {
    public static void main(String[] args) {
        int ta;
        int ec;
        boolean condition = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Amount to start:");
        ta = sc.nextInt();
        UserBankAccount user1 = new UserBankAccount(ta);
        while(condition){
            System.out.println("Enter the operation to perform:");
            System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance");
            int re = sc.nextInt();
            switch(re){
                case 1:
                    System.out.println("Enter Amount to deposit:");
                    ta = sc.nextInt();
                    user1.deposit(ta);
                    break;
                case 2:
                    System.out.println("Enter Amount to withdraw:");
                    ta = sc.nextInt();
                    user1.withdraw(ta);
                    break;
                case 3:
                    ec = user1.checkBalance();
                    System.out.println("Available Balance : " + ec);
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
            boolean tryCondition = true;
            while(tryCondition) {
                System.out.println("Try Again(0 to No/1 to Yes)?");
                int mc = sc.nextInt();
                if(mc == 0){
                    System.out.println("Thankyou!");
                    condition = false;
                    break;
                }
                else if(mc != 1)
                    System.out.println("Invalid Number...\n");
                else
                    break;
            }
        }
    }
}