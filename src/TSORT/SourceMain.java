package TSORT;

import java.io.*;
import java.util.Arrays;

/**
 * Created by thvardhan on 7/1/17.
 * Problem can be found at https://www.codechef.com/problems/TSORT
 * Execution Time on codechef : 0.38 seconds.
 */
class SourceMain {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        int testCases = Integer.parseInt(reader.readLine());
        int[] arrToSort = new int[testCases];

        for (int i = 0; i < testCases; i++) {
            arrToSort[i]=Integer.parseInt(reader.readLine());
        }

        Arrays.sort(arrToSort);

        for (int b:arrToSort) {
            out.println(b+"");
        }

        out.flush();
    }
}
