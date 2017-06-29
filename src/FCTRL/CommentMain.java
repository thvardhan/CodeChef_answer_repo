package FCTRL;


import java.io.*;

/**
 * Created by thvardhan on 6/29/17.
 * Problem can be found at https://www.codechef.com/problems/FCTRL
 * Execution Time on codechef : 0.16 seconds.
 */
class CommentMain {

    public static void main(String[] args) throws IOException {

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        // BufferedReader and PrintWriter. These are pretty fast compared to java's scanner and system.out

        int testCases=Integer.parseInt(reader.readLine());// First line input containing number of test cases.

        while (testCases-->0){// This loop runs for next 'testCase' times.

            int input=Integer.parseInt(reader.readLine());// First line of input containing our data.
            int pw=1;// The power variable.
            int trailingZeros=0;// Number of trailing zeros.

            // We cant calculate each factorial and then count its trailing zeros as it would take *forever* to do that.
            // so instead, we are gonna calculate the trailing zeros using 5th power method.
            // If you don't know what that method is, then you can check it out right here -> http://www.purplemath.com/modules/factzero.ht
            for (int i = 1; pw>0; i++) {
                // This loop runs until we reach 0th factor.
                pw=(int)Math.floor(input/(int)Math.pow(5,i)); // Calculates the 5th power i-th i.e. 5^1,5^2,5^3... so forth.
                // After that it divides the input with that power integer, rounds it up and stores into pw variable.

                trailingZeros+=pw;// Adds pw into trailing zeros variable.
            }

            out.println(trailingZeros);
        }
        out.flush();// flushes the output stream to avoid memory leaks.

    }
}
