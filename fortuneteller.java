import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputtedNum;

        while (true) {
            System.out.println("Pick a number between 1 to 10");
            inputtedNum = scanner.nextInt();

            if(inputtedNum < 1 || inputtedNum > 10) {
                System.out.println("Please Enter Valid Number 1-10:");

            } else {
                break;
            }
        }

        if(inputtedNum < 5) {
            System.out.println("Good Luck!");
        } else {
            System.out.println("Bad Luck!");
        }

    }
}
