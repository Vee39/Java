import java.util.Scanner;

public class ClassAverage{

public static void main(String[] args){
Scanner input = new Scanner(System.in);

int total = 0;
int counter = 1;

while(counter <= 10){
System.out.print("Enter student grade: ");
int grade = input.nextInt();
total = total + grade;
counter++;
}
int average = total/10;
//System.out.printf("Average score is: %d", average);
System.out.printf("The total of all 10 grades is %d%nClass average is: %d%n", total, average);

}
}