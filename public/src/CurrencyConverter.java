package App;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyConverter {
    DecimalFormat f = new DecimalFormat("###,###.##");

    private void userAuth (String name, String currency, int i, Scanner userInput) {
        System.out.print("Hello! Welcome to Currency Converter. Please, enter your name for verification! ");
        name = userInput.nextLine();

        System.out.print("Hello, " + name + ". What currency would you like to convert your money with? (PHP, AUD, USD, CAD) ");
        currency = userInput.nextLine();

        System.out.print("\nHow much money would you convert? ");
        i = userInput.nextInt();
        
        switch (currency) {
            case "PHP":
                System.out.println("Loading...\n");

                // Conversion
                Double US_dollar = i / 55.53;
                Double CA_dollar = i / 41.75;
                Double AU_dollar = i / 37.02;

                // Final Output
                System.out.println("USD: " + f.format(US_dollar));
                System.out.println("CAD: " + f.format(CA_dollar));
                System.out.println("AUD: " + f.format(AU_dollar));

            break;

            case "AUD":
                System.out.println("Loading...\n");

                // Conversion
                Double PH_peso = i / 0.027;
                US_dollar = i / 1.50;
                CA_dollar = i / 1.12;

                // Final Output
                System.out.println("PHP: " + f.format(PH_peso));
                System.out.println("USD: " + f.format(US_dollar));
                System.out.println("CAD: " + f.format(CA_dollar));

            break;

            case "USD":
                System.out.println("Loadin...\n");

                // Conversion
                PH_peso = i / 0.0180045;
                AU_dollar = i / 0.666847;
                CA_dollar = i / 0.751934;

                // Final Output 
                System.out.println("PHP: " + f.format(PH_peso));
                System.out.println("AUD: " + f.format(AU_dollar));
                System.out.println("CAD: " + f.format(CA_dollar));

            break;

            case "CAD":
                System.out.println("Loading...\n");

                // Conversion
                PH_peso = i / 0.0239399;
                AU_dollar = i / 0.886986;
                US_dollar = i / 1.32976;

                // Final Output
                System.out.println("PHP: " + f.format(PH_peso));
                System.out.println("AUD: " + f.format(AU_dollar));
                System.out.println("CAD: " + f.format(US_dollar));

            break;
            
            default:
                currency = null;
                System.out.print("Sorry, we are currently not supporting that currency");
                System.exit(0);
            break;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CurrencyConverter a = new CurrencyConverter();
        
        a.userAuth("", "", 0, scan);
    }
}