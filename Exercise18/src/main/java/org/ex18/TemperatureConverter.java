package org.ex18;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Press C to convert from Fahrenheit to Celsius.\n " +
                         "Press F to convert from Celsius to Fahrenheit.");
        String input = scanner.nextLine();
        System.out.print("Your choice: " + input );

        //C = (F − 32) × 5 / 9
        //F = (C × 9 / 5) + 32
        if(input.equals("C") || input.equals("c")){
            System.out.print("\nPlease enter the temperature in Fahrenheit: ");
            int temp_F = scanner.nextInt();
            int celsius = ((temp_F - 32) * 5) / 9;
            System.out.print("The temperature in Celsius is "+ celsius);
        }
        else if(input.equals("F") || input.equals("f")) {
            System.out.print("\nPlease enter the temperature in Celsius: ");
            int temp_C = scanner.nextInt();
            int fahrenheit = ((temp_C * 9) / 5) + 32;
            System.out.print("The temperature in Fahrenheit is "+ fahrenheit);
        }



}
}
