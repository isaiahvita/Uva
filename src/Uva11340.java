import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

// Accepted 12-16-2017

class Uva11340 {

    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {

            int testsAmt = Integer.parseInt(input.readLine());

            while (testsAmt > 0) {

                int tableSize = Integer.parseInt(input.readLine());

                HashMap<Character, Integer> table = new HashMap<Character, Integer>();

                // setup table
                for (int i = 0; i < tableSize; i++) {
                    String line = input.readLine();
                    String[] keyValue = line.split(" ");
                    Character key = new Character(keyValue[0].charAt(0));
                    Integer value = Integer.parseInt(keyValue[1]);
                    table.put(key, value);
                }

                double total = 0.0;
                int articleLines = Integer.parseInt(input.readLine());
                for (int i = 0; i < articleLines; i++) {
                    String line = input.readLine();
                    char[] charsInLine = line.toCharArray();
                    for (int k = 0; k < charsInLine.length; k++) {
                        Integer value = table.get(new Character(charsInLine[k]));
                        if (value != null)
                            total += value.intValue();
                    }
                }
                // formatting
                StringBuilder sb = new StringBuilder();
                sb.append(new DecimalFormat("0.00").format( total / 100.0) + "$\n");
                System.out.print(sb.toString());
                testsAmt--;
            }


        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
