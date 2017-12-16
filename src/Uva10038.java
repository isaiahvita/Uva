import java.io.*;
import java.util.*;

// Accepted 12-16-2017

class Uva10038 {


    public static void main(String[] args) {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line;

            outerloop:
            while ((line = input.readLine()) != null) {

                String[] unParsedInts = line.split(" ");

                int n = Integer.parseInt(unParsedInts[0]);
                boolean[] seenInts = new boolean[n];

                int prev, curr, diff;
                prev = Integer.parseInt(unParsedInts[1]);

                for (int i = 2; i < unParsedInts.length; i++) {

                    curr = Integer.parseInt(unParsedInts[i]);
                    diff = Math.abs(curr - prev);
                    prev = curr;
                    if (diff > (n - 1))
                        continue;
                    seenInts[diff] = true;

                }
                for (int i = 1; i < seenInts.length; i++) {
                    if (!seenInts[i]) {
                        System.out.println("Not jolly");
                        continue outerloop;
                    }
                }
                System.out.println("Jolly");

            }

        } catch (IOException ie) {
            ie.printStackTrace();
        }




    }
}
