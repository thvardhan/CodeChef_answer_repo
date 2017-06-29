package HS08TEST;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by thvardhan on 6/29/17.
 * Problem can be found at https://www.codechef.com/problems/HS08TEST
 * Execution Time on codechef : 0.05 seconds.
 */
public class SourceMain {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        float moneyToBeWithdrawn = Float.parseFloat(input.split(" ")[0]);
        float moneyInAccount = Float.parseFloat(input.split(" ")[1]);
        if (moneyToBeWithdrawn % 5 != 0) {
            System.out.println(moneyInAccount);
        } else {
            final float BANK_CHARGE = 0.50F;
            float finalMoney = moneyInAccount - moneyToBeWithdrawn - BANK_CHARGE;
            if (finalMoney > 0) {
                System.out.println(finalMoney);
            } else {
                System.out.println(moneyInAccount);
            }
        }
    }

}
