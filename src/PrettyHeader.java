public class PrettyHeader {
}
/**
 *
 * @param msg a message designated by the coder to display to the user in the fancy border
 */
public static void prettyHeader(String msg){
    int length = msg.length();
    int spacer = (52 - length) / 2;
    int count = 1;

    while(count <= 60){
        System.out.print("*");
        count++;
    }
    System.out.println();
    while(count >= 61 && count <= 63){
        System.out.print("*");
        count++;
    }
    while(count < 63 + spacer && count >= 64){
        System.out.print(" ");
        count++;
    }
    while(count == 63 + spacer){
        System.out.print(msg);
        count+=length;
    }
    while(count >= 63 + spacer + length && count <= 117){
        System.out.print(" ");
        count++;
    }
    while (count >= 118 && count <= 120){
        System.out.print("*");
        count++;
    }
    System.out.println();
    while (count >= 121 && count <= 180){
        System.out.print("*");
        count++;
    }


}
