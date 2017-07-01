package FCTRL2;

import java.io.*;
import java.math.BigInteger;

/**
 * Created by thvardhan on 7/1/17.
 * Problem can be found at https://www.codechef.com/problems/FCTRL2
 * Execution Time on codechef : 0.06 seconds.
 */
class SourceMain {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        int testCases = Integer.parseInt(reader.readLine());
        while (testCases-- > 0) {
            BigInteger fact=new BigInteger("1");
            int n=Integer.parseInt(reader.readLine());
            for (int i = 2; i <= n; i++) {
                 fact=fact.multiply(new BigInteger(i+""));
            }
            out.println(fact.toString());
        }
        out.flush();
    }
}
