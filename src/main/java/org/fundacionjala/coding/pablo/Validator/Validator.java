package org.fundacionjala.coding.pablo.Validator;

/**
<<<<<<< HEAD
 * Created by PABLO on 3/21/2017.
=======
 * Created by Administrator on 3/21/2017.
>>>>>>> origin/develop
 */
public final class Validator {
    public static final int DIGIT_MULTIPLIER = 3;
    public static final int NUMBER_DIVISIBILITY = 10;

    /**
     * Constructor.
     */

    private Validator() {

    }

    /**
     * Check if a number is correct.
     */

    /**
     *
     * @param numberEAN number with 13 digits.
     * @return If the number is correct it returns true
     */

    public static boolean validator(final String numberEAN) {
        int sum = 0;

        for (int i = 1; i < numberEAN.length(); i++) {
            int numericValue = Character.getNumericValue(numberEAN.charAt(i - 1));

            sum += i % 2 == 0 ? numericValue * DIGIT_MULTIPLIER : numericValue;
        }

        int checkSum = sum % NUMBER_DIVISIBILITY != 0 ? NUMBER_DIVISIBILITY - (sum % NUMBER_DIVISIBILITY) : 0;
        return checkSum == Character.getNumericValue(numberEAN.charAt(numberEAN.length() - 1));
    }
}
