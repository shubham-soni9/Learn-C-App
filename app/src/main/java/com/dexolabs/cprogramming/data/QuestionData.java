package com.dexolabs.cprogramming.data;

import java.util.LinkedHashMap;

public class QuestionData {
    public static LinkedHashMap<String, String> getQuestionData() {
        LinkedHashMap<String, String> options = new LinkedHashMap<>();

        options.put("What is C language?", "C is a mid-level and procedural programming language.");

        options.put("Why is C known as a mother language?", "C is known as a mother language because most of the compilers and JVMs are written in C language.");

        options.put("Why is C called a mid-level programming language?", "It supports the feature of both low-level and high-level languages that is why it is known as a mid-level programming language.");


        options.put("Who is the founder of C language?", "Dennis Ritchie.");

        options.put("When was C language developed?", "C language was developed in 1972 at bell laboratories of AT&T.");

        options.put("What are the features of the C language?", "<p>The main features of C language are given below:</p>\n" +
                "<ul class=\"points\">\n" +
                "<li>Simple</li>\n" +
                "<li>Portable</li>\n" +
                "<li>Mid Level</li>\n" +
                "<li>Structured</li>\n" +
                "<li>Fast Speed</li>\n" +
                "<li>Memory Management</li>\n" +
                "<li>Extensible</li>\n" +
                "</ul>");

        options.put("What is the use of printf() and scanf() functions?", "The printf() function is used for output and scanf() function is used for input.\n" +
                "\n");

        options.put("What are different storage class specifiers in C?", "auto, register, static, extern");

        options.put("What is scope of a variable? How are variables scoped in C?", "Scope of a variable is the part of the program where the variable may directly be accessible. In C, all identifiers are lexically (or statically) scoped. See this for more details.");

        options.put("When should we use pointers in a C program?", "<p><br /><strong>1.</strong>&nbsp;To get address of a variable<br /><em><strong>2.</strong>&nbsp;For achieving pass by reference in C:</em>&nbsp;Pointers allow different functions to share and modify their local variables.<br /><em><strong>3.</strong>&nbsp;To pass large structures</em>&nbsp;so that complete copy of the structure can be avoided.<br />C<br /><em><strong>4.</strong>&nbsp;To implement &ldquo;linked&rdquo; data structures&nbsp;</em>like linked lists and binary trees.</p>");

        options.put("What are the key features in C programming language?", "<ul>\n" +
                "<li><strong>Portability</strong>&nbsp;&ndash; Platform independent language.</li>\n" +
                "<li><strong>Modularity</strong>&nbsp;&ndash; Possibility to break down large programs into small modules.</li>\n" +
                "<li><strong>Flexibility</strong>&nbsp;&ndash; The possibility to a programmer to control the language.</li>\n" +
                "<li><strong>Speed</strong>&nbsp;&ndash; C comes with support for system programming and hence it is compiling and executes with high speed when comparing with other high-level languages.</li>\n" +
                "<li><strong>Extensibility</strong>&nbsp;&ndash; Possibility to add new features by the programmer.</li>\n" +
                "</ul>");

        options.put("What are the basic data types associated with C?", "<ul>\n" +
                "<li><strong>Int &ndash;</strong>&nbsp;Represent number (integer)</li>\n" +
                "<li><strong>Float &ndash;</strong>&nbsp;Number with a fraction part.</li>\n" +
                "<li><strong>Double &ndash;</strong>&nbsp;Double-precision floating point value</li>\n" +
                "<li><strong>Char &ndash;</strong>&nbsp;Single character</li>\n" +
                "<li><strong>Void &ndash;</strong>&nbsp;Special purpose type without any value.</li>\n" +
                "</ul>");

        options.put("What is a pointer on pointer?", "<p>It&rsquo;s a pointer variable which can hold the address of another pointer variable. It de-refers twice to point to the data held by the designated pointer variable.</p>\n" +
                "<pre class=\"prettyprint notranslate prettyprinted\"><span class=\"typ\">Eg</span><span class=\"pun\">:</span> <span class=\"kwd\">int</span><span class=\"pln\"> x </span><span class=\"pun\">=</span> <span class=\"lit\">5</span><span class=\"pun\">,</span> <span class=\"pun\">*</span><span class=\"pln\">p</span><span class=\"pun\">=&amp;</span><span class=\"pln\">x</span><span class=\"pun\">,</span> <span class=\"pun\">**</span><span class=\"pln\">q</span><span class=\"pun\">=&amp;</span><span class=\"pln\">p</span><span class=\"pun\">;</span></pre>\n" +
                "<p>Therefore &lsquo;x&rsquo; can be accessed by **q.</p>");


        options.put("Distinguish between malloc() & calloc() memory allocation.", "Both allocates memory from heap area/dynamic memory. By default calloc fills the allocated memory with 0’s.");

        options.put("What is keyword auto for?", "By default every local variable of the function is automatic (auto). In the below function both the variables ‘i’ and ‘j’ are automatic variables.\n" +
                "\n");

        options.put("What are the valid places for the keyword break to appear.", "Break can appear only with in the looping control and switch statement. The purpose of the break is to bring the control out from the said blocks.\n" +
                "\n");


        options.put("What is NULL pointer? ", "NULL is used to indicate that the pointer doesn’t point to a valid location. Ideally, we should initialize pointers as NULL if we don’t know their value at the time of declaration. Also, we should make a pointer NULL when memory pointed by it is deallocated in the middle of a program.");

        options.put("What is Dangling pointer?", "Memory leak occurs when programmers create a memory in heap and forget to delete it. Memory leaks are particularly serious issues for programs like daemons and servers which by definition never terminate.");

        options.put("What is the description for syntax errors?", "The mistakes when creating a program called syntax errors. Misspelled commands or incorrect case commands, an incorrect number of parameters when called a method /function, data type mismatches can identify as common examples for syntax errors.");

        options.put("What is the process to create increment and decrement stamen in C?", "<p><em><strong>There are two possible methods to perform this task.</strong></em></p>\n" +
                "<p><strong>1)</strong>&nbsp;Use increment (++) and decrement (-) operator.</p>\n" +
                "<p><strong>Example</strong>&nbsp;When x=4, x++ returns 5 and x- returns 3.</p>\n" +
                "<p><strong>2)</strong>&nbsp;Use conventional + or &ndash; sign.</p>\n" +
                "<p>When x=4, use x+1 to get 5 and x-1 to get 3.</p>\n" +
                "<p>&nbsp;</p>");

        options.put("What are reserved words with a programming language?", "<p>The words that are part of the slandered&nbsp;<strong>C language</strong>&nbsp;library are called&nbsp;<strong>reserved words</strong>. Those reserved words have special meaning and it is not possible to use them for any activity other than its intended functionality.</p>\n" +
                "<p><strong>Example</strong>&nbsp;void, return, int.</p>");

        options.put("What is the explanation for the dangling pointer in C?", "When there is a pointer with pointing to a memory address of any variable, but after some time the variable was deleted from the memory location while keeping the pointer pointing to that location.");

        options.put("Describe static function with its usage?", "A function, which has a function definition prefixed with a static keyword is defined as a static function. The static function should call within the same source code.");

        options.put("What is the difference between abs() and fabs() functions?", "<p>Both functions are to retrieve absolute value. abs() is for integer values and fabs() is for floating type numbers. Prototype for abs() is under the library file &lt; stdlib.h &gt; and fabs() is under &lt; math.h &gt;.</p>");


        options.put("Describe Wild Pointers in C?", "Uninitialized pointers in the C code are known as Wild Pointers. These are a point to some arbitrary memory location and can cause bad program behavior or program crash.");

        options.put("What is the difference between ++a and a++?", "<p>&lsquo;++a&rdquo; &nbsp;is called prefixed increment and the increment will happen first on a variable. &lsquo;a++&rsquo; is called postfix increment and the increment happens after the value of a variable used for the operations.</p>");

        options.put("Describe the difference between = and == symbols in C programming?", "<p>&lsquo;==&rsquo; is the comparison operator which is use to compare the value or expression on the left-hand side with the value or expression on the right-hand side.</p>\n" +
                "<p>&lsquo;=&rsquo; is the assignment operator which is use to assign the value of the right-hand side to the variable on the left-hand side.</p>");

        options.put("What is the explanation for prototype function in C?", "<p>Prototype function is a declaration of a function with the following information to the compiler.</p>\n" +
                "<ul>\n" +
                "<li>Name of the function.</li>\n" +
                "<li>The return type of the function.</li>\n" +
                "<li>Parameters list of the function.</li>\n" +
                "</ul>\n" +
                "<p>int sum(int,int);</p>\n" +
                "<p>In this example Name of the function is Sum, the return type is integer data type and it accepts two integer parameters.</p>");

        options.put("What is the explanation for cyclic nature of data types in C?", "Some of the data types in C have special characteristic nature when a developer assign value beyond the range of the data type. There will be no any compiler error and the value change according to a cyclic order. This is called as cyclic nature and Char, int, long int data types have this property. Further float, double and long double data types do not have this property.\n" +
                "\n" +
                "This is called as cyclic nature and Char, int, long int data types have this property. Further float, double and long double data types do not have this property.");

        options.put("Describe the header file and its usage in C programming?", "<p>The file contains the definitions and prototypes of the functions being used in the program are called a header file. It is also known as a library file.</p>\n" +
                "<p><strong>Example&ndash;</strong>&nbsp;The header file contains commands like printf and scanf is the stdio.h.</p>");


        options.put("There is a practice in coding to keep some code blocks in comment symbols than delete it when debugging. How this affect when debugging?", "This concept called as commenting out and is the way to isolate some part of the code which scans possible reason for the error. Also, this concept helps to save time because if the code is not the reason for the issue it can simply uncomment.");

        options.put("What are loop types in C?", "<p><strong>There are 4 types of a loop statement in C.</strong></p>\n" +
                "<ul>\n" +
                "<li><strong>While loop</strong></li>\n" +
                "<li><strong>For Loop</strong></li>\n" +
                "<li><strong>Do&hellip;While Loop</strong></li>\n" +
                "<li><strong>Nested Loop</strong></li>\n" +
                "</ul>");

        options.put("What is a nested loop?", "<p>A loop running within another loop is referred as a<strong>&nbsp;nested loop</strong>. The first loop is called Outer loop and inside the loop is called Inner loop. Inner loop executes the number of times define an outer loop.</p>");

        options.put("What are the valid places to have keyword “Break”?", "The purpose of the Break keyword is to bring the control out of the code block which is executing. It can appear only in Looping or switch statements.");

        options.put("What is the behavioral difference when include header file in double quotes (“”) and angular braces (<>)?", "<p>When Header file include within double quotes (&ldquo;&rdquo;), compiler search first in the working directory for the particular header file. If not found then in the built in the include path. But when Header file include within angular braces (&lt;&gt;), the compiler only search in the working directory for the particular header file.</p>");

        options.put("What is a sequential access file?", "In general programs store data into files and retrieve existing data from files. With the sequential access file such data saved in a sequential pattern. When retrieving data from such files each data need to read one by one until required information find.");


        options.put("What is the method to save data in stack data structure type?", "<p>Data is stored in Stack data structure type using&nbsp;<strong>First in Last out (FILO)</strong>&nbsp;mechanism. Only top of the stack is accessible at a given instance. Storing mechanism is referred as a PUSH and retrieve is referred as a POP.</p>");

        options.put("What is the significance of C program algorithms?", "The algorithm needs to create first and it contains step by step guidelines on how the solution should create. Also, it contains the steps to consider and the required calculations/operations within the program.");

        options.put("Is it possible to use curly brackets ({}) to enclose single line code in C program?", "Yes, it is working without any error. Some programmers like to use this to organize the code. But the main purpose of curly brackets is to group several lines of codes.");

        options.put("Describe the modifier in C?", "<p>Modifier is a prefix to the basic data type which is used to indicate the modification for storage space allocation to a variable.</p>\n" +
                "<p><strong>Example&ndash;</strong>&nbsp;In 32-bit processor storage space for int data type is 4.When we use it with modifier the storage space change as follows.</p>\n" +
                "<ul>\n" +
                "<li><strong>Long int -&gt;</strong>&nbsp;Storage space is 8 bit</li>\n" +
                "<li><strong>Short int -&gt;</strong>&nbsp;Storage space is 2 bit</li>\n" +
                "</ul>");

        options.put("What are the modifiers available in C programming language?", "<p><em><strong>There are 5 modifiers available in C programming language as follows.</strong></em></p>\n" +
                "<ul>\n" +
                "<li>Short</li>\n" +
                "<li>Long</li>\n" +
                "<li>Signed</li>\n" +
                "<li>Unsigned</li>\n" +
                "<li>long long</li>\n" +
                "</ul>");

        options.put("Is that possible to store 32768 in an int data type variable?", "Int data type only capable of storing values between – 32768 to 32767.To store 32768 a modifier needs to use with int data type. Long Int can use and also if there is no any negative values unsigned int is also possible to use.");


        options.put("Is there any possibility to create customized header file with C programming language?", "It is possible and easy to create a new header file. Create a file with function prototypes that needs to use inside the program. Include the file in ‘#include’ section from its name.");

        options.put("Describe dynamic data structure in C programming language?", "Dynamic data structure is more efficient to the memory. The memory access occurs as needed by the program.");

        options.put("Is that possible to add pointers to each other?", "There is no possibility to add pointers together. Since pointer contains address details there is no way to retrieve the value from this operation.");

        options.put("What is indirection?", "If you have defined a pointer to a variable or any memory object, there is no direct reference to the value of the variable. This is called indirect reference. But when we declare a variable it has a direct reference to the value.");

        options.put("What are the ways to a null pointer can use in C programming language?", "<p><strong><em>Null pointers are possible to use in three ways.</em></strong></p>\n" +
                "<ul>\n" +
                "<li>As an error value.</li>\n" +
                "<li>As a sentinel value.</li>\n" +
                "<li>To terminate indirection in the recursive data structure.</li>\n" +
                "</ul>");

        options.put("What is the explanation for modular programming?", "The process of dividing the main program into executable subsection is called module programming. This concept promotes the reusability.");

        options.put("", "");

        options.put("", "");

        options.put("", "");

        options.put("", "");

        options.put("", "");

        options.put("", "");

        options.put("", "");

        options.put("", "");

        options.put("", "");

        options.put("", "");

        options.put("", "");

        options.put("", "");

        options.put("", "");

        options.put("", "");

        options.put("", "");

        options.put("", "");

        options.put("", "");

        options.put("", "");

        options.put("", "");

        options.put("", "");

        options.put("", "");

        options.put("", "");

        options.put("", "");

        options.put("", "");

        options.put("", "");

        options.put("", "");

        options.put("", "");

        options.put("", "");

        options.put("", "");

        options.put("", "");

        return options;
    }
}
