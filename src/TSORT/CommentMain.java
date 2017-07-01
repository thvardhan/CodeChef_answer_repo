package TSORT;


import java.io.*;
import java.util.Arrays;

/**
 * Created by thvardhan on 7/1/17.
 * Problem can be found at https://www.codechef.com/problems/TSORT
 * Execution Time on codechef : 0.38 seconds.
 */
class CommentMain {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        //Reader and Printer. As simple system.out.println and scanner are too slow.

        int testCases = Integer.parseInt(reader.readLine());
        //Reading the first console input number as test-cases.

        int[] arrToSort = new int[testCases];
        //An array of size equal to the number of test cases.

        for (int i = 0; i < testCases; i++) {//Loop that adds next 'test case' lines into the arrToSort variable.
            arrToSort[i]=Integer.parseInt(reader.readLine());
        }

        Arrays.sort(arrToSort);//Using java's inbuilt sort implementation.

        for (int b:arrToSort) { //Loop to go over every element of the array and print them out.
            out.println(b+"");
        }

        out.flush();//Flush the writer.
    }
}
