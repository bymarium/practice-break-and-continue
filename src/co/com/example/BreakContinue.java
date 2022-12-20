package co.com.example;

public class BreakContinue {
    public static void main(String[] args) {
        System.out.println("Break");
        for (int counter = 0; counter < 3; counter++){
            if (counter % 2 == 0){
                System.out.println("counter = " + counter);
                break; //Only the first number is printed since we are breaking the cycle
            }
        }
        System.out.println("Continue");
        for (int counter = 0; counter < 3; counter++){
            if (counter % 2 != 0){
                continue; //Skip this line if the condition is not met and go to the next line
            }
            System.out.println("counter = " + counter);
        }
    }
}
