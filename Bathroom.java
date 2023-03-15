import java.util.Scanner;
public class Bathroom{
public static void main(String[] args){

Urine ikeoda = new Urine();
Scanner drop = new Scanner(System.in);
ikeoda.smell();
ikeoda.piss();
String result = drop.nextLine();
System.out.println(result + ", hello");
}

}