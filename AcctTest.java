import java.util.Scanner;

public class AcctTest{

public static void main(String[] args){
Scanner input = new Scanner(System.in);
Acct acct1 = new Acct("Joy Peter", 22.00);

System.out.println(acct1.getName() + " balance: " + acct1.getBalance());

System.out.println("Enter deposit amount for your account: ");
double depositAmt = input.nextDouble();
System.out.println("Adding " + depositAmt + " to your account balance");
acct1.deposit(depositAmt);

System.out.println(acct1.getName() + " balance: "+acct1.getBalance());
}
}