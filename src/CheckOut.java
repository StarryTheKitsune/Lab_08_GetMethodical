import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double itemPrice;
        double totalPrice = 0;
        boolean done = false;

        while (!done) {
            itemPrice = SafeInput.getRangedDouble(sc, "Please input your item price", .50, 10.00);
            totalPrice = itemPrice + totalPrice;
            done = !(SafeInput.getYNConfirm(sc,"Do you have more items to input?"));
        }
        System.out.printf("Your total price is: $" + "%.2f", + totalPrice);
    }
}
