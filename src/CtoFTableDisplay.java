public class CtoFTableDisplay {
    public static void main(String[] args) {

        for(double Celsius = -100; Celsius <= 100; Celsius++){
            double Fahrenheit = CtoF(Celsius);
            System.out.printf("%.2f\t%.2f\n",Celsius, Fahrenheit);
        };

    }
    public static double CtoF(double Celsius){
        return Celsius * 9/5 + 32;
    }
}
