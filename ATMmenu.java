import java.util.*;
class ATMmenu{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter intial balance:");
        double b=sc.nextDouble();
        System.out.println("1.check Balance");
        System.out.println("2.Deposit");
        System.out.println("3.withdraw");
        System.out.println("4.Exit");
        System.out.println("Enter choice:");
        int ch=sc.nextInt();
        switch(ch){
            case 1:System.out.println("Current Balance:"+b);
                break;
            case 2:System.out.println("Enter deposit amount:");
                double d=sc.nextDouble();
                if(d>0){
                    System.out.println("Amount deposited successfully.");
                    System.out.println("Current Balance:"+(b+d));
                }
                else{
                System.out.println("Invalid deposit amount.");
             }
             break;
             case 3:System.out.println("enter withdrawl amount:");
             Double w=sc.nextDouble();
             if(w<=b && w>0){
                System.out.println("withdrawl successfull.");
                System.out.println("Remaining Balance:"+(b-w));
             }
             else{
                System.out.println("Insufficient Balance."+"\n Transaction failed");
             }
             break;
             case 4:System.out.println("Thankyou for using ATM.");
             break;
             default:System.out.println("Invalid option.please try again.");
             break;

    }
}
}