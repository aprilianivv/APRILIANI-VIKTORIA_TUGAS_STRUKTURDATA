import java.io.BufferedReader; //Iksan
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class main {
    private static double celsiusToKelvin(double C) {
        return C + 273.15;
    }

    private static double celsiusToFahrenheit(double C) {
        return C * 1.8 + 32;
    }

    private static double kelvinToCelsius(double K) { //Natasya
        return K - 273.15;
    }

    private static double kelvinToFahrenheit(double K) {
        return K * 1.8 - 459.67;
    }

    private static double fahrenheitToCelsius(double F) {
        return (F - 32) / 1.8;
    }

    private static double fahrenheitToKelvin(double F) {
        return (F + 459.67) / 1.8;
    }

    private static void menuList() { //Farahh
        System.out.println("|=======================|");
        System.out.println("| Program Konversi Suhu |");
        System.out.println("|=======================|");
        System.out.println("[1] Dari Celsius");
        System.out.println("[2] Dari Kelvin");
        System.out.println("[3] Dari Fahrenheit");
        System.out.println("[4] Keluar");

        InputStreamReader isr = new InputStreamReader(System.in); //Amanah
        BufferedReader bufferedReader = new BufferedReader(isr);

        try {
            System.out.print("\nMasukkan Pilihan Anda = ");
            String input = bufferedReader.readLine();

            if (input.isEmpty()) {
                System.out.println("\nAnda tidak memasukkan inputan, silahkan coba lagi.\n");
                menuList();
            } else {
                int numberOfString = Integer.parseInt(input);

                switch (numberOfString) {
                    case 1 -> fromCelsius();
                    case 2 -> fromKelvin();
                    case 3 -> {
                        fromFahrenheit();
                        System.out.println("\nThank You For Using This Application.\n");
                    }
                    default -> {
                        System.out.println("\nInputan yang Anda masukkan salah. Silahkan coba lagi.\n");
                        menuList();
                    }
                }
            }
        } catch (NumberFormatException | IOException e) {
            System.out.println("\nInputan yang Anda masukkan salah. Silahkan coba lagi.\n");
            menuList();
        }
    }

    private static void fromCelsius() { //Dini
        String coba;

        do {
            double suhu;

            System.out.print("\nMasukkan suhu (C) = ");

            Scanner scanner = new Scanner(System.in);
            suhu = scanner.nextDouble();

            DecimalFormat df = new DecimalFormat("#.#####");
            df.setRoundingMode(RoundingMode.CEILING);

            double resultCtk = celsiusToKelvin(suhu);
            System.out.println((df.format(suhu)) + " Celsius adalah sama dengan " + (df.format(resultCtk)) + " Kelvin");

            double resultCtf = celsiusToFahrenheit(suhu);
            System.out.println((df.format(suhu)) + " Celsius adalah sama dengan " + (df.format(resultCtf)) + " Fahrenheit");

            System.out.print("\nIngin mencoba lagi? (y/t) = ");
            coba = scanner.next();
        } while (coba.equals("Y") || coba.equals("y"));

        System.out.println("\n");

        menuList();
    }

    private static void fromKelvin() { //Andri
        String coba;

        do {
            double suhu;

            System.out.print("\nMasukkan suhu (K) = ");

            Scanner scanner = new Scanner(System.in);
            suhu = scanner.nextDouble();

            DecimalFormat df = new DecimalFormat("#.#####");
            df.setRoundingMode(RoundingMode.CEILING);

            double resultKtc = kelvinToCelsius(suhu);
            System.out.println((df.format(suhu)) + " Kelvin adalah sama dengan " + (df.format(resultKtc)) + " Celsius");

            double resultKtf = kelvinToFahrenheit(suhu);
            System.out.println((df.format(suhu)) + " Kelvin adalah sama dengan " + (df.format(resultKtf)) + " Fahrenheit");

            System.out.print("\nIngin mencoba lagi? (y/t) = ");
            coba = scanner.next();
        } while (coba.equals("Y") || coba.equals("y"));

        System.out.println("\n");

        menuList();
    }

    private static void fromFahrenheit() { //Erii
        String coba;

        do {
            double suhu;

            System.out.print("\nMasukkan suhu (F) = ");

            Scanner scanner = new Scanner(System.in);
            suhu = scanner.nextDouble();

            DecimalFormat df = new DecimalFormat("#.#####");
            df.setRoundingMode(RoundingMode.CEILING);

            double resultFtc = fahrenheitToCelsius(suhu);
            System.out.println((df.format(suhu)) + " Fahrenheit adalah sama dengan " + (df.format(resultFtc)) + " Celsius");

            double resultFtk = fahrenheitToKelvin(suhu);
            System.out.println((df.format(suhu)) + " Fahrenheit adalah sama dengan " + (df.format(resultFtk)) + " Kelvin");

            System.out.print("\nIngin mencoba lagi? (y/t) = ");
            coba = scanner.next();
        } while (coba.equals("Y") || coba.equals("y"));

        System.out.println("\n");

        menuList();
    }
    
    public static void main(String[] args) {
        menuList();
    }

}
