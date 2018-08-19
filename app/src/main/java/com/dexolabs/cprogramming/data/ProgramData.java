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
        options.put("Perform add, subtract, multiply and divide", "5_program.html");
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
        options.put("Swapping three values without forth variable", "126_program.html");
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
        options.put("Guess random number using C program", "105_program.html");
        programModelList.add(new TutorialModel("Numbers", options));


        options = new TreeMap<>();
        options.put("Find ASCII Value of a Character", "7_program.html");
        options.put("Program to check vowel or consonant using if else", "5_program.html");
        options.put("Whether a Character is an Alphabet or not", "15_program.html");
        options.put("Check Whether a Character is Vowel or Consonant", "19_program.html");
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
        options.put("Insert an Element in a Specified Position in Array", "106_program.html");
        programModelList.add(new TutorialModel("Arrays", options));


        options = new TreeMap<>();
        options.put("Frequency of Characters in a String", "20_program.html");
        options.put("Count the number of vowels, consonants", "21_program.html");
        options.put("Remove all Characters in a String Except Alphabet", "22_program.html");
        options.put("Find the Length of a String", "23_program.html");
        options.put("Concatenate Two Strings", "24_program.html");
        options.put("Copy String Without Using strcpy()", "25_program.html");
        options.put("Sort Elements in Dictionary Order", "26_program.html");
        options.put("Replace Lowercase Characters by Uppercase & Vice-Versa", "119_program.html");
        options.put("Reverse the String", "120_program.html");
        options.put("Reverse the String using Recursion", "121_program.html");
        options.put("Find the Largest & Smallest Word in a String", "122_program.html");
        options.put("Find a substring within a string", "123_program.html");
        options.put("Remove given Word from a String", "124_program.html");
        options.put("Find the Frequency of the Word ‘the’ in a given Sentence", "125_program.html");
        options.put("Compare two strings", "137_program.html");
        options.put("Convert lowercase string to uppercase", "138_program.html");
        options.put("Find total number of alphabets, digits or special characters in a string", "139_program.html");
        options.put("Trim leading white spaces from a string", "140_program.html");
        programModelList.add(new TutorialModel("Strings", options));


        options = new TreeMap<>();
        options.put("Matrix addition", "82_program.html");
        options.put("Matrix subtraction", "83_program.html");
        options.put("Matrix multiplication", "84_program.html");
        options.put("Transpose of a given Matrix", "85_program.html");
        options.put("Check if 2 Matrices are Equal", "86_program.html");
        options.put("Check if a given Matrix is a Sparse Matrix", "87_program.html");
        options.put("Check whether a matrix is an identity matrix or not", "88_program.html");
        options.put("Sum of Diagonal Elements of a Matrix", "89_program.html");
        options.put("Swap rows and columns of matrix", "90_program.html");
        options.put("Display Upper Triangular Matrix", "141_program.html");
        options.put("Display Lower Triangular Matrix", "142_program.html");
        options.put("Print a given matrix in spiral form", "143_program.html");
        options.put("Check whether entered matrix is magic square ?", "158_program.html");
        options.put("Addition of All Elements in Matrix", "159_program.html");
        programModelList.add(new TutorialModel("Matrix", options));


        options = new TreeMap<>();
        options.put("Floyd's triangle", "43_program.html");
        options.put("Fibonacci Triangle", "44_program.html");
        options.put("Alphabet Triangle", "45_program.html");
        options.put("Number Triangle", "46_program.html");
        options.put("Print half pyramid using *", "47_program.html");
        options.put("Pascal's triangle", "48_program.html");
        programModelList.add(new TutorialModel("Patterns", options));


        options = new TreeMap<>();
        options.put("Create, initialize, assign and access a pointer variable", "91_program.html");
        options.put("Swap two numbers using pointers", "92_program.html");
        options.put("Access Elements of an Array Using Pointer", "93_program.html");
        options.put("Change the value of constant integer using pointers", "94_program.html");
        options.put("Count vowels and consonants in a string using pointer", "95_program.html");
        options.put("Print sizes of different type of pointers", "96_program.html");
        options.put("Array of pointers", "97_program.html");
        options.put("Double pointer (pointer to pointer)", "98_program.html");
        options.put("Compute sum of the array elements using pointers", "146_program.html");
        options.put("Find Length of the String using Pointer", "147_program.html");
        options.put("Read integers into an array and Reversing them using Pointers", "148_program.html");
        options.put("Add Two Numbers Using Pointer", "149_program.html");
        options.put("Pointer demonstrating the use of & and *", "150_program.html");
        programModelList.add(new TutorialModel("Pointers I/O", options));


        options = new TreeMap<>();
        options.put("Program to create, declare and initialize structure", "60_program.html");
        options.put("Program to declare, initialize an union, example of union", "63_program.html");
        options.put("Store Information of a Student Using Structure", "53_program.html");
        options.put("Add Two Complex Numbers by Passing Structure to a Function", "54_program.html");
        options.put("Store Information Using Structures with DMA", "55_program.html");
        options.put("Add Two Distances (in inch-feet) System Using Structur", "56_program.html");
        options.put("Store Information of Students Using Structure", "57_program.html");
        options.put("Calculate Difference Between Two Time Periods", "58_program.html");
        options.put("Difference between union and structure", "59_program.html");
        options.put("C program to demonstrate example of Nested Structure", "61_program.html");
        options.put("Structure with pointer", "62_program.html");
        options.put("Structure of array", "64_program.html");
        programModelList.add(new TutorialModel("Structure and Union", options));


        // https://codeforwin.org/2018/04/file-handling-programming-exercises-and-solutions-in-c.html
        options = new TreeMap<>();
        options.put("Write a file", "79_program.html");
        options.put("Read string from a file", "49_program.html");
        options.put("Open a File", "50_program.html");
        options.put("Read a text file print it on the screen", "52_program.html");
        options.put("Count number of characters in the file", "78_program.html");
        options.put("Copies one file contents to another file", "80_program.html");
        options.put("Merge two files", "81_program.html");
        options.put("Program which produces its own source code as its output", "51_program.html");
        options.put("Program to append data into a file", "129_program.html");
        options.put("Program to compare two files", "130_program.html");
        options.put("Count characters, words and lines in a text file", "131_program.html");
        options.put("Remove a word from text file", "132_program.html");
        options.put("Find and replace a word in file", "133_program.html");
        options.put("Find file properties using stat() function", "134_program.html");
        options.put("Check whether a file or directory exists or not", "135_program.html");
        options.put("List all files in a directory", "136_program.html");
        programModelList.add(new TutorialModel("File I/O", options));


        options = new TreeMap<>();
        options.put("Decimal to Binary", "99_program.html");
        options.put("Binary to Decimal", "100_program.html");
        options.put("Decimal to Octal", "101_program.html");
        options.put("Octal to Decimal", "102_program.html");
        options.put("Decimal to Hexadecimal", "103_program.html");
        options.put("Hexadecimal to Decimal", "104_program.html");
        options.put("Convert from degree celsius to fahrenheit", "127_program.html");
        options.put("Convert days to years weeks and days", "128_program.html");
        programModelList.add(new TutorialModel("Conversations", options));


        options = new TreeMap<>();
        options.put("Linear Search", "107_program.html");
        options.put("Binary Search", "108_program.html");
        options.put("Bubble Sorting", "109_program.html");
        options.put("Insertion Sort", "110_program.html");
        options.put("Selection Sort", "111_program.html");
        options.put("Merge Sort", "112_program.html");
        options.put("Quick Sort", "113_program.html");
        options.put("Heap Sort", "114_program.html");
        options.put("Counting Sort", "115_program.html");
        options.put("Shell Sort", "116_program.html");
        options.put("Recursive Bubble Sort", "117_program.html");
        options.put("Bucket Sort", "118_program.html");
        programModelList.add(new TutorialModel("Sorting", options));


        options = new TreeMap<>();
        options.put("Malloc() Function", "151_program.html");
        options.put("Calloc() Function", "152_program.html");
        options.put("Realloc() and Free() Function", "153_program.html");
        programModelList.add(new TutorialModel("Memory Allocation", options));


        options = new TreeMap<>();
        options.put("C Output", "154_program.html");
        options.put("gets() and puts() functions", "155_program.html");
        options.put("getc() and putc() funcations", "156_program.html");
        options.put("getchar() and putchar() functions", "157_program.html");
        programModelList.add(new TutorialModel("Input Type", options));



        options = new TreeMap<>();
        options.put("Sum of given H.P.", "160_program.html");
        options.put("Sum of given G.P.", "161_program.html");
        options.put("Sum of given A.P.", "162_program.html");
        options.put("Sum of series 1^3 + 2^3 + …. + n^3", "163_program.html");
        options.put("Sum of the series 13 + 23 + 33 + … + n3", "164_program.html");
        options.put("Sum of series 1 + 2 + …. + n", "165_program.html");
        programModelList.add(new TutorialModel("Series", options));


        options = new TreeMap<>();
        options.put("Encrypt & Decrypt Message using Vernam Cipher", "166_program.html");
        options.put("Encrypt & Decrypt Message using Substitution Cipher", "167_program.html");
        programModelList.add(new TutorialModel("Networking", options));


        options = new TreeMap<>();
        options.put("Find power of a number", "168_program.html");
        options.put("Find gcd of a number", "169_program.html");
        options.put("Tower Of Hanoi", "170_program.html");
        options.put("Factorial Of A Number", "171_program.html");
        options.put("Print the fibonacci series", "172_program.html");
        options.put("check palindrome number", "173_program.html");
        programModelList.add(new TutorialModel("Recursion", options));


        options = new TreeMap<>();
        options.put("Program to shutdown or turn off computer", "38_program.html");
        options.put("Program to get IP address", "39_program.html");
        options.put("Calculate Area of Circle", "144_program.html");
        options.put("Print all Arguments passed using Command Line", "145_program.html");
        options.put("To check whether a string belongs to a given grammer or not", "174_program.html");
        options.put("Size of the different data types", "175_program.html");
        programModelList.add(new TutorialModel("Extras", options));

        return programModelList;
    }
}
