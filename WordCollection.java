/*
 * Name: Jasmine Fontus
 * Course: CSD420
 * Module 5 Assignment
 * Date: June 29, 2026
 *
 * Description:
 * This program reads words from a text file, removes duplicate
 * words, and displays the unique words in ascending and
 * descending alphabetical order.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class WordCollection {

    public static void main(String[] args) {

        TreeSet<String> words = new TreeSet<>();

        try {
            File file = new File("collection_of_words.txt");
            Scanner input = new Scanner(file);

            while (input.hasNext()) {
                words.add(input.next().toLowerCase());
            }

            input.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            return;
        }

        // TEST CODE
        System.out.println("===== TEST OUTPUT =====");
        System.out.println("Unique words: " + words.size());
        System.out.println("Contains apple? " + words.contains("apple"));
        System.out.println("First word: " + words.first());
        System.out.println("Last word: " + words.last());

        // ASCENDING
        System.out.println("\nAscending Order:");
        for (String word : words) {
            System.out.println(word);
        }

        // DESCENDING
        System.out.println("\nDescending Order:");
        for (String word : words.descendingSet()) {
            System.out.println(word);
        }
    }
}