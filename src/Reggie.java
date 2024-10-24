import java.util.Scanner;
public class Reggie {
    public static void main(String[] args) {
        String SSN;
        String studentMNumber;
        String menuChoice;
        Scanner in = new Scanner(System.in);

        SSN = SafeInput.getRegExString(in,"Enter your social security number","^\\d{3}-\\d{2}-\\d{4}$");
        studentMNumber = SafeInput.getRegExString(in,"Enter your student M number", "^(M|m)\\d{5}$");
        menuChoice = SafeInput.getRegExString(in, "Please make a selection from this menu", "^[OoSsVvQq]$");
        System.out.println("You said your social security number is: " + SSN + "\n You said your student M number is: " + studentMNumber + "\n You said your menu choice is: " + menuChoice);
    }
}
