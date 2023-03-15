import java.util.Scanner;
public class AccountTest{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

Account myAccount = new Account();

System.out.println("Initial name is: "+ myAccount.getName());

System.out.println("Please enter your name: ");

String theName = input.nextLine();

myAccount.setName(theName);

System.out.println("Account name is: " + myAccount.getName());

}
}