import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean loop = true;
        System.out.println("Welcome to the Calculator");
        while (loop) {
            System.out.println("Please enter a command:");
            String input = reader.readLine();
            ArrayList<String> inputs = new ArrayList<>(Arrays.asList(input.split("\\s+")));
            int numericOutput;

            if (inputs.get(0).equals("exit")) {
                loop = false;
            }
            if (inputs.get(0).equals("add")) {
                numericOutput = calculator.add(Integer.parseInt(inputs.get(1)), Integer.parseInt(inputs.get(2)));
                System.out.println(numericOutput);
            }
            if (inputs.get(0).equals("subtract")) {
                numericOutput = calculator.subtract(Integer.parseInt(inputs.get(1)), Integer.parseInt(inputs.get(2)));
                System.out.println(numericOutput);
            }
            if (inputs.get(0).equals("multiply")) {
                numericOutput = calculator.multiply(Integer.parseInt(inputs.get(1)), Integer.parseInt(inputs.get(2)));
                System.out.println(numericOutput);
            }
            if (inputs.get(0).equals("divide")) {
                numericOutput = calculator.divide(Integer.parseInt(inputs.get(1)), Integer.parseInt(inputs.get(2)));
                System.out.println(numericOutput);
            }
            if (inputs.get(0).equals("fibonacci")) {
                numericOutput = calculator.fibonacciNumberFinder(Integer.parseInt(inputs.get(1)));
                System.out.println(numericOutput);
            }
            if (inputs.get(0).equals("binary")) {
                String stringOutput = calculator.intToBinaryNumber(Integer.parseInt(inputs.get(1)));
                System.out.println(stringOutput);
            }
        }
    }
}
