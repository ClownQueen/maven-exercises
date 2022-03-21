package main;

import org.apache.commons.lang3.StringUtils;
import util.Input;

public class stringExercise {

    public static void main(String[] args) {
        Input input = new Input();
        String response = input.getString("Please enter something: ");

        System.out.printf("You entered: \"%s\"\n", response);

        System.out.printf("\"%s\" ", response);

        if (StringUtils.isNumeric(response)){
            System.out.printf("\"%s\" is a number", response);
        } else {
            System.out.printf("\"%s\" is a not a number", response);
        }

        System.out.printf("Flipped case: %s\n", StringUtils.swapCase(response));

        System.out.printf("Reversed: %s\n", StringUtils.reverse(response));
    }
}
