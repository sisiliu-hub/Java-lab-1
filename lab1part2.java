package com.example;
import java.util.ArrayList;

public class lab1part2 {
    public static void main(String[] args) {

        // Step 1: Create an ArrayList with 5 names
        ArrayList<String> names = new ArrayList<>();

        names.add("David");
        names.add("Peter");
        names.add("Linda");
        names.add("Michael");
        names.add("Sarah");

        // Step 2: Create another ArrayList for switched names
        ArrayList<String> switchedNames = new ArrayList<>();

        // Step 3: Switch the first and last letters
        for (String name : names) {

            // Convert the name to lowercase first
            String lowerName = name.toLowerCase();

            // Get the first and last letters
            char first = lowerName.charAt(0);
            char last = lowerName.charAt(lowerName.length() - 1);

            // Build the new name with the first and last letters switched
            String switched = last
                    + lowerName.substring(1, lowerName.length() - 1)
                    + first;

            // Capitalize the first letter of the new name
            switched = switched.substring(0, 1).toUpperCase()
                    + switched.substring(1).toLowerCase();

            // Add the new name to the ArrayList
            switchedNames.add(switched);
        }

        // Step 4: Print the original and switched names
        System.out.println("Names = " + names);
        System.out.println("Names (switched) = " + switchedNames);
    }
}
