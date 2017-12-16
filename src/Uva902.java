// Accepted 12-7-2017
// Runtime 0.730 secs


import java.io.*;
import java.util.*;

class Uva902 {


    public static void main (String args[]) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {

            int psize = scanner.nextInt();
            String line = scanner.next();
            HashMap<String, Integer> count = new HashMap<String, Integer>();
            for (int i = 0; i <= (line.length() - psize); i++) {
                String substr = line.substring(i, i + psize);
                if (count.containsKey(substr)) {
                    count.put(substr, new Integer(count.get(substr).intValue() + 1));
                } else {
                    count.put(substr, new Integer(1));
                }

            }
            int max = Integer.MIN_VALUE;
            String most = new String();
            for (String key : count.keySet()) {

                if (count.get(key) > max) {
                    max = count.get(key).intValue();
                    most = key;
                }

            }
            System.out.println(most);

        }


    }


}

