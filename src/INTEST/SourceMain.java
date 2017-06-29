package INTEST;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by thvardhan on 6/29/17.
 * Problem can be found at https://www.codechef.com/problems/INTEST
 * Execution Time on codechef : 0.29 seconds.
 */
class SourceMain {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String line=reader.readLine();
        int n=Integer.parseInt(line.split(" ")[0]);
        int k=Integer.parseInt(line.split(" ")[1]);
        int total=0;
        while (n-->0){
            line=reader.readLine();
            if(Integer.parseInt(line)%k==0){
                total++;
            }
        }
        System.out.println(total);
    }


}
