package FCTRL2;

import java.io.*;
import java.math.BigInteger;

/**
 * Created by thvardhan on 7/1/17.
 * Problem can be found at https://www.codechef.com/problems/FCTRL2
 * Execution Time on codechef : 0.06 seconds.
 */
class CommentMain {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        //Reader and Printer. As simple system.out.println and scanner are too slow.

        int testCases = Integer.parseInt(reader.readLine());
        //Reading the first console input number as test-cases.

        while (testCases-- > 0) {//This loop is called 'test-cases' times.

            BigInteger fact=new BigInteger("1");
            //As the value of 100! exceeds the capacity of LONG-int database, we are gonna use bigIntegers.
            int n=Integer.parseInt(reader.readLine());
            //Taking our N! input
            for (int i = 2; i <= n; i++) {//Factorial loop, it multiples '1' N times as a factorial function does.
                fact=fact.multiply(new BigInteger(i+""));
            }
            out.println(fact.toString());//Writing the output to console
        }
        out.flush();//Flush the writer.
    }
}
