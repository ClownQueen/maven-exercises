package util;

import com.sun.jdi.DoubleValue;

import java.util.Scanner;

public class Input {
    private final Scanner input;

    public Input(){
        this.input = new Scanner(System.in);
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return this.input.nextLine();
    }

    public boolean yesNo(String prompt){
        System.out.println(prompt);
        String input = this.input.nextLine();
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")){
            return true;
        }
        return false;
    }

    public int getInt(String prompt){
        do {
            try{
                System.out.println(prompt);
                String s = getString(prompt);
                return Integer.valueOf(s);
            }catch (NumberFormatException e){
                System.out.println("Sorry but I only take numbers.");
            }
        }while (true);

    }

    public int getInt(String prompt, int min, int max){
        while(true){
            int result = getInt(prompt);
            if (result>= min && result<= max){
                return result;
            }
            System.out.printf("Integer must be between %d and %d\n", min, max);
        }
    }

    public double getDouble(String prompt){
        do {
            try{
                System.out.println(prompt);
                String s = getString(prompt);
                return Double.valueOf(s);
            }catch (NumberFormatException e){
                System.out.println("Sorry but I only take doubles.");
            }
        }while (true);

    }

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println(input.getString("Please enter a string: "));
        System.out.println(input.getInt("Enter a number between 1 and 10: ", 1, 10));
        System.out.println( input.yesNo("yes or no?"));
    }
}