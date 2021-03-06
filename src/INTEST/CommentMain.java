package INTEST;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by thvardhan on 6/29/17.
 * Problem can be found at https://www.codechef.com/problems/INTEST
 * Execution Time on codechef : 0.29 seconds.
 */
class CommentMain {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader because scanner is too slow.

        String line=reader.readLine();
        // First line containing values N and K. We are gonna parse these to integers.
        int n=Integer.parseInt(line.split(" ")[0]);
        int k=Integer.parseInt(line.split(" ")[1]);

        int total=0; //total divisible values.


        // Loop that takes next N input lines.
        while (n-->0){
            line=reader.readLine();
            // Checks if the number we entered is divisble by K.
            if(Integer.parseInt(line)%k==0){
                total++;
            }
        }

        // Once the loop ends we are gonna print the 'total' variable. It contains our answer.
        System.out.println(total);
    }


}
