import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       double studentGPA = 2.42;
       String studentFirstName = "Yigit";
       String studentLastName ="Unsur";

       System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);
       System.out.println("What do you want update it to?");

       Scanner input = new Scanner(System.in);
       studentGPA = input.nextDouble();

       System.out.println(studentFirstName + " " + studentLastName +
               " now has a GPA of" + studentGPA);
    }
}
