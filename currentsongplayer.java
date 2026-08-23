import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;
        while(isOnRepeat) {
            System.out.println("Play Current Song");
            System.out.println("Would you like to take this song off of repeat? If so, answer yes");
            String userInput = input.next();

            if(userInput.equals("yes")) {
                System.out.print("Playing Next Song");
                isOnRepeat = false;
            } else if (userInput.equals("no")) {
                System.out.println("Song Stays on Repeat.\n");
                isOnRepeat = false;
            } else {
                System.out.println("Invalid Input! Please Enter 'yes' or 'no' variable .\n");
            }
        }
        input.close();

    }
}
