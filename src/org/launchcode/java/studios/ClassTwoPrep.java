package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClassTwoPrep {

    public static void main(String[] args) {


        //Test Hash Map method
        HashMap<Double, String> testMap = new HashMap<>();

        testMap.put(1.0, "Ben");
        testMap.put(2.0, "Daniel");
        testMap.put(3.0, "Noah");
        testMap.put(4.0, "Cheryl");
        testMap.put(5.0, "Will");
        testMap.put(6.0, "Phil");

        testHashMap(testMap);

    }


    private static void testHashMap(HashMap<Double, String> map) {


        String newStudent;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student: ");
            newStudent = in.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("Grade: ");
                Double newGrade = in.nextDouble();
                map.put(newGrade, newStudent);

                // Read in the newline before looping back
                in.nextLine();
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;

        for(HashMap.Entry<Double, String> hash : map.entrySet())
        {
            System.out.println(hash.getKey() + " , " + hash.getValue());
        }



    }
}


