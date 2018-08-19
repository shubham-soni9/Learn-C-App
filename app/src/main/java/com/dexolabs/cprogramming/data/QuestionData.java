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

        options.put("What is the use of the function in C?", "A function in C language provides modularity. It can be called many times. It saves code, and we can reuse the same code many times.");

        options.put("What is the difference between call by value and call by reference in C?", "We can pass a value to function by one of the two ways: call by value or call by reference. In case of call by value, a copy of the value is passed to the function, so original value is not modified. However, in the case of call by reference, an address of value of passed to the function, so original value is modified.");

        options.put("What is recursion in C?", "Calling the same function, inside the function is known as recursion. For example:\n" +
                "\n" +
                "void function1(){  \n" +
                "function1();//calling same function  \n" +
                "}  ");

        options.put("What is an array in C?", "An Array is a group of similar types of elements. It has a contiguous memory location. It makes the code optimized, easy to traverse and easy to sort.");

        options.put("What is a pointer in C?", "A pointer is a variable that refers to the address of a value. It makes the code optimized and makes the performance fast. More details.\n" +
                "\n");

        options.put("What is the usage of the pointer in C?", "<ul class=\"points\">\n" +
                "<li>Accessing array elements</li>\n" +
                "<li>Dynamic memory allocation</li>\n" +
                "<li>Call by Reference</li>\n" +
                "<li>Data Structures like a tree, graph, linked list, etc.</li>\n" +
                "</ul>");

        options.put("What is a far pointer in C?", "A pointer which can access all the 16 segments (whole residence memory) of RAM is known as far pointer.\n" +
                "\n");

        options.put("What is static memory allocation?", "In case of static memory allocation, memory is allocated at compile time, and memory can't be increased while executing the program. It is used in the array.");

        options.put("What is dynamic memory allocation?", "In case of dynamic memory allocation, memory is allocated at runtime and memory can be increased while executing the program. It is used in the linked list.");

        options.put("What functions are used for dynamic memory allocation in C language?", "<ul class=\"points\">\n" +
                "<li>malloc()</li>\n" +
                "<li>calloc()</li>\n" +
                "<li>realloc()</li>\n" +
                "<li>free()</li>\n" +
                "</ul>");

        options.put("What is the difference between malloc() and calloc()?", "<ul class=\"points\">\n" +
                "<li>\n" +
                "<p><strong>malloc()</strong>: The malloc() function allocates a single block of requested memory. It has garbage value initially.</p>\n" +
                "<p><strong>calloc()</strong>: The calloc() function allocates multiple blocks of requested memory. It initially initializes all bytes to zero.</p>\n" +
                "</li>\n" +
                "</ul>");

        options.put("What is the structure?", "The Structure is a user-defined data type that allows storing multiple types of data in a single unit. It occupies the sum of the memory of all members.");

        options.put("What is a union?", "Like Structure, the union is a user-defined data type that allows storing multiple types of data in a single unit. However, it doesn't occupy the sum of the memory of all members. It occupies the memory of largest member only.");

        options.put("What is the purpose of sprintf() function?", "It is used to print the formatted output into a char array.\n" +
                "\n");

        options.put("What is a token?", "The Token is an identifier. It can be constant, keyword, string literal, etc.\n" +
                "\n");

        options.put("What is the acronym for ANSI?", "American National Standard Institute.\n" +
                "\n");

        options.put("What is the difference between getch() and getche()?", "<ul class=\"points\">\n" +
                "<li>\n" +
                "<p>The&nbsp;<strong>getch()</strong>&nbsp;function reads a single character from the keyboard. It doesn't use any buffer, so entered data will not be displayed on the output screen.</p>\n" +
                "<p>The&nbsp;<strong>getche()</strong>&nbsp;function reads a single character from the keyword, but data is displayed on the output screen. Press Alt+f5 to see the entered character.</p>\n" +
                "</li>\n" +
                "</ul>");

        options.put("What is the newline escape sequence?", "The new line escape sequence is represented by \"\\n\". It inserts a new line on the output screen.\n" +
                "\n");

        options.put("Who is the main contributor in designing the C language after Dennis Ritchie?", "Brain Kernighan.\n" +
                "\n");

        options.put("What is the difference between near, far and huge pointers?", "<ul class=\"points\">\n" +
                "<li>\n" +
                "<p>A virtual address is composed of the&nbsp;<em>selector</em>&nbsp;and&nbsp;<em>offset</em>.</p>\n" +
                "<p>A&nbsp;<strong>near</strong>&nbsp;pointer doesn't have explicit selector whereas&nbsp;<strong>far, and huge</strong>&nbsp;pointers have explicit selector. When you perform pointer arithmetic on the far pointer, the selector is not modified, but in case of a huge pointer, it can be modified.</p>\n" +
                "<p>These are the non-standard keywords and implementation specific. These are irrelevant in a modern platform.</p>\n" +
                "</li>\n" +
                "</ul>");

        options.put("What is the maximum length of an identifier?", "It is 32 characters ideally but implementation specific.\n" +
                "\n");

        options.put("What is typecasting?", "Converting one data type into another is known as typecasting.");

        options.put("What are the functions to open and close the file in C language?", "The fopen() function is used to open file whereas fclose() is used to close file.\n" +
                "\n");

        options.put("Can we access the array using a pointer in C language?", "Yes, by holding the base address of array into a pointer, we can access the array using a pointer.\n" +
                "\n");

        options.put("What is an infinite loop?", "A loop running continuously for an indefinite number of times is called the infinite loop.\n" +
                "\n");

        options.put("How a negative integer is stored.?", "<ul class=\"points\">\n" +
                "<li>\n" +
                "<p>Get the two&rsquo;s compliment of the same positive integer. Eg: 1011 (-5)</p>\n" +
                "<p><strong>Step-1</strong>&nbsp;&minus; One&rsquo;s compliment of 5 : 1010</p>\n" +
                "<p><strong>Step-2</strong>&nbsp;&minus; Add 1 to above, giving 1011, which is -5</p>\n" +
                "</li>\n" +
                "</ul>");

        options.put("What is the meaning of base address of the array?", "The starting address of the array is called as the base address of the array.\n" +
                "\n");

        options.put("When should we use the register storage specifier?", "If a variable is used most frequently then it should be declared using register storage specifier, then possibly the compiler gives CPU register for its storage to speed up the look up of the variable.\n" +
                "\n");

        options.put("S++ or S = S+1, which can be recommended to increment the value by 1 and why?", "S++, as it is single machine instruction (INC) internally.\n" +
                "\n");

        options.put("What is the purpose of the keyword typedef?", "It is used to alias the existing type. Also used to simplify the complex declaration of the type.\n" +
                "\n");

        options.put("What is lvalue and rvalue?", "The expression appearing on right side of the assignment operator is called as rvalue. Rvalue is assigned to lvalue, which appears on left side of the assignment operator. The lvalue should designate to a variable not a constant.\n" +
                "\n");

        options.put("What is the difference between actual and formal parameters?", "The parameters sent to the function at calling end are called as actual parameters while at the receiving of the function definition called as formal parameters.\n" +
                "\n");

        options.put("Can a program be compiled without main() function?", "Yes, it can be but cannot be executed, as the execution requires main() function definition.\n" +
                "\n");

        options.put("What is the advantage of declaring void pointers?", "When we do not know what type of the memory address the pointer variable is going to hold, then we declare a void pointer for such.\n" +
                "\n");

        options.put("Where an automatic variable is stored?", "Every local variable by default being an auto variable is stored in stack memory.\n" +
                "\n");

        options.put("What is a nested structure?", "A structure containing an element of another structure as its member is referred so.\n" +
                "\n");

        options.put("What is the difference between variable declaration and variable definition?", "Declaration associates type to the variable whereas definition gives the value to the variable.\n" +
                "\n");

        options.put("What is a self-referential structure?", "A structure containing the same structure pointer variable as its element is called as self-referential structure.\n" +
                "\n");

        options.put("Does a built-in header file contains built-in function definition?", "No, the header file only declares function. The definition is in library which is linked by the linker.\n" +
                "\n");

        options.put("Explain modular programming.", "Dividing the program in to sub programs (modules/function) to achieve the given task is modular approach. More generic functions definition gives the ability to re-use the functions, such as built-in library functions.\n" +
                "\n");

        options.put("What is a preprocessor?", "Preprocessor is a directive to the compiler to perform certain things before the actual compilation process begins.\n" +
                "\n");

        options.put("Explain the use of %i format specifier w.r.t scanf().", "Can be used to input integer in all the supported format.\n" +
                "\n");

        options.put("How can you print a \\ (backslash) using any of the printf() family of functions.", "Escape it using \\ (backslash).\n" +
                "\n");

        options.put("Does a break is required by default case in switch statement?", "Yes, if it is not appearing as the last case and if we do not want the control to flow to the following case after default if any.\n" +
                "\n");

        options.put("When to user -> (arrow) operator.", "If the structure/union variable is a pointer variable, to access structure/union elements the arrow operator is used.\n" +
                "\n");

        options.put("What are bit fields?", "We can create integer structure members of differing size apart from non-standard size using bit fields. Such structure size is automatically adjusted with the multiple of integer size of the machine.\n" +
                "\n");

        options.put("What are command line arguments?", "The arguments which we pass to the main() function while executing the program are called as command line arguments. The parameters are always strings held in the second argument (below in args) of the function which is array of character pointers. First argument represents the count of arguments (below in count) and updated automatically by operating system.\n" +
                "\n");

        options.put("What are the different ways of passing parameters to the functions? Which to use when?", "<ul class=\"points\">\n" +
                "<li>\n" +
                "<ul class=\"list\">\n" +
                "<li>\n" +
                "<p><strong>Call by value</strong>&nbsp;&minus; We send only values to the function as parameters. We choose this if we do not want the actual parameters to be modified with formal parameters but just used.</p>\n" +
                "</li>\n" +
                "<li>\n" +
                "<p><strong>Call by reference</strong>&nbsp;&minus; We send address of the actual parameters instead of values. We choose this if we do want the actual parameters to be modified with formal parameters.</p>\n" +
                "</li>\n" +
                "</ul>\n" +
                "</li>\n" +
                "</ul>");

        options.put("What is the purpose of built-in stricmp() function.\n", "It compares two strings by ignoring the case.\n" +
                "\n");

        options.put("Describe the file opening mode “w+”.", "Opens a file both for reading and writing. If a file is not existing it creates one, else if the file is existing it will be over written.\n" +
                "\n");

        options.put("Where the address of operator (&) cannot be used?", "It cannot be used on constants.\n" +
                "\n" +
                "It cannot be used on variable which are declared using register storage class.");

        options.put("Is FILE a built-in data type?", "No, it is a structure defined in stdio.h.\n" +
                "\n");

        options.put("What is reminder for 5.0 % 2?", "Error, It is invalid that either of the operands for the modulus operator (%) is a real number.\n" +
                "\n");

        options.put("How many operators are there under the category of ternary operators?", "There is only one operator and is conditional operator (? : ).\n" +
                "\n");

        options.put("Which key word is used to perform unconditional branching?", "goto\n" +
                "\n");

        options.put("What is a pointer to a function? Give the general syntax for the same.", "A pointer holding the reference of the function is called pointer to a function. In general it is declared as follows.\n" +
                "\n");

        options.put("Explain the use of comma operator (,).", "Comma operator can be used to separate two or more expressions.\n" +
                "\n" +
                "Eg: printf(“hi”) , printf(“Hello”);");

        options.put("What is a NULL statement?", "A null statement is no executable statements such as ; (semicolon).\n" +
                "\n");

        options.put("What is a static function?", "A function’s definition prefixed with static keyword is called as a static function. You would make a function static if it should be called only within the same source code.\n" +
                "\n");

        options.put("Which compiler switch to be used for compiling the programs using math library with gcc compiler?", "<section class=\"toggle active\">\n" +
                "<div class=\"toggle-content\">\n" +
                "<p>Opiton &ndash;lm to be used as &gt; gcc &ndash;lm &lt;file.c&gt;</p>\n" +
                "</div>\n" +
                "</section>\n" +
                "<section class=\"toggle\"></section>");

        options.put("Which operator is used to continue the definition of macro in the next line?", "Backward slash (\\) is used.\n" +
                "\n");

        options.put("Which operator is used to receive the variable number of arguments for a function?", "Ellipses (…) is used for the same. A general function definition looks as follows\n" +
                "\n");

        options.put("Which built-in library function can be used to re-size the allocated dynamic memory?", "realloc().\n" +
                "\n");

        options.put("Define an array.\n", "Array is collection of similar data items under a common name.\n" +
                "\n");

        options.put("What are enumerations?", "Enumerations are list of integer constants with name. Enumerators are defined with the keyword enum.\n" +
                "\n");

        options.put("Which built-in function can be used to move the file pointer internally?", "fseek()\n" +
                "\n");

        options.put("What is a variable?", "A variable is the name storage.\n" +
                "\n");

        options.put("C is successor of which programming language?", "B\n" +
                "\n");

        options.put("Which operator can be used to determine the size of a data type or variable?", "sizeof\n" +
                "\n");

        options.put("Can we assign a float variable to a long integer variable?", "Yes, with loss of fractional part.\n" +
                "\n");

        options.put("What it the return value of a relational operator if it returns any?", "Return a value 1 if the relation between the expressions is true, else 0.\n" +
                "\n");

        options.put("How does bitwise operator XOR works.\n", "If both the corresponding bits are same it gives 0 else 1.\n" +
                "\n");

        options.put("What is an infinite loop?", "A loop executing repeatedly as the loop-expression always evaluates to true such as\n" +
                "\n");

        options.put("What is the default value of local and global variables?", "Local variables get garbage value and global variables get a value 0 by default.\n" +
                "\n");

        options.put("Can a pointer access the array?", "Pointer by holding array’s base address can access the array.\n" +
                "\n");

        options.put("What are valid operations on pointers?", "\n" +
                "The only two permitted operations on pointers are\n" +
                "\n" +
                "Comparision ii) Addition/Substraction (excluding void pointers)");

        options.put("What is a string length?", "It is the count of character excluding the ‘\\0’ character.\n" +
                "\n");

        options.put("What is the built-in function to append one string to another?", "strcat() form the header string.h\n" +
                "\n");

        options.put("Which operator can be used to access union elements if union variable is a pointer variable?", "Arrow (->) operator.\n" +
                "\n");

        options.put("Explain about ‘stdin’.", "stdin in a pointer variable which is by default opened for standard input device.\n" +
                "\n");

        options.put("Name a function which can be used to close the file stream.\n", "fclose().\n" +
                "\n");

        options.put("What is the purpose of #undef preprocessor?", "It be used to undefine an existing macro definition.\n" +
                "\n");

        options.put("Name the predefined macro which be used to determine whether your compiler is ANSI standard or not?", "__STDC__\n" +
                "\n");

        options.put("What is typecasting?", "Typecasting is a way to convert a variable/constant from one type to another type.\n" +
                "\n");

        options.put("Which function can be used to release the dynamic allocated memory?", "free().\n" +
                "\n");

        options.put("What is the first string in the argument vector w.r.t command line arguments?", "Program name.\n" +
                "\n");

        options.put("How can we determine whether a file is successfully opened or not using fopen() function?", "On failure fopen() returns NULL, otherwise opened successfully.\n" +
                "\n");

        options.put("What is the output file generated by the linker.", "Linker generates the executable file.\n" +
                "\n");

        options.put("What is the maximum length of an identifier?", "Ideally it is 32 characters and also implementation dependent.\n" +
                "\n");

        options.put("What is the default function call method?", "By default the functions are called by value.\n" +
                "\n");

        options.put("Functions must and should be declared. Comment on this.", "Function declaration is optional if the same is invoked after its definition.\n" +
                "\n");

        options.put("When the macros gets expanded?", "At the time of preprocessing.\n" +
                "\n");

        options.put("Can a function return multiple values to the caller using return reserved word?", "No, only one value can be returned to the caller.\n" +
                "\n");

        options.put("What is a constant pointer?", "A pointer which is not allowed to be altered to hold another address after it is holding one.\n" +
                "\n");

        options.put("To make pointer generic for which date type it need to be declared?", "Void\n" +
                "\n");

        options.put("Can the structure variable be initialized as soon as it is declared?", "Yes, w.r.t the order of structure elements only.\n" +
                "\n");

        options.put("Is there a way to compare two structure variables?", "There is no such. We need to compare element by element of the structure variables.\n" +
                "\n");

        options.put("Which built-in library function can be used to match a patter from the string?", "Strstr()\n" +
                "\n");

        options.put("What is difference between far and near pointers?", "In first place they are non-standard keywords. A near pointer can access only 2^15 memory space and far pointer can access 2^32 memory space. Both the keywords are implementation specific and are non-standard.\n" +
                "\n");

        options.put("Can we nest comments in a C code?", "No, we cannot.\n" +
                "\n");

        options.put("Which control loop is recommended if you have to execute set of statements for fixed number of times?", "for – Loop.\n");

        options.put("What is a constant?", "A value which cannot be modified is called so. Such variables are qualified with the keyword const.\n" +
                "\n");

        options.put("Can we use just the tag name of structures to declare the variables for the same?", "No, we need to use both the keyword ‘struct’ and the tag name.\n" +
                "\n");

        options.put("Can the main() function left empty?", "Yes, possibly the program doing nothing.\n" +
                "\n");

        options.put("Can one function call another?", "Yes, any user defined function can call any function.\n" +
                "\n");

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
