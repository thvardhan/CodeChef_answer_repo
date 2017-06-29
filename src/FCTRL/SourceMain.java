package FCTRL;

import java.io.*;

/**
 * Created by thvardhan on 6/29/17.
 * Problem can be found at https://www.codechef.com/problems/FCTRL
 * Execution Time on codechef : 0.16 seconds.
 */
class SourceMain {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));


        int testCases=Integer.parseInt(reader.readLine());
        while (testCases-->0){

            int input=Integer.parseInt(reader.readLine());
            int pw=1;
            int trailingZeros=0;

            for (int i = 1; pw>0; i++) {
                pw=(int)Math.floor(input/(int)Math.pow(5,i));
                trailingZeros+=pw;
            }

            out.println(trailingZeros);
            //System.out.println(trailingZeros);
        }
        out.flush();


    }
}
