package it.unibo.collections.sets;

import java.util.Collection;
import java.util.TreeSet;
import java.util.Iterator;

/**
 * Example class using {@link java.util.Set}.
 *
 */
public final class UseSet {

    private static final int ELEMS = 20;

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         *
         * 1) Builds a TreeSet containing Strings
         */
        TreeSet<String> internal = new TreeSet<>();
        /*
         * 2) Populates such Collection with all the Strings representing numbers ranging from "1" to
         * "20" (both included)
         */
        for(int i = 1; i<=20; i++) {
            internal.add(String.valueOf(i));
        }
        /*
         * 3) Prints its content
         */
        System.out.print(internal);
        /*
         * 4) Removes all those strings whose represented number is divisible by three.
         * Note: the method removeIf(Predicate) is not allowed.
         */
        Iterator<String> iterator = internal.iterator();

        while (iterator.hasNext()) {
            String numberString = iterator.next();
            int number = Integer.parseInt(numberString);

            if (number % 3 == 0) {
                iterator.remove();
            }
        }
        /*
         * 5) Prints the content of the Set using a for-each construct
         */
        for(String element: internal) {
                System.out.print(element + " ");
        }

        /*
         * 6) Verifies whether all the numbers left in the set are even
         */
        Iterator<String> iterator2 = internal.iterator();        
        boolean tuttiPari = true;

        while (iterator2.hasNext()) {
            String numeroStringa = iterator2.next();
            int numero = Integer.parseInt(numeroStringa);

            if (numero % 2 != 0) {
                tuttiPari = false;
                System.out.print("Non sono tutti pari:" + numero);
                break;
            }
            if (tuttiPari) {
                System.out.print("Tutti pari!");
            }
        }
    }
}
