package it.unibo.collections.comparators;

import java.util.Comparator;

public class Comparatore implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        try {
            // Convert the strings to doubles
            double doubleValue1 = Double.parseDouble(str1);
            double doubleValue2 = Double.parseDouble(str2);

            // Compare the doubles
            return Double.compare(doubleValue1, doubleValue2);
        } catch (NumberFormatException e) {
            // Handle the case where Strings are not parseable as doubles
            // In this example, we treat non-parseable strings as equal
            return 0;
        }
    }
}
