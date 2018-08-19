package com.dexolabs.cprogramming.data;

import com.dexolabs.cprogramming.model.TutorialModel;

import java.util.ArrayList;
import java.util.TreeMap;

public class ProgramData {
    public static ArrayList<TutorialModel> getProgramData() {
        ArrayList<TutorialModel> programModelList = new ArrayList<>();
        TreeMap<String, String> options = new TreeMap<>();

        options.put("Hello world Program", "1_program.html");
        options.put("Print an Integer (Entered by the User)", "2_program.html");
        options.put("Add Two Integers", "3_program.html");
        options.put("Multiply two Floating Point Numbers", "4_program.html");
        options.put("Perform addition, subtraction, multiplication and division", "5_program.html");
        options.put("Find the Size of int, float, double and char", "9_program.html");
        options.put("Program to print \"hello\" without semicolon", "34_program.html");
        options.put("Program without main() function", "35_program.html");
        options.put("Convert Number in Characters", "36_program.html");
        options.put("Roots Of Quadratic Equation", "41_program.html");
        programModelList.add(new TutorialModel("Basic Programs", options));


        options = new TreeMap<>();
        options.put("Check if a given Integer is Odd or Even", "6_program.html");
        options.put("Swap Two Numbers", "10_program.html");
        options.put("Swap Number Without Using Temporary Variables", "11_program.html");
        options.put("Generate Multiplication Table", "12_program.html");
        options.put("Find Factorial of a Number", "13_program.html");
        options.put("Calculate the Sum of Natural Numbers", "14_program.html");
        options.put(" Whether a Number is Positive or Negative", "16_program.html");
        options.put("Check Leap Year", "17_program.html");
        options.put("Largest Number Among Three Numbers", "18_program.html");
        options.put("Program to sum n numbers using for loop", "27_program.html");
        options.put("Prime Number program", "28_program.html");
        options.put("Fibonacci Series without recursion", "29_program.html");
        options.put("Fibonacci Series using recursion", "30_program.html");
        options.put("Find Palindrome number", "31_program.html");
        options.put("Armstrong Number", "32_program.html");
        options.put("Reverse number", "33_program.html");
        options.put("Strong number", "37_program.html");
        options.put("Find power of a number using recursion", "40_program.html");
        options.put("Perfect number", "42_program.html");
        programModelList.add(new TutorialModel("Numbers", options));


        options = new TreeMap<>();
        options.put("Find ASCII Value of a Character", "7_program.html");
        options.put("Program to check vowel or consonant using if else", "5_program.html");
        options.put("Whether a Character is an Alphabet or not", "15_program.html");
        options.put("Check Whether a Character is Vowel or Consonant", "19_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        programModelList.add(new TutorialModel("Characters", options));

        options = new TreeMap<>();
        options.put("Basic C Array", "65_program.html");
        options.put("Program for one dimensional array", "66_program.html");
        options.put("Program for two dimensional array", "67_program.html");
        options.put("Print reverse array", "68_program.html");
        options.put("Calculate sum of array", "69_program.html");
        options.put("Calculate average of array", "70_program.html");
        options.put("Find largest array element", "71_program.html");
        options.put("Second largest array element", "72_program.html");
        options.put("Find smallest array element ", "73_program.html");
        options.put("Copy array", "74_program.html");
        options.put("Reverse copy array", "75_program.html");
        options.put("Program to divide array", "76_program.html");
        options.put("Array concatenation program", "77_program.html");
        programModelList.add(new TutorialModel("Arrays", options));


        options = new TreeMap<>();
        options.put("Frequency of Characters in a String", "20_program.html");
        options.put("Count the number of vowels, consonants", "21_program.html");
        options.put("Remove all Characters in a String Except Alphabet", "22_program.html");
        options.put("Find the Length of a String", "23_program.html");
        options.put("Concatenate Two Strings", "24_program.html");
        options.put("Copy String Without Using strcpy()", "25_program.html");
        options.put("Sort Elements in Dictionary Order", "26_program.html");
        programModelList.add(new TutorialModel("Strings", options));


        options = new TreeMap<>();
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        programModelList.add(new TutorialModel("Matrix", options));


        options = new TreeMap<>();
        options.put("Floyd's triangle", "43_program.html");
        options.put("Fibonacci Triangle", "44_program.html");
        options.put("Alphabet Triangle", "45_program.html");
        options.put("Number Triangle", "46_program.html");
        options.put("Print half pyramid using *", "47_program.html");
        options.put("Pascal's triangle", "48_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        programModelList.add(new TutorialModel("Patterns", options));


        options = new TreeMap<>();
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        programModelList.add(new TutorialModel("Pointers I/O", options));


        options = new TreeMap<>();
        options.put("Program to create, declare and initialize structure", "60_program.html");
        options.put("Program to declare, initialize an union, example of union", "63_program.html");
        options.put("Store Information of a Student Using Structure", "53_program.html");
        options.put("Add Two Complex Numbers by Passing Structure to a Function", "54_program.html");
        options.put("Store Information Using Structures with Dynamically Memory Allocation", "55_program.html");
        options.put("Add Two Distances (in inch-feet) System Using Structur", "56_program.html");
        options.put("Store Information of Students Using Structure", "57_program.html");
        options.put("Calculate Difference Between Two Time Periods\n", "58_program.html");
        options.put("Difference between union and structure\n", "59_program.html");
        options.put("C program to demonstrate example of Nested Structure", "61_program.html");
        options.put("Structure with pointer", "62_program.html");
        options.put("Structure of array", "64_program.html");
        programModelList.add(new TutorialModel("Structure and Union", options));


        options = new TreeMap<>();
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        programModelList.add(new TutorialModel("File I/O", options));


        options = new TreeMap<>();
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        programModelList.add(new TutorialModel("Conversations", options));



        options = new TreeMap<>();
        options.put("Use gets() function", "2_program.html");
        options.put("Program to shutdown or turn off computer", "38_program.html");
        options.put("Program to get IP address", "39_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        programModelList.add(new TutorialModel("System", options));

        options = new TreeMap<>();
        options.put("Use gets() function", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        options.put("", "2_program.html");
        programModelList.add(new TutorialModel("Extras", options));

        return programModelList;
    }
}
