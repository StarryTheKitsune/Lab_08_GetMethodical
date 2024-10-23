import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int birthYear;
        int birthMonth;
        int birthDay;
        int birthHour;
        int birthMinute;

        birthYear = SafeInput.getRangedInt(in, "Enter the year you were born", 1950,2015);
        birthMonth = SafeInput.getRangedInt(in, "Enter the month you were born", 1,12);
        birthDay = SafeInput.getRangedInt(in, "Enter the day you were born", 1,switch (birthMonth) {
                    case 1,3,5,7,8,10,12 -> 31;
                    case 2 -> 29;
                    case 4,6,9,11 -> 30;
                    default -> 0;
        });
        birthHour = SafeInput.getRangedInt(in, "Enter the hour you were born", 0,23);
        birthMinute = SafeInput.getRangedInt(in, "Enter the minute you were born", 0,59);
        System.out.println("You were born on " + birthMonth + "/" + birthDay + "/" + birthYear + " at " + birthHour + ":" + birthMinute);
    }
}
