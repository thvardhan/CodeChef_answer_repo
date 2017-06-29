package HS08TEST;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by thvardhan on 6/29/17.
 * Problem can be found at https://www.codechef.com/problems/HS08TEST
 * Execution Time on codechef : 0.05 seconds.
 */
class CommentMain {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedReader so we can take input. we could use scanner but its very slow compared to bufferedReader.

        String input = reader.readLine();
        // This string contains our first input line. We are gonna parse this string into two floats containing our values.

        float moneyToBeWithdrawn = Float.parseFloat(input.split(" ")[0]);
        // .split(" "); provides us an array containing our values. [0] is money to be withdrawn and
        // [1] is account money as per the question.
        float moneyInAccount = Float.parseFloat(input.split(" ")[1]);

        // Now before we do anything, we have to check if the money we are going to withdraw is multiple of 5
        if (moneyToBeWithdrawn % 5 != 0) {
            System.out.println(moneyInAccount);
        } else {
            // If its multiple of 5 else is triggered. Where we have to perform our operation.

            final float BANK_CHARGE = 0.50F;
            // Money charged by bank.

            float finalMoney = moneyInAccount - moneyToBeWithdrawn - BANK_CHARGE;
            // Money after its been withdrawn including bank charges.

            // Now we check if we can withdraw the money. if its not possible i.e. its below 0 we will just print the account money.
            if (finalMoney > 0) {
                System.out.println(finalMoney);
            } else {
                System.out.println(moneyInAccount);
            }

        }

    }

}
