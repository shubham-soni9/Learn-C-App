package com.dexolabs.cprogramming.data;

import com.dexolabs.cprogramming.model.Question;
import com.dexolabs.cprogramming.utility.Utils;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class QuizData {

    public static LinkedHashMap<String, ArrayList<Question>> getQuizData() {
        LinkedHashMap<String, ArrayList<Question>> options;
        ArrayList<Question> questionList = new ArrayList<>();
        options = new LinkedHashMap<>();

        questionList.add(getQuestion(1, "Which of the following is not a valid variable name declaration?", "int _a4;", "int 4_a;", "int _4a", "int a_4;", 2, "Variable name cannot start with a digit."));
        questionList.add(getQuestion(2, "Which of the following statements should be used to obtain a remainder after dividing 4.15 by 3.1 ?", "rem = modf(4.15, 3.1);", "rem = fmod(4.15, 3.1);", "Remainder cannot be obtain in floating point division.", "rem = modf(4.15, 3.1);", 2, "fmod(x,y) - Calculates x modulo y, the remainder of x/y. \n" +
                "This function is the same as the modulus operator. But fmod() performs floating point divisions."));

        questionList.add(getQuestion(3, "Why do variable names beginning with the underscore is not encouraged?", "To avoid conflicts since assemblers and loaders use such names\n", "To avoid conflicts since library routines use such names", "To avoid conflicts with environment variables of an operating system", "It is not standardized", 2, ""));
        questionList.add(getQuestion(4, "Which of the following is not a valid C variable name?", "int variable_count;", "int number;", "float rate;", "int $main;", 4, "Since only underscore and no other special character is allowed in a variable name, it results in an error."));
        questionList.add(getQuestion(5, "Which of the following cannot be a variable name in C?", "volatile", "true", "friend", "export", 1, "volatile is C keyword."));
        questionList.add(getQuestion(6, "What are the types of linkages?", "External, Internal and None", "Internal", "External and None", "Internal and External", 1, "External Linkage-> means global, non-static variables and functions.\n" +
                "Internal Linkage-> means static variables and functions with file scope.\n" +
                "None Linkage-> means Local variables."));
        questionList.add(getQuestion(7, "How would you round off a value from 1.42 to 2.0?", "roundup(1.42)", "floor(1.42)", "ceil(1.42)", "roundto(1.42)", 3, ""));
        questionList.add(getQuestion(8, "When we mention the prototype of a function?", "Defining", "Declaring", "Prototyping", "Calling", 2, "A function prototype in C or C++ is a declaration of a function that omits the function body but does specify the function's name, argument types and return type."));
        questionList.add(getQuestion(9, "Which is valid C expression?", "int my_num = 100,000;", "int my num = 1000;", "int $my_num = 10000;", "int my_num = 100000;", 4, "Space, comma and $ cannot be used in a variable name."));
        questionList.add(getQuestion(10, "By default a real number is treated as a", "double", "float", "long double", "far double", 1, ""));
        options.put("Variable Names - 1", questionList);


        questionList = new ArrayList<>();
        questionList.add(getQuestion(11, "In the following program where is the variable a getting defined and where it is getting declared?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include&lt;stdio.h&gt;</span>\n" +
                "<span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "{\n" +
                "    <span style=\"color: #008000; font-weight: bold\">extern</span> <span style=\"color: #B00040\">int</span> a;\n" +
                "    printf(<span style=\"color: #BA2121\">&quot;%d</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>, a);\n" +
                "    <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                "}\n" +
                "<span style=\"color: #B00040\">int</span> a<span style=\"color: #666666\">=20</span>;\n" +
                "</pre></div>\n", "\textern int a is declaration, int a = 20 is the definition", "int a = 20 is declaration, extern int a is the definition", "int a = 20 is definition, a is not defined", "a is declared, a is not defined", 1, "- During declaration we tell the datatype of the Variable.\n" +
                                             "\n" +
                                             "- During definition the value is initialized."));

        questionList.add(getQuestion(12, "Comment on the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"> <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> ThisIsVariableName <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">20</span>;\n" +
                "        <span style=\"color: #B00040\">int</span> ThisIsVariablename <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">25</span>;\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%d&quot;</span>, ThisIsVariablename);\n" +
                "        <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                "    }\n" +
                "</pre></div>\n", "The program will print 20", "The program will print 25", "The program will cause a compile-time error due to redeclaration", "The program will have a runtime error", 2, "Variable names ThisIsVariablename and ThisIsVariableName are both distinct as C is case sensitive."));

        questionList.add(getQuestion(13, "What will happen if the below program is executed?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"> <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> main <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">25</span>;\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%d&quot;</span>, main);\n" +
                "        <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                "    }\n" +
                "</pre></div>\n", "It will run without any error and prints 25", "It will cause a run-time error", "It will experience infinite looping", "It will cause a compile-time error", 1, "C program can have same function name and same variable name."));

        questionList.add(getQuestion(14,
                                     "What is the output of the program given below ?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include&lt;stdio.h&gt;</span>\n" +
                                             "<span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                                             "{\n" +
                                             "    <span style=\"color: #008000; font-weight: bold\">enum</span> status { pass, fail, atkt};\n" +
                                             "    <span style=\"color: #008000; font-weight: bold\">enum</span> status stud1, stud2, stud3;\n" +
                                             "    stud1 <span style=\"color: #666666\">=</span> pass;\n" +
                                             "    stud2 <span style=\"color: #666666\">=</span> atkt;\n" +
                                             "    stud3 <span style=\"color: #666666\">=</span> fail;\n" +
                                             "    printf(<span style=\"color: #BA2121\">&quot;%d, %d, %d</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>, stud1, stud2, stud3);\n" +
                                             "    <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                                             "}\n" +
                                             "</pre></div>\n", "1, 3, 2", "0, 1, 2", "1, 2, 3", "0, 2, 1", 4, "<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #008000; font-weight: bold\">enum</span> takes the format like {<span style=\"color: #666666\">0</span>,<span style=\"color: #666666\">1</span>,<span style=\"color: #666666\">2.</span>.) so pass<span style=\"color: #666666\">=0</span>, fail<span style=\"color: #666666\">=1</span>, atkt<span style=\"color: #666666\">=2</span>\n" +
                                             "\n" +
                                             "stud1 <span style=\"color: #666666\">=</span> pass (value is <span style=\"color: #666666\">0</span>)\n" +
                                             "\n" +
                                             "stud2 <span style=\"color: #666666\">=</span> atkt (value is <span style=\"color: #666666\">2</span>)\n" +
                                             "\n" +
                                             "stud3 <span style=\"color: #666666\">=</span> fail (value is <span style=\"color: #666666\">1</span>)\n" +
                                             "\n" +
                                             "Hence it prints <span style=\"color: #666666\">0</span>, <span style=\"color: #666666\">2</span>, <span style=\"color: #666666\">1</span>\n" +
                                             "</pre></div>\n"));

        questionList.add(getQuestion(15, "What is the output of the program\n" +
                "<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include&lt;stdio.h&gt;</span>\n" +
                "<span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "{\n" +
                "    <span style=\"color: #008000; font-weight: bold\">struct</span> emp\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">char</span> name[<span style=\"color: #666666\">20</span>];\n" +
                "        <span style=\"color: #B00040\">int</span> age;\n" +
                "        <span style=\"color: #B00040\">float</span> sal;\n" +
                "    };\n" +
                "    <span style=\"color: #008000; font-weight: bold\">struct</span> emp e <span style=\"color: #666666\">=</span> {<span style=\"color: #BA2121\">&quot;Apple&quot;</span>};\n" +
                "    printf(<span style=\"color: #BA2121\">&quot;%d, %f</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>, e.age, e.sal);\n" +
                "    <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                "}\n" +
                "</pre></div>\n", "Garbage values", "Error", "0, 0.000000", "None of above", 3, "When an automatic structure is partially initialized remaining elements are initialized to 0(zero)."));

        questionList.add(getQuestion(16, "What is the output of the program\n" +
                "<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include&lt;stdio.h&gt;</span>\n" +
                "<span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "{\n" +
                "    <span style=\"color: #B00040\">int</span> x <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">8</span>, y <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">17</span>, z <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">6</span>, i;\n" +
                "    i <span style=\"color: #666666\">=</span> x <span style=\"color: #666666\">&lt;</span> y <span style=\"color: #666666\">&lt;</span> z;\n" +
                "    printf(<span style=\"color: #BA2121\">&quot;%d</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>, i);\n" +
                "    <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                "}\n" +
                "</pre></div>\n", "1", "0", "Error", "None of these", 1, "Since x < y turns to be TRUE it is replaced by 1. Then 1 < z is compared and to be TRUE. The 1 is assigned to i."));

        questionList.add(getQuestion(17,
                                     "What will be the output of the program?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include&lt;stdio.h&gt;</span>\n" +
                                             "<span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                                             "{\n" +
                                             "    <span style=\"color: #B00040\">int</span> X<span style=\"color: #666666\">=60</span>;\n" +
                                             "    {\n" +
                                             "        <span style=\"color: #B00040\">int</span> X<span style=\"color: #666666\">=35</span>;\n" +
                                             "        printf(<span style=\"color: #BA2121\">&quot;%d &quot;</span>, X);\n" +
                                             "    }\n" +
                                             "    printf(<span style=\"color: #BA2121\">&quot;%d</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>, X);\n" +
                                             "    <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                                             "}\n" +
                                             "</pre></div>\n", "60 60", "60", "35 60", "35 35", 3, "In case of a conflict between a local variable and global variable, the local variable gets priority."));

        questionList.add(getQuestion(18, "Comment on the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include &lt;stdio.h&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">float</span> f1 <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">0.3</span>;\n" +
                "        <span style=\"color: #008000; font-weight: bold\">if</span> (f1 <span style=\"color: #666666\">==</span> <span style=\"color: #666666\">0.3</span>)\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;equal</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>);\n" +
                "        <span style=\"color: #008000; font-weight: bold\">else</span>\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;not equal</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>);\n" +
                "    }\n" +
                "</pre></div>\n", "not equal", "equal", "output depends on the compiler", "none of the mentioned", 1, "by default type is double"));

        questionList.add(getQuestion(19, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include &lt;stdio.h&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "    {\n" +
                "        <span style=\"color: #008000; font-weight: bold\">enum</span> {ORANGE <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">5</span>, BANANA, APPLE <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">4</span>, MANGO};\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;MANGO = %d</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>, MANGO);\n" +
                "    }\n" +
                "</pre></div>\n", "MANGO = 3", "MANGO = 5", "MANGO = 6", "MANGO = 4", 2, "In enum, the value of constant is defined to the recent assignment from left."));

        questionList.add(getQuestion(20, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"> <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> var <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">011</span>;\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%d&quot;</span>, var);\n" +
                "    }\n" +
                "</pre></div>\n", "2", "10", "8", "9", 4, "011 is octal representation of 9."));

        options.put("Variable Names - 2", questionList);


        questionList = new ArrayList<>();
        questionList.add(getQuestion(21, "Which of the following correctly shows the hierarchy of arithmetic operations in C?\n" +
                "\n", "/ + * -", "+ - / *", "* - / +", "/ * + -", 4, "<div id=\"divAnswer_118\" class=\"bix-div-answer mx-none\">\n" +
                                             "<div class=\"bix-ans-description\">" +
                                             "<p>Simply called as BODMAS (Bracket of Division, Multiplication, Addition and Subtraction).</p>\n" +
                                             "<p>How Do I Remember ? BODMAS !</p>\n" +
                                             "<p>&nbsp;</p>" +
                                             "<ul>" +
                                             "<li><strong>B</strong>&nbsp;- Brackets first</li>\n" +
                                             "<li><strong>O</strong>&nbsp;- Orders (ie Powers and Square Roots, etc.)</li>\n" +
                                             "<li><strong>DM</strong>&nbsp;- Division and Multiplication (left-to-right)</li>\n" +
                                             "<li><strong>AS</strong>&nbsp;- Addition and Subtraction (left-to-right)</li>\n" +
                                             "</ul>" +
                                             "<p>&nbsp;</p>" +
                                             "</div>" +
                                             "</div>"));

        questionList.add(getQuestion(22, "In which order do the following gets evaluated\n1.\tRelational\n" +
                "2.\tArithmetic\n" +
                "3.\tLogical\n" +
                "4.\tAssignment\n", "2134", "1234", "4321", "3214", 1, "<p>2. Arithmetic operators:&nbsp;<em class=\"C-code\">*, /, %, +, -&nbsp;</em><br />1. Relational operators:&nbsp;<em class=\"C-code\">&gt;, &lt;, &gt;=, &lt;=, ==, !=</em><br />3. Logical operators :&nbsp;<em class=\"C-code\">!, &amp;&amp;, ||</em><br />4. Assignment operators:&nbsp;<em class=\"C-code\">=</em></p>"));

        questionList.add(getQuestion(23, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"> <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> i <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">-3</span>;\n" +
                "        <span style=\"color: #B00040\">int</span> k <span style=\"color: #666666\">=</span> i <span style=\"color: #666666\">%</span> <span style=\"color: #666666\">2</span>;\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%d</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>, k);\n" +
                "    }\n" +
                "</pre></div>\n", "Compile time error", "-1", "1", "Implementation defined", 2, ""));

        questionList.add(getQuestion(24, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"> <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> i <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">3</span>;\n" +
                "        <span style=\"color: #B00040\">int</span> l <span style=\"color: #666666\">=</span> i <span style=\"color: #666666\">/</span> <span style=\"color: #666666\">-2</span>;\n" +
                "        <span style=\"color: #B00040\">int</span> k <span style=\"color: #666666\">=</span> i <span style=\"color: #666666\">%</span> <span style=\"color: #666666\">-2</span>;\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%d %d</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>, l, k);\n" +
                "        <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                "    }\n" +
                "</pre></div>\n", "1 -1", "Compile time error", "Implementation defined", "-1 1", 4, ""));

        questionList.add(getQuestion(25, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"> <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> i <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">-6</span>;\n" +
                "        i <span style=\"color: #666666\">=</span> i <span style=\"color: #666666\">/</span> <span style=\"color: #666666\">3</span>;\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%d</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>, i);\n" +
                "        <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                "    }\n" +
                "</pre></div>\n", "-2", "Implementation defined", "Compile time error", "-3", 1, ""));

        questionList.add(getQuestion(26, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">  <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">void</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> x <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">1</span>, y <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">0</span>, z <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">5</span>;\n" +
                "        <span style=\"color: #B00040\">int</span> a <span style=\"color: #666666\">=</span> x <span style=\"color: #666666\">&amp;&amp;</span> y <span style=\"color: #666666\">||</span> z<span style=\"color: #666666\">++</span>;\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%d&quot;</span>, z);\n" +
                "    }\n" +
                "</pre></div>\n", "0", "5", "6", "Varies", 3, ""));

        questionList.add(getQuestion(27, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include &lt;stdio.h&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> x <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">2</span>, y <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">0</span>, z <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">4</span>;\n" +
                "        x <span style=\"color: #666666\">&gt;</span> y <span style=\"color: #666666\">?</span> printf(<span style=\"color: #BA2121\">&quot;%d&quot;</span>, z) <span style=\"color: #666666\">:</span> <span style=\"color: #008000; font-weight: bold\">return</span> z;\n" +
                "    }\n" +
                "</pre></div>\n", "4", "2", "Compile time error", "Run time error", 3, ""));

        questionList.add(getQuestion(28, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"> <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">void</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> x <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">1</span>, z <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">3</span>;\n" +
                "        <span style=\"color: #B00040\">int</span> y <span style=\"color: #666666\">=</span> x <span style=\"color: #666666\">&lt;&lt;</span> <span style=\"color: #666666\">3</span>;\n" +
                "        printf(<span style=\"color: #BA2121\">&quot; %d</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>, y);\n" +
                "    }\n" +
                "</pre></div>\n", "-2147483648", "Run time error", "8", "-1", 3, ""));

        questionList.add(getQuestion(29, "What is the final value of j in the below code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include &lt;stdio.h&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> i <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">0</span>, j <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">0</span>;\n" +
                "        <span style=\"color: #008000; font-weight: bold\">if</span> (i <span style=\"color: #666666\">&amp;&amp;</span> (j <span style=\"color: #666666\">=</span> i <span style=\"color: #666666\">+</span> <span style=\"color: #666666\">15</span>))\n" +
                "            <span style=\"color: #408080; font-style: italic\">//do something</span>\n" +
                "            ;\n" +
                "    }\n" +
                "</pre></div>\n", "15", "0", "Depends on the compiler", "Depends on language standard", 2, ""));

        questionList.add(getQuestion(30, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include &lt;stdio.h&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> i <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">0</span>, j <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">0</span>;\n" +
                "        <span style=\"color: #008000; font-weight: bold\">if</span> (i <span style=\"color: #666666\">&amp;&amp;</span> (j <span style=\"color: #666666\">=</span> i <span style=\"color: #666666\">+</span> <span style=\"color: #666666\">15</span>))\n" +
                "            <span style=\"color: #408080; font-style: italic\">//do something</span>\n" +
                "            ;\n" +
                "    }\n" +
                "</pre></div>\n", "No", "Depends on the compiler", "Yes", "Depends on the standard", 1, ""));

        options.put("Operators – 1", questionList);


        questionList = new ArrayList<>();
        questionList.add(getQuestion(31, "Which of the following is the correct usage of conditional operators used in C?", "a>b ? c=30;", "a>b ? c=30 : c=40;", "max = a>b ? a>c?a:c:b>c?b:c", "return (a>b)?(a:b)", 3, ""));

        questionList.add(getQuestion(32, "What will be the output of the program?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include&lt;stdio.h&gt;</span>\n" +
                "<span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "{\n" +
                "    <span style=\"color: #B00040\">int</span> i<span style=\"color: #666666\">=-3</span>, j<span style=\"color: #666666\">=2</span>, k<span style=\"color: #666666\">=0</span>, m;\n" +
                "    m <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">++</span>i <span style=\"color: #666666\">&amp;&amp;</span> <span style=\"color: #666666\">++</span>j <span style=\"color: #666666\">&amp;&amp;</span> <span style=\"color: #666666\">++</span>k;\n" +
                "    printf(<span style=\"color: #BA2121\">&quot;%d, %d, %d, %d</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>, i, j, k, m);\n" +
                "    <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                "}\n" +
                "</pre></div>\n", "2, 3, 1, 2", "1, 2, 3, 1", "3, 3, 1, 2", "-2, 3, 1, 1", 4, ""));

        questionList.add(getQuestion(33, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"> <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> a <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">10</span>, b <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">10</span>;\n" +
                "        <span style=\"color: #008000; font-weight: bold\">if</span> (a <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">5</span>)\n" +
                "        b<span style=\"color: #666666\">--</span>;\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%d, %d&quot;</span>, a, b<span style=\"color: #666666\">--</span>);\n" +
                "    }\n" +
                "</pre></div>\n", "a = 10, b = 8", "a = 5, b = 9", "a = 5, b = 8", "a = 10, b = 9", 2, ""));

        questionList.add(getQuestion(34, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include &lt;stdio.h&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> i <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">0</span>;\n" +
                "        <span style=\"color: #B00040\">int</span> j <span style=\"color: #666666\">=</span> i<span style=\"color: #666666\">++</span> <span style=\"color: #666666\">+</span> i;\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%d</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>, j);\n" +
                "    }\n" +
                "</pre></div>\n", "2", "0", "1", "Compile time error", 2, ""));

        questionList.add(getQuestion(35, " What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"> <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> i <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">10</span>;\n" +
                "        <span style=\"color: #B00040\">int</span> <span style=\"color: #666666\">*</span>p <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">&amp;</span>i;\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%d</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>, <span style=\"color: #666666\">*</span>p<span style=\"color: #666666\">++</span>);\n" +
                "    }\n" +
                "</pre></div>\n", "11", "10", "Garbage value", "Address of i", 2, ""));

        questionList.add(getQuestion(36, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"> <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">void</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> x <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">99</span>;\n" +
                "        <span style=\"color: #B00040\">int</span> y <span style=\"color: #666666\">=</span> <span style=\"color: #008000; font-weight: bold\">sizeof</span>(x<span style=\"color: #666666\">++</span>);\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;X is %d&quot;</span>, x);\n" +
                "    }\n" +
                "</pre></div>\n", "X is 97", "X is 98", "X is 99", "Run time error", 3, ""));

        questionList.add(getQuestion(37, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"> <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">void</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> x <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">4</span>, y, z;\n" +
                "        y <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">--</span>x;\n" +
                "        z <span style=\"color: #666666\">=</span> x<span style=\"color: #666666\">--</span>;\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%d%d%d&quot;</span>, x,  y, z);\n" +
                "    }\n" +
                "</pre></div>\n", "3 2 3", "2 3 3", "3 2 2", "2 3 4", 2, ""));

        questionList.add(getQuestion(38, "Assuming, integer is 2 byte, What will be the output of the program?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include&lt;stdio.h&gt;</span>\n" +
                "\n" +
                "<span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "{\n" +
                "    printf(<span style=\"color: #BA2121\">&quot;%x</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>, <span style=\"color: #666666\">-2&lt;&lt;2</span>);\n" +
                "    <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                "}\n" +
                "</pre></div>\n", "fff8", "ffff", "0", "Error", 1, "The integer value 2 is represented as 00000000 00000010 in binary system. \n" +
                                             "\n" +
                                             "Negative numbers are represented in 2's complement method. \n" +
                                             "\n" +
                                             "1's complement of 00000000 00000010 is 11111111 11111101 (Change all 0s to 1 and 1s to 0). \n" +
                                             "\n" +
                                             "2's complement of 00000000 00000010 is 11111111 11111110 (Add 1 to 1's complement to obtain the 2's complement value). \n" +
                                             "\n" +
                                             "Therefore, in binary we represent -2 as: 11111111 11111110. \n" +
                                             "\n" +
                                             "After left shifting it by 2 bits we obtain: 11111111 11111000, and it is equal to \"fff8\" in hexadecimal system."));

        questionList.add(getQuestion(39, "Are logical operator sequence points?", "False", "True", "Depends on the compiler", "Depends on the standard", 2, ""));

        questionList.add(getQuestion(40, "What will be the value of d in the following program?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">    <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> a <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">10</span>, b <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">5</span>, c <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">5</span>;\n" +
                "        <span style=\"color: #B00040\">int</span> d;\n" +
                "        d <span style=\"color: #666666\">=</span> b <span style=\"color: #666666\">+</span> c <span style=\"color: #666666\">==</span> a;\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%d&quot;</span>, d);\n" +
                "    }\n" +
                "</pre></div>\n", "1", "5", "10", "Syntax error", 1, ""));

        options.put("Operators - 2", questionList);


        questionList = new ArrayList<>();
        questionList.add(getQuestion(41, "How many times \"LearnC\" is get printed?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include&lt;stdio.h&gt;</span>\n" +
                "<span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "{\n" +
                "    <span style=\"color: #B00040\">int</span> x;\n" +
                "    <span style=\"color: #008000; font-weight: bold\">for</span>(x<span style=\"color: #666666\">=-1</span>; x<span style=\"color: #666666\">&lt;=10</span>; x<span style=\"color: #666666\">++</span>)\n" +
                "    {\n" +
                "        <span style=\"color: #008000; font-weight: bold\">if</span>(x <span style=\"color: #666666\">&lt;</span> <span style=\"color: #666666\">5</span>)\n" +
                "            <span style=\"color: #008000; font-weight: bold\">continue</span>;\n" +
                "        <span style=\"color: #008000; font-weight: bold\">else</span>\n" +
                "            <span style=\"color: #008000; font-weight: bold\">break</span>;\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;LearnC&quot;</span>);\n" +
                "    }\n" +
                "    <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                "}\n" +
                "</pre></div>", "Infinite times", "11 times", "0 times", "10 times", 3, ""));
        questionList.add(getQuestion(42, "How many times the while loop will get executed if a short int is 2 byte wide?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include&lt;stdio.h&gt;</span>\n" +
                "<span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "{\n" +
                "    <span style=\"color: #B00040\">int</span> j<span style=\"color: #666666\">=1</span>;\n" +
                "    <span style=\"color: #008000; font-weight: bold\">while</span>(j <span style=\"color: #666666\">&lt;=</span> <span style=\"color: #666666\">255</span>)\n" +
                "    {\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%c %d</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>, j, j);\n" +
                "        j<span style=\"color: #666666\">++</span>;\n" +
                "    }\n" +
                "    <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                "}\n" +
                "</pre></div>\n", "Infinite times", "255 times", "254 times", "256 times", 2, ""));
        questionList.add(getQuestion(43, "Which of the following is not logical operator?", "&", "||", "&&", "!", 1, "<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">Bitwise operators<span style=\"color: #666666\">:</span>\n" +
                "<span style=\"color: #666666\">&amp;</span> is a Bitwise AND operator.\n" +
                "\n" +
                "Logical operators<span style=\"color: #666666\">:</span>\n" +
                "<span style=\"color: #666666\">&amp;&amp;</span> is a Logical AND operator.\n" +
                "<span style=\"color: #666666\">||</span> is a Logical OR operator.\n" +
                "<span style=\"color: #666666\">!</span> is a NOT operator.\n" +
                "So, <span style=\"color: #BA2121\">&#39;&amp;&#39;</span> is not a Logical operator.\n" +
                "</pre></div>\n"));

        questionList.add(getQuestion(44, "In mathematics and computer programming, which is the correct order of mathematical operators ?", "Addition, Subtraction, Multiplication, Division", "Multiplication, Addition, Division, Subtraction", "Addition, Division, Modulus, Subtraction", "Division, Multiplication, Addition, Subtraction\n", 4, "Simply called as BODMAS (Brackets, Order, Division, Multiplication, Addition and Subtraction).\n"
        ));

        questionList.add(getQuestion(45, "Which of the following cannot be checked in a switch-case statement?", "Character", "Integer", "Float", "enum", 3, "The switch/case statement in the c language is defined by the language specification to use an int value, so you can not use a float value."));

        questionList.add(getQuestion(46, "The output of the code below is\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include &lt;stdio.h&gt;</span>\n" +
                "    <span style=\"color: #B00040\">void</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> x <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">5</span>;\n" +
                "        <span style=\"color: #008000; font-weight: bold\">if</span> (x <span style=\"color: #666666\">&lt;</span> <span style=\"color: #666666\">1</span>)\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;hello&quot;</span>);\n" +
                "        <span style=\"color: #008000; font-weight: bold\">if</span> (x <span style=\"color: #666666\">==</span> <span style=\"color: #666666\">5</span>)\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;hi&quot;</span>);\n" +
                "        <span style=\"color: #008000; font-weight: bold\">else</span>\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;no&quot;</span>);\n" +
                "    }\n" +
                "</pre></div>", "hello", "hi", "no", "none of the mentioned", 2, ""));

        questionList.add(getQuestion(47, "The output of the code below is\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"> <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> x;\n" +
                "    <span style=\"color: #B00040\">void</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "    {\n" +
                "        <span style=\"color: #008000; font-weight: bold\">if</span> (x)\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;hi&quot;</span>);\n" +
                "        <span style=\"color: #008000; font-weight: bold\">else</span>\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;how are u&quot;</span>);\n" +
                "    }\n" +
                "</pre></div>", "how are you", "hi", "compile time error", "none of these", 1, ""));

        questionList.add(getQuestion(48, "Comment on the following code below\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"> <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">void</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> x <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">10</span>;\n" +
                "        <span style=\"color: #008000; font-weight: bold\">if</span> (<span style=\"color: #008000\">true</span>);\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;world&quot;</span>);\n" +
                "    }\n" +
                "</pre></div>\n", "It will display world", "Nothing will be displayed", "It will throw an error", "Compiler dependent", 3, ""));

        questionList.add(getQuestion(49, "The output of the code below is\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include &lt;stdio.h&gt;</span>\n" +
                "    <span style=\"color: #B00040\">void</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> x <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">10</span>;\n" +
                "        <span style=\"color: #008000; font-weight: bold\">if</span> (x <span style=\"color: #666666\">&lt;</span> <span style=\"color: #666666\">1</span>);\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;Hello&quot;</span>);\n" +
                " \n" +
                "    }\n" +
                "</pre></div>", "Nothing", "Run time error", "Hello", "Varies", 3, ""));

        questionList.add(getQuestion(50, "When 1 is entered, The output of the code below is?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include &lt;stdio.h&gt;</span>\n" +
                "    <span style=\"color: #B00040\">void</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> ch;\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;enter a value btw 1 to 2:&quot;</span>);\n" +
                "        scanf(<span style=\"color: #BA2121\">&quot;%d&quot;</span>, <span style=\"color: #666666\">&amp;</span>ch);\n" +
                "        <span style=\"color: #008000; font-weight: bold\">switch</span> (ch)\n" +
                "        {\n" +
                "        <span style=\"color: #008000; font-weight: bold\">case</span> <span style=\"color: #666666\">1</span>:\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;1</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>);\n" +
                "        <span style=\"color: #A0A000\">default:</span>\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;2</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>);\n" +
                "        }\n" +
                "    }\n" +
                "</pre></div>\n", "1 2", "1", "2", "Run time error", 1, ""));

        options.put("Control Instructions - 1", questionList);


        questionList = new ArrayList<>();
        questionList.add(getQuestion(51, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"> <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> x <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">1</span>;\n" +
                "        <span style=\"color: #008000; font-weight: bold\">if</span> (x <span style=\"color: #666666\">&gt;</span> <span style=\"color: #666666\">0</span>)\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;inside if</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>);\n" +
                "        <span style=\"color: #008000; font-weight: bold\">else</span> <span style=\"color: #0000FF\">if</span> (x <span style=\"color: #666666\">&gt;</span> <span style=\"color: #666666\">0</span>)\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;inside elseif</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>);\n" +
                "    }\n" +
                "</pre></div>", "inside elseif", "inside if" +
                                             "    inside elseif", "inside if", "compile time error", 2, ""));

        questionList.add(getQuestion(52, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include &lt;stdio.h&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> x <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">0</span>;\n" +
                "        <span style=\"color: #008000; font-weight: bold\">if</span> (x<span style=\"color: #666666\">++</span>)\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;true</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>);\n" +
                "        <span style=\"color: #008000; font-weight: bold\">else</span> <span style=\"color: #008000; font-weight: bold\">if</span> (x <span style=\"color: #666666\">==</span> <span style=\"color: #666666\">1</span>)\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;false</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>);\n" +
                "    }\n" +
                "</pre></div>", "true", "false", "compile time error", "undefined behaviour", 2, ""));

        questionList.add(getQuestion(53, "Comment on the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"> <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> a <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">1</span>;\n" +
                "        <span style=\"color: #008000; font-weight: bold\">if</span> (a)\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;Good &quot;</span>);\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;Bad</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>);\n" +
                "        <span style=\"color: #008000; font-weight: bold\">else</span>\n" +
                "            <span style=\"color: #0000FF\">printf</span>(<span style=\"color: #BA2121\">&quot;Better</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>);\n" +
                "    }\n" +
                "</pre></div>", "Output will be Good Bad", "Output will be Bad Better", "Output will be Bad", "Compile time errors during compilation", 4, ""));

        questionList.add(getQuestion(54, "What is the output of this C code(When 1 is entered)?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">    <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">void</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">char</span> <span style=\"color: #666666\">*</span>ch;\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;enter a value between 1 to 3:&quot;</span>);\n" +
                "        scanf(<span style=\"color: #BA2121\">&quot;%s&quot;</span>, ch);\n" +
                "        <span style=\"color: #008000; font-weight: bold\">switch</span> (ch)\n" +
                "        {\n" +
                "        <span style=\"color: #008000; font-weight: bold\">case</span> <span style=\"color: #BA2121\">&quot;1&quot;</span>:\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;1&quot;</span>);\n" +
                "            <span style=\"color: #008000; font-weight: bold\">break</span>;\n" +
                "        <span style=\"color: #008000; font-weight: bold\">case</span> <span style=\"color: #BA2121\">&quot;2&quot;</span>:\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;2&quot;</span>);\n" +
                "            <span style=\"color: #008000; font-weight: bold\">break</span>;\n" +
                "        }\n" +
                "    }\n" +
                "</pre></div>", "1", "2", "Compile time error", "Run time error", 3, ""));

        questionList.add(getQuestion(55, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"> <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> x <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">97</span>;\n" +
                "        <span style=\"color: #008000; font-weight: bold\">switch</span> (x)\n" +
                "        {\n" +
                "        <span style=\"color: #008000; font-weight: bold\">case</span> <span style=\"color: #BA2121\">&#39;a&#39;</span>:\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;yes &quot;</span>);\n" +
                "            <span style=\"color: #008000; font-weight: bold\">break</span>;\n" +
                "        <span style=\"color: #008000; font-weight: bold\">case</span> <span style=\"color: #666666\">97</span>:\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;no</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>);\n" +
                "            <span style=\"color: #008000; font-weight: bold\">break</span>;\n" +
                "        }\n" +
                "    }\n" +
                "</pre></div>", "yes no", "yes", "Character case value error", "Duplicate case value error", 4, ""));

        questionList.add(getQuestion(56, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include &lt;stdio.h&gt;</span>\n" +
                "    <span style=\"color: #008000; font-weight: bold\">const</span> <span style=\"color: #B00040\">int</span> a <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">1</span>,  b <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">2</span>;\n" +
                "    <span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> x <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">1</span>;\n" +
                "        <span style=\"color: #008000; font-weight: bold\">switch</span> (x)\n" +
                "        {\n" +
                "        <span style=\"color: #008000; font-weight: bold\">case</span> a:\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;yes &quot;</span>);\n" +
                "        <span style=\"color: #008000; font-weight: bold\">case</span> b:\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;no</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>);\n" +
                "            <span style=\"color: #008000; font-weight: bold\">break</span>;\n" +
                "        }\n" +
                "    }\n" +
                "</pre></div>", "yes no", "no", "Compile time error", "yes", 3, ""));

        questionList.add(getQuestion(57, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"> <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #008000; font-weight: bold\">switch</span> (printf(<span style=\"color: #BA2121\">&quot;Do&quot;</span>))\n" +
                "        {\n" +
                "        <span style=\"color: #008000; font-weight: bold\">case</span> <span style=\"color: #666666\">1</span>:\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;First</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>);\n" +
                "            <span style=\"color: #008000; font-weight: bold\">break</span>;\n" +
                "        <span style=\"color: #008000; font-weight: bold\">case</span> <span style=\"color: #666666\">2</span>:\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;Second</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>);\n" +
                "            <span style=\"color: #008000; font-weight: bold\">break</span>;\n" +
                "        <span style=\"color: #A0A000\">default:</span>\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;Default</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>);\n" +
                "            <span style=\"color: #008000; font-weight: bold\">break</span>;\n" +
                "        }\n" +
                "    }\n" +
                "</pre></div>", "DoFirst", "DoSecond", "DoDefault", "Do", 2, ""));

        questionList.add(getQuestion(58, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"> <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #008000; font-weight: bold\">if</span> (printf(<span style=\"color: #BA2121\">&quot;%d&quot;</span>, printf(<span style=\"color: #BA2121\">&quot;)))</span>\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;We are Happy&quot;</span>);\n" +
                "        <span style=\"color: #008000; font-weight: bold\">else</span> <span style=\"color: #0000FF\">if</span> (printf(<span style=\"color: #BA2121\">&quot;1&quot;</span>))\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;We are Sad&quot;</span>);\n" +
                "    }\n" +
                "</pre></div>", "0We are Happy", "1We are Sad", "1We are Happy", "compile time error", 4, ""));

        questionList.add(getQuestion(59, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"> <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> x <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">0</span>;\n" +
                "        <span style=\"color: #008000; font-weight: bold\">if</span> (x <span style=\"color: #666666\">==</span> <span style=\"color: #666666\">0</span>)\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;true, &quot;</span>);\n" +
                "        <span style=\"color: #008000; font-weight: bold\">else</span> <span style=\"color: #0000FF\">if</span> (x <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">10</span>)\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;false, &quot;</span>);\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%d</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>, x);\n" +
                "    }\n" +
                "</pre></div>", "true, 0", "false, 0", "compile time error", "true, 10", 1, ""));

        questionList.add(getQuestion(60, "Point out the error, if any in the program.\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include&lt;stdio.h&gt;</span>\n" +
                "<span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "{\n" +
                "    <span style=\"color: #B00040\">int</span> a <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">10</span>;\n" +
                "    <span style=\"color: #008000; font-weight: bold\">switch</span>(a)\n" +
                "    {\n" +
                "    }\n" +
                "    printf(<span style=\"color: #BA2121\">&quot;This is c program.&quot;</span>);\n" +
                "    <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                "}\n" +
                "</pre></div>", "<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #A0A000\">Error:</span> No <span style=\"color: #008000; font-weight: bold\">case</span> statement specified\n" +
                                             "</pre></div>", "<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #A0A000\">Error:</span> No <span style=\"color: #008000; font-weight: bold\">default</span> specified\n" +
                                             "</pre></div>", "No Error", "Error: infinite loop occurs", 3, "<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">There can exist a <span style=\"color: #008000; font-weight: bold\">switch</span> statement, which has no <span style=\"color: #008000; font-weight: bold\">case</span>.\n" +
                                             "</pre></div>"));

        options.put("Control Instructions - 2", questionList);


        questionList = new ArrayList<>();
        questionList.add(getQuestion(61, "The following code ‘for(;;)’ represents an infinite loop. It can be terminated by.", "exit(0)", "break", "abort()", "all of the mentioned", 2, ""));
        questionList.add(getQuestion(62, "What is the output of this C code?\n<!-- HTML generated using hilite.me --><div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"> <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">void</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">double</span> k <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">0</span>;\n" +
                "        <span style=\"color: #008000; font-weight: bold\">for</span> (k <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">0.0</span>; k <span style=\"color: #666666\">&lt;</span> <span style=\"color: #666666\">3.0</span>; k<span style=\"color: #666666\">++</span>);\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;%lf&quot;</span>, k);\n" +
                "    }\n" +
                "</pre></div>", "2.000000", "4.000000", "3.000000", "Run time error", 3, ""));

        questionList.add(getQuestion(63, "Which for loop has range of similar indexes of ‘i’ used in for (i = 0;i < n; i++)?", "for (i = n; i>0; i–)", "for (i = n; i >= 0; i–)", " for (i = n-1; i>0; i–)", "for (i = n-1; i>-1; i–)", 4, ""));

        questionList.add(getQuestion(64, "What is the output of this C code?\n<!-- HTML generated using hilite.me --><div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"> <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">void</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> k <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">0</span>;\n" +
                "        <span style=\"color: #008000; font-weight: bold\">for</span> (k)\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;Hello&quot;</span>);\n" +
                "    }\n" +
                "</pre></div>", "Compile time error", "Nothing", "hello", "Varies", 1, ""));

        questionList.add(getQuestion(65, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include &lt;stdio.h&gt;</span>\n" +
                "    <span style=\"color: #B00040\">void</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> k <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">0</span>;\n" +
                "        <span style=\"color: #008000; font-weight: bold\">for</span> (k <span style=\"color: #666666\">&lt;</span> <span style=\"color: #666666\">3</span>; k<span style=\"color: #666666\">++</span>)\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;Hello&quot;</span>);\n" +
                "    }\n" +
                "</pre></div>", "Compile time error", "Hello is printed thrice", "Nothing", "Varies", 1, ""));

        questionList.add(getQuestion(66, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include &lt;stdio.h&gt;</span>\n" +
                "    <span style=\"color: #B00040\">void</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> k <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">0</span>;\n" +
                "        <span style=\"color: #008000; font-weight: bold\">for</span> (k <span style=\"color: #666666\">&lt;</span> <span style=\"color: #666666\">3</span>; k<span style=\"color: #666666\">++</span>)\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;Hello&quot;</span>);\n" +
                "    }\n" +
                "</pre></div>", "Hello is printed thrice", "Hello is printed twice", "Run time error", "Hello is printed infinitely", 1, ""));

        questionList.add(getQuestion(67, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include &lt;stdio.h&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> i <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">0</span>;\n" +
                "        <span style=\"color: #008000; font-weight: bold\">for</span> (; ; ;)\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;In for loop</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>);\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;After loop</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>);\n" +
                "    }\n" +
                "</pre></div>", "Compile time error", "After loop", "Infinite loop", "Undefined behaviour", 1, ""));

        questionList.add(getQuestion(68, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"> <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #008000; font-weight: bold\">while</span> ()\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;In while loop &quot;</span>);\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;After loop</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>);\n" +
                "    }\n" +
                "</pre></div>", "In while loop after loop", "After loop", "Compile time error", "Infinite loop", 3, ""));

        questionList.add(getQuestion(69, "How many times i value is checked in the below code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"> <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> i <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">0</span>;\n" +
                "        <span style=\"color: #008000; font-weight: bold\">do</span> {\n" +
                "            i<span style=\"color: #666666\">++</span>;\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;in while loop</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>);\n" +
                "        } <span style=\"color: #008000; font-weight: bold\">while</span> (i <span style=\"color: #666666\">&lt;</span> <span style=\"color: #666666\">3</span>);\n" +
                "    }\n" +
                "</pre></div>", "1", "2", "3", "4", 3, ""));

        questionList.add(getQuestion(70, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">    <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">void</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> i <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">2</span>;\n" +
                "        <span style=\"color: #008000; font-weight: bold\">do</span>\n" +
                "        {\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;Hi&quot;</span>);\n" +
                "        } <span style=\"color: #008000; font-weight: bold\">while</span> (i <span style=\"color: #666666\">&lt;</span> <span style=\"color: #666666\">2</span>)\n" +
                "    }\n" +
                "</pre></div>", "Compile time error", "Hi", "Hi Hi", "Varies", 1, ""));

        options.put("Loop Instructions - 1", questionList);


        questionList = new ArrayList<>();
        questionList.add(getQuestion(71, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">    <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">void</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">char</span> <span style=\"color: #666666\">*</span>str <span style=\"color: #666666\">=</span> <span style=\"color: #BA2121\">&quot;&quot;</span>;\n" +
                "        <span style=\"color: #008000; font-weight: bold\">do</span>\n" +
                "        {\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;hello&quot;</span>);\n" +
                "        } <span style=\"color: #008000; font-weight: bold\">while</span> (str);\n" +
                "    }\n" +
                "</pre></div>", "Run time error", "Varies", "Nothing", "Hello is printed infinite times", 4, ""));

        questionList.add(getQuestion(72, "Example of iteration in C.", "for", "while", "do-while", "all of the mentioned", 4, ""));

        questionList.add(getQuestion(73, "Which loop is most suitable to first perform the operation and then test the condition?", "for loop", "do-while loop", "while loop", "none of the mentioned", 2, ""));

        questionList.add(getQuestion(74, "Which keyword can be used for coming out of recursion?", "exit", "return", "break", "Both break and return", 2, ""));

        questionList.add(getQuestion(75, "The keyword ‘break’ cannot be simply used within:", "if-else", "for", "do-while", "while", 1, ""));

        questionList.add(getQuestion(76, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include &lt;stdio.h&gt;</span>\n" +
                "    <span style=\"color: #B00040\">void</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> i <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">0</span>;\n" +
                "        <span style=\"color: #008000; font-weight: bold\">for</span> (i <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">0</span>;i <span style=\"color: #666666\">&lt;</span> <span style=\"color: #666666\">5</span>; i<span style=\"color: #666666\">++</span>)\n" +
                "            <span style=\"color: #008000; font-weight: bold\">if</span> (i <span style=\"color: #666666\">&lt;</span> <span style=\"color: #666666\">4</span>)\n" +
                "            {\n" +
                "                printf(<span style=\"color: #BA2121\">&quot;Hello&quot;</span>);\n" +
                "                <span style=\"color: #008000; font-weight: bold\">break</span>;\n" +
                "            }\n" +
                "    }\n" +
                "</pre></div>", "Hello is printed 4 times", "Hello is printed 5 times", "Hello is printed 3 times", "Hello", 4, ""));

        questionList.add(getQuestion(77, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"> <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">void</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> i <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">0</span>;\n" +
                "        <span style=\"color: #008000; font-weight: bold\">if</span> (i <span style=\"color: #666666\">==</span> <span style=\"color: #666666\">0</span>)\n" +
                "        {\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;Hello&quot;</span>);\n" +
                "            <span style=\"color: #008000; font-weight: bold\">continue</span>;\n" +
                "        }\n" +
                "    }\n" +
                "</pre></div>", "Hello", "Varies", "Compile time error", "Hello is printed infinite times", 3, ""));

        questionList.add(getQuestion(78, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"> <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> i <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">0</span>;\n" +
                "        <span style=\"color: #008000; font-weight: bold\">do</span>\n" +
                "        {\n" +
                "            i<span style=\"color: #666666\">++</span>;\n" +
                "            <span style=\"color: #008000; font-weight: bold\">if</span> (i <span style=\"color: #666666\">==</span> <span style=\"color: #666666\">2</span>)\n" +
                "                <span style=\"color: #008000; font-weight: bold\">continue</span>;\n" +
                "                printf(<span style=\"color: #BA2121\">&quot;In while loop &quot;</span>);\n" +
                "        } <span style=\"color: #008000; font-weight: bold\">while</span> (i <span style=\"color: #666666\">&lt;</span> <span style=\"color: #666666\">2</span>);\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%d</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>, i);\n" +
                "    }\n" +
                "</pre></div>", "In while loop 3", "In while loop 2", "In while loop in while loop 3", "Infinite loop", 2, ""));

        questionList.add(getQuestion(79, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"> <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> i <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">0</span>;\n" +
                "        <span style=\"color: #B00040\">char</span> c <span style=\"color: #666666\">=</span> <span style=\"color: #BA2121\">&#39;a&#39;</span>;\n" +
                "        <span style=\"color: #008000; font-weight: bold\">while</span> (i <span style=\"color: #666666\">&lt;</span> <span style=\"color: #666666\">2</span>){\n" +
                "            i<span style=\"color: #666666\">++</span>;\n" +
                "            <span style=\"color: #008000; font-weight: bold\">switch</span> (c) {\n" +
                "            <span style=\"color: #008000; font-weight: bold\">case</span> <span style=\"color: #BA2121\">&#39;a&#39;</span>:\n" +
                "                printf(<span style=\"color: #BA2121\">&quot;%c &quot;</span>, c);\n" +
                "                <span style=\"color: #008000; font-weight: bold\">break</span>;\n" +
                "                <span style=\"color: #008000; font-weight: bold\">break</span>;\n" +
                "            }\n" +
                "        }\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;after loop</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>);\n" +
                "    }\n" +
                "</pre></div>", "a a after loop", "a after loop", "after loop", "None of the mentioned", 1, ""));

        questionList.add(getQuestion(80, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include &lt;stdio.h&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "    {\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;before continue &quot;</span>);\n" +
                "        <span style=\"color: #008000; font-weight: bold\">continue</span>;\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;after continue</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>);\n" +
                "    }\n" +
                "</pre></div>", "Before continue", "After continue", "Compile time error", "Before continue after continue", 3, ""));

        options.put("Loop Instructions - 2", questionList);


        questionList = new ArrayList<>();
        questionList.add(getQuestion(81, "How many times the program will print Soniya?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include&lt;stdio.h&gt;</span>\n" +
                "\n" +
                "<span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "{\n" +
                "    printf(<span style=\"color: #BA2121\">&quot;Soniya&quot;</span>);\n" +
                "    main();\n" +
                "    <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                "}\n" +
                "</pre></div>", "Infinite times", "32767 times", "65535 times", "Till stack overflows", 4, "A stack overflow occurs when too much memory is used on the call stack.\n" +
                                             "\n"));

        questionList.add(getQuestion(82, "The keyword used to transfer control from a function back to the calling function is", "goto", "switch", "return", "go back", 3, "<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">The keyword <span style=\"color: #008000; font-weight: bold\">return</span> is used to transfer control from a function back to the calling function.\n" +
                "</pre></div>"));

        questionList.add(getQuestion(83, "What will be the output of the program?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include&lt;stdio.h&gt;</span>\n" +
                "\n" +
                "<span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "{\n" +
                "    <span style=\"color: #B00040\">int</span> fun(<span style=\"color: #B00040\">int</span>);\n" +
                "    <span style=\"color: #B00040\">int</span> i <span style=\"color: #666666\">=</span> fun(<span style=\"color: #666666\">10</span>);\n" +
                "    printf(<span style=\"color: #BA2121\">&quot;%d</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>, <span style=\"color: #666666\">--</span>i);\n" +
                "    <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                "}\n" +
                "<span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">fun</span>(<span style=\"color: #B00040\">int</span> i)\n" +
                "{\n" +
                "   <span style=\"color: #008000; font-weight: bold\">return</span> (i<span style=\"color: #666666\">++</span>);\n" +
                "}\n" +
                "</pre></div>", "8", "9", "10", "11", 2, ""));

        questionList.add(getQuestion(84, "What will be the output of the program?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include&lt;stdio.h&gt;</span>\n" +
                "<span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">func1</span>(<span style=\"color: #B00040\">int</span>);\n" +
                "\n" +
                "<span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "{\n" +
                "    <span style=\"color: #B00040\">int</span> k<span style=\"color: #666666\">=35</span>;\n" +
                "    k <span style=\"color: #666666\">=</span> func1(k<span style=\"color: #666666\">=</span>func1(k<span style=\"color: #666666\">=</span>func1(k)));\n" +
                "    printf(<span style=\"color: #BA2121\">&quot;k=%d</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>, k);\n" +
                "    <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                "}\n" +
                "<span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">func1</span>(<span style=\"color: #B00040\">int</span> k)\n" +
                "{\n" +
                "    k<span style=\"color: #666666\">++</span>;\n" +
                "    <span style=\"color: #008000; font-weight: bold\">return</span> k;\n" +
                "}\n" +
                "</pre></div>", "k=37", "k=35", "k=36", "k=38", 4, ""));

        questionList.add(getQuestion(85, "What will be the output of the program?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include&lt;stdio.h&gt;</span>\n" +
                "<span style=\"color: #BC7A00\">#include&lt;stdlib.h&gt;</span>\n" +
                "\n" +
                "<span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "{\n" +
                "    <span style=\"color: #B00040\">int</span> i<span style=\"color: #666666\">=0</span>;\n" +
                "    i<span style=\"color: #666666\">++</span>;\n" +
                "    <span style=\"color: #008000; font-weight: bold\">if</span>(i<span style=\"color: #666666\">&lt;=5</span>)\n" +
                "    {\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;LearnC&quot;</span>);\n" +
                "        exit(<span style=\"color: #666666\">1</span>);\n" +
                "        main();\n" +
                "    }\n" +
                "    <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                "}\n" +
                "</pre></div>", "Prints \"LearnC\" 5 times", "Infinite loop", "Function main() doesn't calls itself", "Prints \"LearnC\"", 4, ""));

        questionList.add(getQuestion(86, "What is the return-type of the function sqrt()", "float", "int", "double", "depends on the data type of the parameter", 3, ""));

        questionList.add(getQuestion(87, "What is the output of this code having void return-type function?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include &lt;stdio.h&gt;</span>\n" +
                "    <span style=\"color: #B00040\">void</span> <span style=\"color: #0000FF\">foo</span>()\n" +
                "    {\n" +
                "        <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">1</span>;\n" +
                "    }\n" +
                "    <span style=\"color: #B00040\">void</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> x <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">0</span>;\n" +
                "        x <span style=\"color: #666666\">=</span> foo();\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%d&quot;</span>, x);\n" +
                "    }\n" +
                "</pre></div>", "Runtime error", "Compile time error", "0", "1", 2, ""));

        questionList.add(getQuestion(88, "What will be the data type returned for the following function?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include &lt;stdio.h&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">func</span>()\n" +
                "    {\n" +
                "        <span style=\"color: #008000; font-weight: bold\">return</span> (<span style=\"color: #B00040\">double</span>)(<span style=\"color: #B00040\">char</span>)<span style=\"color: #666666\">5.0</span>;\n" +
                "    }\n" +
                "</pre></div>", "double", "multiple type-casting in return is illegal", "char", "int", 4, ""));

        questionList.add(getQuestion(89, "The output of the code below is\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"> <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">void</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> k <span style=\"color: #666666\">=</span> m();\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%d&quot;</span>, k);\n" +
                "    }\n" +
                "    <span style=\"color: #B00040\">void</span> m()\n" +
                "    {\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;world&quot;</span>);\n" +
                "    }\n" +
                "</pre></div>", "world 5", "Error", "Nothing", "Junk value", 1, ""));

        questionList.add(getQuestion(90, "The value obtained in the function is given back to main by using ________ keyword?", "static", "return", "volatile", "new", 2, ""));

        options.put("Functions", questionList);


        questionList = new ArrayList<>();

        questionList.add(getQuestion(91, "Property which allows to produce different executable for different platforms in C is called?", "Selective inclusion", "Conditional compilation", "Recursive macros", "File inclusion", 2, "Conditional compilation is the preprocessor facility to produce different executable."));

        questionList.add(getQuestion(92, "<!-- HTML generated using hilite.me --><div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include &lt;stdio.h&gt; is called</span>\n" +
                "</pre></div>", "Inclusion directive", "File inclusion directive", "Preprocessor directive", "None of the mentioned", 3, ""));

        questionList.add(getQuestion(93, "C preprocessors can have compiler specific features.", "false", "true", "Depends on the standard", "Depends on the platform", 2, "#pragma is compiler specific feature."));

        questionList.add(getQuestion(94, "<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">In which stage the following code \n" +
                "<span style=\"color: #BC7A00\">#include&lt;stdio.h&gt; </span>\n" +
                "gets replaced by the contents of the file stdio.h\n" +
                "</pre></div>", "During linking", "During editing", "During execution", "During preprocessing", 4, "<!-- HTML generated using hilite.me --><div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">The preprocessor replaces the line <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span> with the system header file of that name. More precisely, the entire text of the file <span style=\"border: 1px solid #FF0000\">&#39;</span>stdio.h<span style=\"border: 1px solid #FF0000\">&#39;</span> replaces the <span style=\"border: 1px solid #FF0000\">#</span>include directive.\n" +
                                             "</pre></div>"));

        questionList.add(getQuestion(95, "What will be the output of the program?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include&lt;stdio.h&gt;</span>\n" +
                "<span style=\"color: #BC7A00\">#define CUBE(x) (x*x*x)</span>\n" +
                "\n" +
                "<span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "{\n" +
                "    <span style=\"color: #B00040\">int</span> a, b<span style=\"color: #666666\">=3</span>;\n" +
                "    a <span style=\"color: #666666\">=</span> CUBE(b<span style=\"color: #666666\">++</span>);\n" +
                "    printf(<span style=\"color: #BA2121\">&quot;%d, %d</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>, a, b);\n" +
                "    <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                "}\n" +
                "</pre></div>", "27, 4", "27, 6", "Error", "9, 4", 2, ""));

        questionList.add(getQuestion(96, "Which of the following are C preprocessors?", "#endif", "#define", "#ifdef", "all", 4, ""));

        questionList.add(getQuestion(97, "#include statement must be written", "Before any scanf/printf", "After main()", "It can be written anywhere", "Before main()", 1, "Using these directives before main() improves readability."));

        questionList.add(getQuestion(98, "The #include directive", "Statements are not typically placed at the top of a program", "Tells the preprocessor to grab the text of a file and place it directly into the current file", "All of the mentioned", "None of the mentioned", 2, ""));

        questionList.add(getQuestion(99, "The preprocessor provides the ability for _______________", "Conditional compilation and line control.", "The inclusion of macro expansions", "The inclusion of header files", "All of the mentioned", 4, "The preprocessor provides the ability for the inclusion of header files, macro expansions, conditional compilation, and line control."));

        questionList.add(getQuestion(100, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include &lt;stdio.h&gt;</span>\n" +
                "<span style=\"color: #BC7A00\">#define foo(m, n) m * n = 10</span>\n" +
                "<span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "{\n" +
                "    printf(<span style=\"color: #BA2121\">&quot;in main</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>);\n" +
                "}\n" +
                "</pre></div>", "Preprocessor error as lvalue is required for the expression m*n=10", "Compilation error as lvalue is required for the expression m*n=10", "In main", "None", 3, "Preprocessor just replaces whatever is given compiler then checks for error at the replaced part of the code. Here it is not replaced anywhere."));

        options.put("Preprocessors", questionList);


        questionList = new ArrayList<>();
        questionList.add(getQuestion(101, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include &lt;stdio.h&gt;</span>\n" +
                "    <span style=\"color: #B00040\">void</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "    {\n" +
                "        m();\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%d&quot;</span>, x);\n" +
                "    }\n" +
                "    <span style=\"color: #B00040\">int</span> x;\n" +
                "    <span style=\"color: #B00040\">void</span> <span style=\"color: #0000FF\">m</span>()\n" +
                "    {\n" +
                "        x <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">4</span>;\n" +
                "    }\n" +
                "</pre></div>", "0", "4", "Undefined", "Compile time error", 4, ""));
        questionList.add(getQuestion(102, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">    <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> x;\n" +
                "    <span style=\"color: #B00040\">void</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "    {\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%d&quot;</span>, x);\n" +
                "    }\n" +
                "</pre></div>", "Run time error", "Junk value", "0", "Undefined", 3, ""));
        questionList.add(getQuestion(103, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"> <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> x <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">7</span>;\n" +
                "    <span style=\"color: #B00040\">void</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> x <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">3</span>;\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%d&quot;</span>, x);\n" +
                "        {\n" +
                "            x <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">4</span>;\n" +
                "        }\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%d&quot;</span>, x);\n" +
                "    }\n" +
                "</pre></div>", "3 3", "3 7", "3 4", "Run time error", 3, ""));

        questionList.add(getQuestion(104, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"> <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> x <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">9</span>;\n" +
                "    <span style=\"color: #B00040\">void</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> x <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">2</span>;\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%d&quot;</span>, x);\n" +
                "        {\n" +
                "            <span style=\"color: #B00040\">int</span> x <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">3</span>;\n" +
                "        }\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%d&quot;</span>, x);\n" +
                "    }\n" +
                "</pre></div>", "2 2", "2 3", "2 9", "Run time error", 1, ""));

        questionList.add(getQuestion(105, "Functions in C are ALWAYS:", "External", "Internal", "Both Internal and External", "External and Internal are not valid terms for functions", 1, ""));

        questionList.add(getQuestion(106, "Global variables are:", "External", "Internal", "Both Internal and External", "None of the mentioned", 1, ""));

        questionList.add(getQuestion(107, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">    <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">void</span> main()\n" +
                "    {\n" +
                "        m();\n" +
                "        m();\n" +
                "    }\n" +
                "    <span style=\"color: #B00040\">void</span> m()\n" +
                "    {\n" +
                "        <span style=\"color: #008000; font-weight: bold\">static</span> <span style=\"color: #B00040\">int</span> x <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">8</span>;\n" +
                "        x<span style=\"color: #666666\">++</span>;\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%d&quot;</span>, x);\n" +
                "    }\n" +
                "</pre></div>", "8 8", "8 9", "9 9", "9 10", 4, ""));

        questionList.add(getQuestion(108, "In case of a conflict between the names of a local and global variable what happens?", "The global variable is given a priority.", "The local variable is given a priority.", "Which one will get a priority depends upon which one is defined first.", "The compiler reports an error.", 2, ""));

        questionList.add(getQuestion(109, "Where will the space be allocated for an automatic storage class variable?", "In CPU register", "In memory as well as in CPU register", "In memory", "On disk.", 3, ""));

        questionList.add(getQuestion(110, "For which of the following situation should the register storage class be used?", "For local variable in a function", "For loop counter", "For collecting values returned from a function", "For variables used in a recursive function", 2, ""));

        options.put("Storage Classes - 1", questionList);


        questionList = new ArrayList<>();

        questionList.add(getQuestion(111, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">    <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #008000; font-weight: bold\">register</span> <span style=\"color: #B00040\">int</span> i <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">10</span>;\n" +
                "        <span style=\"color: #B00040\">int</span> <span style=\"color: #666666\">*</span>p <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">&amp;</span>i;\n" +
                "        <span style=\"color: #666666\">*</span>p <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">11</span>;\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%d %d</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>, i, <span style=\"color: #666666\">*</span>p);\n" +
                "    }\n" +
                "</pre></div>", "Depends on whether i is actually stored in machine register", "10 10", "11 11", "Compile time error", 4, ""));

        questionList.add(getQuestion(112, "register keyword mandates compiler to place it in machine register.", "true", "Depends on the standard", "false", "None of the mentioned", 3, ""));

        questionList.add(getQuestion(113, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">    <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #008000; font-weight: bold\">register</span> <span style=\"color: #008000; font-weight: bold\">static</span> <span style=\"color: #B00040\">int</span> i <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">10</span>;\n" +
                "        i <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">11</span>;\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%d</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>, i);\n" +
                "    }\n" +
                "</pre></div>", "10", "11", "Compile time error", "Undefined behaviour", 3, ""));

        questionList.add(getQuestion(114, "The scope of an automatic variable is:", "Within the block it appears", "Within the blocks of the block it appears", "Until the end of program", "Within the block it appears & Within the blocks of the block it appears", 4, ""));

        questionList.add(getQuestion(115, "Automatic variables are allocated space in the form of a:", "queue", "stack", "priority queue", "random", 2, ""));

        questionList.add(getQuestion(116, "Which of the following is a storage specifier?", "enum", "auto", "volatile", "union", 2, ""));

        questionList.add(getQuestion(117, "Default storage class if not any is specified for a local variable, is auto", "true", "false", "Depends on the standard", "None of the mentioned", 1, ""));

        questionList.add(getQuestion(118, "Automatic variables are stored in", "stack", "data segment", "register", "heap", 1, ""));

        questionList.add(getQuestion(119, "When compiler accepts the request to use the variable as a register?", "It is stored in CPU", "It is stored in main memory", "It is stored in cache memory", "It is stored in secondary memory", 1, ""));

        questionList.add(getQuestion(120, "Register variables reside in", "stack", "registers", "heap", "main memory", 2, ""));

        options.put("Storage Classes - 2", questionList);


        questionList = new ArrayList<>();

        questionList.add(getQuestion(121, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">    <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #008000; font-weight: bold\">register</span> <span style=\"color: #B00040\">int</span> x;\n" +
                "    <span style=\"color: #B00040\">void</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "    {\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%d&quot;</span>, x);\n" +
                "    }\n" +
                "</pre></div>", "Compile time error", "Varies", "Junk value", "0", 1, ""));

        questionList.add(getQuestion(122, "Automatic variables are variables that are", "Declared within the scope of a block, usually a function", "Declared with auto keyword", "Declared outside all functions", "Declared within the keyword extern", 1, ""));

        questionList.add(getQuestion(123, "Automatic variables", "Exist only within that scope in which it is declared", "Cease to exist after the block is exited", "Only 1", "Exist only within that scope in which it is declared & exist after the block is exited", 4, ""));

        questionList.add(getQuestion(124, "Automatic variables are allocated memory in", "heap", "Data segment", "Code segment", "stack", 4, ""));

        questionList.add(getQuestion(125, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">    <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">void</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> x;\n" +
                "    }\n" +
                "</pre></div>\n\nhere x is", "static variable", "register variable", "global variable", "automatic variable", 4, ""));

        questionList.add(getQuestion(126, "Automatic variables are initialised to", "Junk value", "Zero", "Nothing", "Both Zero & Junk value", 1, ""));

        questionList.add(getQuestion(127, "What is the scope of an external variable?", "Whole source file in which it is defined", "From the point of declaration to the end of the file in which it is defined", "Any source file in a program", "From the point of declaration to the end of the file being compiled", 4, ""));

        questionList.add(getQuestion(128, "Comment on the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">    <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> i;\n" +
                "        <span style=\"color: #008000; font-weight: bold\">for</span> (i <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">0</span>;i <span style=\"color: #666666\">&lt;</span> <span style=\"color: #666666\">5</span>; i<span style=\"color: #666666\">++</span>)\n" +
                "        <span style=\"color: #B00040\">int</span> a <span style=\"color: #666666\">=</span> i;\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%d&quot;</span>, a);\n" +
                "    }\n" +
                "</pre></div>", "Redeclaration of a in same scope throws error", "Syntax error in declaration of a", "a is out of scope when printf is called", "No errors, program will show the output 5", 2, ""));

        questionList.add(getQuestion(129, "Which variable has the longest scope?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">    <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> b;\n" +
                "    <span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> c;\n" +
                "        <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                "    }\n" +
                "    <span style=\"color: #B00040\">int</span> a;\n" +
                "</pre></div>", "a", "b", "c", "Both a and b", 2, ""));

        questionList.add(getQuestion(130, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">    <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> i;\n" +
                "    <span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "    {\n" +
                "        <span style=\"color: #008000; font-weight: bold\">extern</span> <span style=\"color: #B00040\">int</span> i;\n" +
                "        <span style=\"color: #008000; font-weight: bold\">if</span> (i <span style=\"color: #666666\">==</span> <span style=\"color: #666666\">0</span>)\n" +
                "            printf(<span style=\"color: #BA2121\">&quot;scope rules</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>);\n" +
                "    }\n" +
                "</pre></div>", "Compile time error due to multiple declaration", "Compile time error due to not defining type in statement extern i", "scope rules", "Nothing as i value is not zero being automatic variable", 3, ""));

        options.put("Storage Classes - 3", questionList);


        questionList = new ArrayList<>();
        questionList.add(getQuestion(131, "What will happen if in a C program you assign a value to an array element whose subscript exceeds the size of array?", "The compiler would report an error.", "The element will be set to 0.", "The program may crash if some important data gets overwritten.", "The array size would appropriately grow.", 3, "If the index of the array size is exceeded, the program will crash. Hence \"option c\" is the correct answer. But the modern compilers will take care of this kind of errors."));

        questionList.add(getQuestion(132, "<!-- HTML generated using hilite.me --><div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">What does the following declaration mean<span style=\"color: #666666\">?</span>\n" +
                "<span style=\"color: #B00040\">int</span> (<span style=\"color: #666666\">*</span>ptr)[<span style=\"color: #666666\">15</span>];\n" +
                "</pre></div>", "ptr is an array of 15 integers", "ptr is an pointer to array", "ptr is array of pointers to 15 integers", "ptr is a pointer to an array of 15 integers", 4, ""));

        questionList.add(getQuestion(133,
                                     "In C, if you pass an array as an argument to a function, what actually gets passed?", "First element of the array", "Base address of the array", "Address of the last element of array", "Value of elements in array", 2, "When we pass an array as a funtion argument, the base address of the array will be passed."));

        questionList.add(getQuestion(134, "What will be the output of the program ?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include&lt;stdio.h&gt;</span>\n" +
                "\n" +
                "<span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "{\n" +
                "    <span style=\"color: #B00040\">int</span> a[<span style=\"color: #666666\">5</span>] <span style=\"color: #666666\">=</span> {<span style=\"color: #666666\">5</span>, <span style=\"color: #666666\">1</span>, <span style=\"color: #666666\">15</span>, <span style=\"color: #666666\">20</span>, <span style=\"color: #666666\">25</span>};\n" +
                "    <span style=\"color: #B00040\">int</span> i, j, m;\n" +
                "    i <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">++</span>a[<span style=\"color: #666666\">1</span>];\n" +
                "    j <span style=\"color: #666666\">=</span> a[<span style=\"color: #666666\">1</span>]<span style=\"color: #666666\">++</span>;\n" +
                "    m <span style=\"color: #666666\">=</span> a[i<span style=\"color: #666666\">++</span>];\n" +
                "    printf(<span style=\"color: #BA2121\">&quot;%d, %d, %d&quot;</span>, i, j, m);\n" +
                "    <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                "}\n" +
                "</pre></div>", "1, 2, 5", "3, 2, 15", "2, 3, 20", "2, 1, 15", 2, ""));

        questionList.add(getQuestion(135, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">    <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">void</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> a[<span style=\"color: #666666\">3</span>] <span style=\"color: #666666\">=</span> {<span style=\"color: #666666\">1</span>, <span style=\"color: #666666\">2</span>, <span style=\"color: #666666\">3</span>};\n" +
                "        <span style=\"color: #B00040\">int</span> <span style=\"color: #666666\">*</span>p <span style=\"color: #666666\">=</span> a;\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%p</span><span style=\"color: #BB6622; font-weight: bold\">\\t</span><span style=\"color: #BA2121\">%p&quot;</span>, p, a);\n" +
                "    }\n" +
                "</pre></div>", "Same address is printed.", "Different address is printed", "Compile time error", "Nothing", 1, ""));

        questionList.add(getQuestion(136, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">    <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">void</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">char</span> <span style=\"color: #666666\">*</span>s<span style=\"color: #666666\">=</span> <span style=\"color: #BA2121\">&quot;hello&quot;</span>;\n" +
                "        <span style=\"color: #B00040\">char</span> <span style=\"color: #666666\">*</span>p <span style=\"color: #666666\">=</span> s;\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%c</span><span style=\"color: #BB6622; font-weight: bold\">\\t</span><span style=\"color: #BA2121\">%c&quot;</span>, <span style=\"color: #666666\">1</span>[p], s[<span style=\"color: #666666\">1</span>]);\n" +
                "    }\n" +
                "</pre></div>", "h h", "l l", "e e", "Run time error", 3, ""));

        questionList.add(getQuestion(137, "What is the output of the code given below?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">    <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> ary[<span style=\"color: #666666\">4</span>] <span style=\"color: #666666\">=</span> {<span style=\"color: #666666\">1</span>, <span style=\"color: #666666\">2</span>, <span style=\"color: #666666\">3</span>, <span style=\"color: #666666\">4</span>};\n" +
                "        <span style=\"color: #B00040\">int</span> <span style=\"color: #666666\">*</span>p <span style=\"color: #666666\">=</span> ary <span style=\"color: #666666\">+</span> <span style=\"color: #666666\">3</span>;\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%d</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>, p[<span style=\"color: #666666\">-2</span>]);\n" +
                "    }\n" +
                "</pre></div>", "2", "1", "Compile time error", "Some garbage value", 1, ""));

        questionList.add(getQuestion(138, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">    <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> ary[<span style=\"color: #666666\">4</span>] <span style=\"color: #666666\">=</span> {<span style=\"color: #666666\">1</span>, <span style=\"color: #666666\">2</span>, <span style=\"color: #666666\">3</span>, <span style=\"color: #666666\">4</span>};\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%d</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>, <span style=\"color: #666666\">*</span>ary);\n" +
                "    }\n" +
                "</pre></div>", "1", "Some garbage value", "Compile time error", "Undefined variable", 1, ""));

        questionList.add(getQuestion(139, "Comment on an array of void data type:", "It only stores element of similar data type to first element", "It acquires the data type with the highest precision in it", "You cannot have an array of void data type", "It can store any data-type", 3, ""));

        questionList.add(getQuestion(140, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">    <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">void</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> a[<span style=\"color: #666666\">2</span>][<span style=\"color: #666666\">3</span>] <span style=\"color: #666666\">=</span> {<span style=\"color: #666666\">1</span>, <span style=\"color: #666666\">2</span>, <span style=\"color: #666666\">3</span>, <span style=\"color: #666666\">4</span>, <span style=\"color: #666666\">5</span>};\n" +
                "        <span style=\"color: #B00040\">int</span> i <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">0</span>, j <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">0</span>;\n" +
                "        <span style=\"color: #008000; font-weight: bold\">for</span> (i <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">0</span>; i <span style=\"color: #666666\">&lt;</span> <span style=\"color: #666666\">2</span>; i<span style=\"color: #666666\">++</span>)\n" +
                "        <span style=\"color: #008000; font-weight: bold\">for</span> (j <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">0</span>; j <span style=\"color: #666666\">&lt;</span> <span style=\"color: #666666\">3</span>; j<span style=\"color: #666666\">++</span>)\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%d&quot;</span>, a[i][j]);\n" +
                "    }\n" +
                "</pre></div>", "1 2 3 4 5 junk", "1 2 3 4 5 5", "1 2 3 4 5 0", "Run time error", 3, ""));

        options.put("Arrays - 1", questionList);


        questionList = new ArrayList<>();

        questionList.add(getQuestion(141, "Which of the following is not possible statically in C?", "Jagged Array", "Rectangular Array", "Cuboidal Array", "Multidimensional Array", 1, ""));

        questionList.add(getQuestion(142, "Applications of multidimensional array are?", "Minimum Spanning Tree", "Matrix-Multiplication", "Finding connectivity between nodes", "All of the mentioned", 4, ""));

        questionList.add(getQuestion(143, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">    <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> ary[<span style=\"color: #666666\">2</span>][<span style=\"color: #666666\">3</span>][<span style=\"color: #666666\">4</span>], j <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">20</span>;\n" +
                "        ary[<span style=\"color: #666666\">0</span>][<span style=\"color: #666666\">0</span>] <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">&amp;</span>j;\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%d</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>, <span style=\"color: #666666\">*</span>ary[<span style=\"color: #666666\">0</span>][<span style=\"color: #666666\">0</span>]);\n" +
                "    }\n" +
                "</pre></div>", "Address of j", "Compile time error", "20", "Undefined behaviour", 2, ""));

        questionList.add(getQuestion(144, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">    <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> ary[<span style=\"color: #666666\">2</span>][<span style=\"color: #666666\">3</span>];\n" +
                "        ary[][] <span style=\"color: #666666\">=</span> {{<span style=\"color: #666666\">1</span>, <span style=\"color: #666666\">2</span>, <span style=\"color: #666666\">3</span>}, {<span style=\"color: #666666\">4</span>, <span style=\"color: #666666\">5</span>, <span style=\"color: #666666\">6</span>}};\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%d</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>, ary[<span style=\"color: #666666\">1</span>][<span style=\"color: #666666\">0</span>]);\n" +
                "    }\n" +
                "</pre></div>", "Compile time error", "1", "2", "4", 4, ""));

        questionList.add(getQuestion(145, "What will be the output of the program ?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include&lt;stdio.h&gt;</span>\n" +
                "\n" +
                "<span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "{\n" +
                "    <span style=\"color: #B00040\">float</span> arr[] <span style=\"color: #666666\">=</span> {<span style=\"color: #666666\">12.4</span>, <span style=\"color: #666666\">2.3</span>, <span style=\"color: #666666\">4.5</span>, <span style=\"color: #666666\">6.7</span>};\n" +
                "    printf(<span style=\"color: #BA2121\">&quot;%d</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>, <span style=\"color: #008000; font-weight: bold\">sizeof</span>(arr)<span style=\"color: #666666\">/</span><span style=\"color: #008000; font-weight: bold\">sizeof</span>(arr[<span style=\"color: #666666\">0</span>]));\n" +
                "    <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                "}\n" +
                "</pre></div>", "4", "5", "6", "7", 1, ""));

        questionList.add(getQuestion(146, "Referring an element outside array bounds is a", "Syntax error", "Logical error", "Execution time error", "Both B and C", 4, ""));

        questionList.add(getQuestion(147, "Each element of an array is searched against searching key, is specialty of", "Bubble sort", "Linear search", "Binary search", "All of them", 2, ""));

        questionList.add(getQuestion(148, "A one-dimensional array of one-dimensional arrays is called", "Multi-dimensional array", "Multi-casting array", "Two-dimensional array", "Three-dimensional array", 3, ""));

        questionList.add(getQuestion(149, "Sequence of objects that have same type, is called", "Functions", "Arrays", "Stacks", "Operators\n", 2, ""));

        questionList.add(getQuestion(150, "Binary search algorithm uses", "Linear way to search values", "Divide and conquer method", "Bubble sorting technique", "None of them", 2, ""));

        options.put("Arrays - 2", questionList);


        questionList = new ArrayList<>();

        questionList.add(getQuestion(151, "To declare a 3 dimensional array using pointers, which of the following is the correct syntax:", "char *a[][];", "char **a[];", "char ***a;", "all of the mentioned", 1, ""));

        questionList.add(getQuestion(152, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">    <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">void</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">char</span> <span style=\"color: #666666\">*</span>a[<span style=\"color: #666666\">10</span>] <span style=\"color: #666666\">=</span> {<span style=\"color: #BA2121\">&quot;hi&quot;</span>, <span style=\"color: #BA2121\">&quot;hello&quot;</span>, <span style=\"color: #BA2121\">&quot;how&quot;</span>};\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%d</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>, <span style=\"color: #008000; font-weight: bold\">sizeof</span>(a));\n" +
                "    }\n" +
                "</pre></div>", "10", "12", "40", "Run time error", 3, ""));

        questionList.add(getQuestion(153, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">    <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">void</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">char</span> <span style=\"color: #666666\">*</span>a[<span style=\"color: #666666\">10</span>] <span style=\"color: #666666\">=</span> {<span style=\"color: #BA2121\">&quot;hi&quot;</span>, <span style=\"color: #BA2121\">&quot;hello&quot;</span>, <span style=\"color: #BA2121\">&quot;how&quot;</span>};\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%d</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>, <span style=\"color: #008000; font-weight: bold\">sizeof</span>(a[<span style=\"color: #666666\">1</span>]));\n" +
                "    }\n" +
                "</pre></div>", "3", "4", "5", "6", 2, ""));

        questionList.add(getQuestion(154, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">    <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">void</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">char</span> a[<span style=\"color: #666666\">10</span>][<span style=\"color: #666666\">5</span>] <span style=\"color: #666666\">=</span> {<span style=\"color: #BA2121\">&quot;hi&quot;</span>, <span style=\"color: #BA2121\">&quot;hello&quot;</span>, <span style=\"color: #BA2121\">&quot;fellows&quot;</span>};\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%s&quot;</span>, a[<span style=\"color: #666666\">2</span>]);\n" +
                "    }\n" +
                "</pre></div>", "fellow", "fello", "fell", "fellows", 2, ""));

        questionList.add(getQuestion(155, "What is the output of the code given below?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">    <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">int</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">char</span> <span style=\"color: #666666\">*</span>a[<span style=\"color: #666666\">1</span>] <span style=\"color: #666666\">=</span> {<span style=\"color: #BA2121\">&quot;hello&quot;</span>};\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%s&quot;</span>, a[<span style=\"color: #666666\">0</span>]);\n" +
                "        <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                "    }\n" +
                "</pre></div>", "Compile time error", "Undefined behaviour", "hellon", "hello", 4, ""));

        questionList.add(getQuestion(156, "Which of the following statements are true?\n<!-- HTML generated using hilite.me --><div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">    P. Pointer to Array\n" +
                "    Q. Multi<span style=\"color: #666666\">-</span>dimensional array\n" +
                "</pre></div>", "P are static, Q are dynamic", "P are dynamic, Q are static", "P are dynamic, Q are dynamic", " P are static, Q are static", 2, ""));

        questionList.add(getQuestion(157, "Which of the following uses structure?", "Array of structures", "Binary Tree", "Linked Lists", "All", 4, ""));

        questionList.add(getQuestion(158, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">    <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #008000; font-weight: bold\">struct</span> student\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">char</span> <span style=\"color: #666666\">*</span>name;\n" +
                "    };\n" +
                "    <span style=\"color: #B00040\">void</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "    {\n" +
                "        <span style=\"color: #008000; font-weight: bold\">struct</span> student s[<span style=\"color: #666666\">2</span>], r[<span style=\"color: #666666\">2</span>];\n" +
                "        s[<span style=\"color: #666666\">1</span>] <span style=\"color: #666666\">=</span> s[<span style=\"color: #666666\">0</span>] <span style=\"color: #666666\">=</span> <span style=\"color: #BA2121\">&quot;alan&quot;</span>;\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%s%s&quot;</span>, s[<span style=\"color: #666666\">0</span>].name, s[<span style=\"color: #666666\">1</span>].name);\n" +
                "    }\n" +
                "</pre></div>", "Nothing", "Compile time error", "alan alan", "Varies", 1, ""));

        questionList.add(getQuestion(159, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">    <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #008000; font-weight: bold\">struct</span> student\n" +
                "    {\n" +
                "    };\n" +
                "    <span style=\"color: #B00040\">void</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "    {\n" +
                "        <span style=\"color: #008000; font-weight: bold\">struct</span> student s[<span style=\"color: #666666\">2</span>];\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%d&quot;</span>, <span style=\"color: #008000; font-weight: bold\">sizeof</span>(s));\n" +
                "    }\n" +
                "</pre></div>", "0", "2", "4", "8", 1, ""));

        questionList.add(getQuestion(160, "What type of array is generally generated in Command-line argument?", "Single dimension array", "Jagged Array", "2-Dimensional Square Array", "2-Dimensional Rectangular Array", 2, ""));

        options.put("Arrays - 3", questionList);


        questionList = new ArrayList<>();

        questionList.add(getQuestion(161, "What is (void*)0?", "Representation of void pointer", "Representation of NULL pointer", "Error", "None of above", 2, ""));

        questionList.add(getQuestion(162, "How many bytes are occupied by near, far and huge pointers (DOS)?", "near=4 far=8 huge=8", "near=2 far=4 huge=8", "near=4 far=4 huge=8", "near=2 far=4 huge=4", 4, "near=2, far=4 and huge=4 pointers exist only under DOS. Under windows and Linux every pointers is 4 bytes long."));

        questionList.add(getQuestion(163, "If a variable is a pointer to a structure, then which of the following operator is used to access data members of the structure through the pointer variable?", "&", "*", ".", "->", 4, ""));

        questionList.add(getQuestion(164, "A pointer is", "A variable that stores address of an instruction", "A variable that stores address of other variable", "A keyword used to create variables", "All of the above", 2, ""));

        questionList.add(getQuestion(165, "The operator used to get value at address stored in a pointer variable is", "&&", "||", "&", "*", 4, ""));

        questionList.add(getQuestion(166, "What will be the output of the program ?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include&lt;stdio.h&gt;</span>\n" +
                "\n" +
                "<span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "{\n" +
                "    <span style=\"color: #B00040\">int</span> i<span style=\"color: #666666\">=3</span>, <span style=\"color: #666666\">*</span>j, k;\n" +
                "    j <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">&amp;</span>i;\n" +
                "    printf(<span style=\"color: #BA2121\">&quot;%d</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>, i<span style=\"color: #666666\">**</span>j<span style=\"color: #666666\">*</span>i<span style=\"color: #666666\">+*</span>j);\n" +
                "    <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                "}\n" +
                "</pre></div>", "3", "9", "27", "30", 4, ""));

        questionList.add(getQuestion(167, "What will be the output of the program ?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include&lt;stdio.h&gt;</span>\n" +
                "\n" +
                "<span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "{\n" +
                "    <span style=\"color: #B00040\">char</span> str[<span style=\"color: #666666\">20</span>] <span style=\"color: #666666\">=</span> <span style=\"color: #BA2121\">&quot;Hello&quot;</span>;\n" +
                "    <span style=\"color: #B00040\">char</span> <span style=\"color: #666666\">*</span><span style=\"color: #008000; font-weight: bold\">const</span> p<span style=\"color: #666666\">=</span>str;\n" +
                "    <span style=\"color: #666666\">*</span>p<span style=\"color: #666666\">=</span><span style=\"color: #BA2121\">&#39;M&#39;</span>;\n" +
                "    printf(<span style=\"color: #BA2121\">&quot;%s</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>, str);\n" +
                "    <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                "}\n" +
                "</pre></div>", "Hello", "Mello", "MHello", "HMello", 2, ""));

        questionList.add(getQuestion(168, "What will be the output of the program ?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include&lt;stdio.h&gt;</span>\n" +
                "\n" +
                "<span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "{\n" +
                "    <span style=\"color: #B00040\">char</span> <span style=\"color: #666666\">*</span>str;\n" +
                "    str <span style=\"color: #666666\">=</span> <span style=\"color: #BA2121\">&quot;%s&quot;</span>;\n" +
                "    printf(str, <span style=\"color: #BA2121\">&quot;K</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>);\n" +
                "    <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                "}\n" +
                "</pre></div>", "K", "%s", "No output", "Error", 1, ""));

        questionList.add(getQuestion(169, "What will be the output of the program if the size of pointer is 4-bytes?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include&lt;stdio.h&gt;</span>\n" +
                "\n" +
                "<span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "{\n" +
                "    printf(<span style=\"color: #BA2121\">&quot;%d, %d</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>, <span style=\"color: #008000; font-weight: bold\">sizeof</span>(<span style=\"color: #008000\">NULL</span>), <span style=\"color: #008000; font-weight: bold\">sizeof</span>(<span style=\"color: #BA2121\">&quot;&quot;</span>));\n" +
                "    <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                "}\n" +
                "</pre></div>", "2, 2", "2, 1", "4, 2", "4, 1", 4, ""));

        questionList.add(getQuestion(170, "What will be the output of the program ?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include&lt;stdio.h&gt;</span>\n" +
                "\n" +
                "<span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "{\n" +
                "    printf(<span style=\"color: #BA2121\">&quot;%c</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>, <span style=\"color: #666666\">7</span>[<span style=\"color: #BA2121\">&quot;SourceTree&quot;</span>]);\n" +
                "    <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                "}\n" +
                "</pre></div>", "Nothing will print", "print \"r\" of SourceTree", "print \"7\"", "Error: in printf", 2, ""));

        options.put("Pointers", questionList);


        questionList = new ArrayList<>();

        questionList.add(getQuestion(171, "How will you free the allocated memory ?", "free(var-name);", "remove(var-name);", "delete(var-name);", "dalloc(var-name);", 1, ""));

        questionList.add(getQuestion(172, "What will be the output of the program ?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include&lt;stdio.h&gt;</span>\n" +
                "\n" +
                "<span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "{\n" +
                "    <span style=\"color: #008000; font-weight: bold\">enum</span> days {MON<span style=\"color: #666666\">=-1</span>, TUE, WED<span style=\"color: #666666\">=6</span>, THU, FRI, SAT};\n" +
                "    printf(<span style=\"color: #BA2121\">&quot;%d, %d, %d, %d, %d, %d</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>, MON, TUE, WED, THU, FRI, SAT);\n" +
                "    <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                "}\n" +
                "</pre></div>", "-1, 0, 6, 7, 8, 9", "-1, 0, 1, 2, 3, 4", "-1, 2, 6, 3, 4, 5", "-1, 0, 6, 2, 3, 4", 1, ""));

        questionList.add(getQuestion(173, "Which of the following are a collection of different data types?", "structures", "char", "string", "all", 1, ""));

        questionList.add(getQuestion(174, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">    <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #008000; font-weight: bold\">struct</span> student\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> no;\n" +
                "        <span style=\"color: #B00040\">char</span> name[<span style=\"color: #666666\">20</span>];\n" +
                "    }\n" +
                "    <span style=\"color: #B00040\">void</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #008000; font-weight: bold\">struct</span> student s;\n" +
                "        s.no <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">8</span>;\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;hello&quot;</span>);\n" +
                "    }\n" +
                "</pre></div>", "Nothing", "hello", "Varies", "Compile time error", 4, ""));

        questionList.add(getQuestion(175, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">    <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #B00040\">void</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #008000; font-weight: bold\">struct</span> teacher\n" +
                "        {\n" +
                "            <span style=\"color: #B00040\">int</span> no;\n" +
                "            <span style=\"color: #B00040\">char</span> name[<span style=\"color: #666666\">20</span>];\n" +
                "        };\n" +
                "        <span style=\"color: #008000; font-weight: bold\">struct</span> teacher s;\n" +
                "        s.no <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">8</span>;\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%d&quot;</span>, s.no);\n" +
                "    }\n" +
                "</pre></div>", "Nothing", "Compile time error", "Junk", "8", 4, ""));

        questionList.add(getQuestion(176, "Size of a union is determined by size of the", "Sum of the sizes of all members", "First member in the union", "Last member in the union", "Biggest member in the union", 4, ""));

        questionList.add(getQuestion(177, "What is the output of this C code?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">    <span style=\"border: 1px solid #FF0000\">#</span>include <span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"color: #008000; font-weight: bold\">union</span> stu\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> ival;\n" +
                "        <span style=\"color: #B00040\">float</span> fval;\n" +
                "    };\n" +
                "    <span style=\"color: #B00040\">void</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "    {\n" +
                "        <span style=\"color: #008000; font-weight: bold\">union</span> stu r;\n" +
                "        r.ival <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">5</span>;\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%d&quot;</span>, r.ival);\n" +
                "    }\n" +
                "</pre></div>", "9", "15", "16", "5", 4, ""));

        questionList.add(getQuestion(178, "What will be the output of the program given below in 16-bit platform ?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include&lt;stdio.h&gt;</span>\n" +
                "\n" +
                "<span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "{\n" +
                "    <span style=\"color: #008000; font-weight: bold\">enum</span> value{VAL1<span style=\"color: #666666\">=0</span>, VAL2, VAL3, VAL4, VAL5} var;\n" +
                "    printf(<span style=\"color: #BA2121\">&quot;%d&quot;</span>, <span style=\"color: #008000; font-weight: bold\">sizeof</span>(var));\n" +
                "    <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                "}\n" +
                "</pre></div>", "1", "2", "4", "10", 2, ""));

        questionList.add(getQuestion(179, "Point out the error in the program?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #008000; font-weight: bold\">struct</span> emp\n" +
                "{\n" +
                "    <span style=\"color: #B00040\">int</span> ecode;\n" +
                "    <span style=\"color: #008000; font-weight: bold\">struct</span> emp <span style=\"color: #666666\">*</span>e;\n" +
                "};\n" +
                "</pre></div>", "Error: in structure declaration", "Linker Error", "No Error", "None of above", 3, ""));

        questionList.add(getQuestion(180, " The number of distinct nodes the following struct declaration can point to is\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">    <span style=\"color: #008000; font-weight: bold\">struct</span> node\n" +
                "    {\n" +
                "        <span style=\"color: #008000; font-weight: bold\">struct</span> node <span style=\"color: #666666\">*</span>left;\n" +
                "        <span style=\"color: #008000; font-weight: bold\">struct</span> node <span style=\"color: #666666\">*</span>centre;\n" +
                "        <span style=\"color: #008000; font-weight: bold\">struct</span> node <span style=\"color: #666666\">*</span>right;\n" +
                "    };\n" +
                "</pre></div>", "1", "2", "3", "all", 4, ""));

        options.put("Structures, Unions, Enums", questionList);



        questionList = new ArrayList<>();

        questionList.add(getQuestion(181, "Function rewind() will?", "Reposition the file pointer stream to end of file.", "Reposition the file pointer to a character reverse.", "Reposition the file pointer to begining of that line.", "Reposition the file pointer to begining of file.", 4, ""));

        questionList.add(getQuestion(182, "What is stderr ?", "standard error streams", "standard error types", "standard error definitions", "standard error", 1, ""));

        questionList.add(getQuestion(183, "Maths function acos (x) stands for", "Inverse Sine of x", "Inverse Cosine of x", "Inverse Tangent of x", "Floor of x", 2, ""));

        questionList.add(getQuestion(184, "Standard C library file < stdlib.h> is used for", "Declares a utility function", "Declares a mathematical function", "Declares time function", "Declares date function", 1, ""));

        questionList.add(getQuestion(185, "What will be the output of the program?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include&lt;stdio.h&gt;</span>\n" +
                "<span style=\"color: #BC7A00\">#define int char </span>\n" +
                "<span style=\"color: #B00040\">void</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "{\n" +
                "      <span style=\"color: #B00040\">int</span> i <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">65</span>;\n" +
                "      printf(<span style=\"color: #BA2121\">&quot;sizeof(i)=%d&quot;</span>, <span style=\"color: #008000; font-weight: bold\">sizeof</span>(i));\n" +
                "}\n" +
                "</pre></div>", "sizeof(i)=2", "sizeof(i)=1", "Compiler Error", "None of These", 2, ""));

        questionList.add(getQuestion(186,
                "What will be the output of the program?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include&lt;stdio.h&gt;</span>\n" +
                        "<span style=\"color: #BC7A00\">#include&lt;math.h&gt;</span>\n" +
                        "\n" +
                        "<span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                        "{\n" +
                        "    <span style=\"color: #B00040\">float</span> i <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">2.5</span>;\n" +
                        "    printf(<span style=\"color: #BA2121\">&quot;%f, %d&quot;</span>, floor(i), ceil(i));\n" +
                        "    <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                        "}\n" +
                        "</pre></div>", "2, 3", "2.000000, 3", "2.000000, 0", "2, 0", 3, "Both ceil() and floor() return the integer found as a double.\n" +
                                             "\n" +
                                             "floor(2.5) returns the largest integral value(round down) that is not greater than 2.5. So output is 2.000000.\n" +
                                             "\n" +
                                             "ceil(2.5) returns 3, while converting the double to int it returns '0'. \n" +
                                             "So, the output is '2.000000, 0'."));

        questionList.add(getQuestion(187, "What will be the output of the program?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include&lt;stdio.h&gt;</span>\n" +
                "\n" +
                "<span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "{\n" +
                "    <span style=\"color: #B00040\">int</span> i;\n" +
                "    i <span style=\"color: #666666\">=</span> scanf(<span style=\"color: #BA2121\">&quot;%d %d&quot;</span>, <span style=\"color: #666666\">&amp;</span>i, <span style=\"color: #666666\">&amp;</span>i);\n" +
                "    printf(<span style=\"color: #BA2121\">&quot;%d</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>, i);\n" +
                "    <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                "}\n" +
                "</pre></div>", "2", "1", "Garbage", "Error: cannot assign scanf to variable", 1, ""));

        questionList.add(getQuestion(188, "Point out the error in the following program.\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include&lt;stdio.h&gt;</span>\n" +
                "\n" +
                "<span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "{\n" +
                "    fprintf(<span style=\"color: #BA2121\">&quot;Hello world&quot;</span>);\n" +
                "    printf(<span style=\"color: #BA2121\">&quot;%.ef&quot;</span>, <span style=\"color: #666666\">2.0</span>);\n" +
                "    <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                "}\n" +
                "</pre></div>", "Error: in fprintf() statement.", "No error and prints \"Hello world\"", "No error and prints \"2.0\"", "Error: unknown value in printf() statement.", 1, "Syntax Error"));

        questionList.add(getQuestion(189, "What will be the output of the program?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include&lt;stdio.h&gt;</span>\n" +
                "\n" +
                "<span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "{\n" +
                "    <span style=\"color: #B00040\">int</span> i;\n" +
                "    <span style=\"color: #B00040\">char</span> c;\n" +
                "    <span style=\"color: #008000; font-weight: bold\">for</span>(i<span style=\"color: #666666\">=1</span>; i<span style=\"color: #666666\">&lt;=5</span>; i<span style=\"color: #666666\">++</span>)\n" +
                "    {\n" +
                "        scanf(<span style=\"color: #BA2121\">&quot;%c&quot;</span>, <span style=\"color: #666666\">&amp;</span>c); <span style=\"color: #408080; font-style: italic\">/* given input is &#39;d&#39; */</span>\n" +
                "        ungetc(c, stdout);\n" +
                "        printf(<span style=\"color: #BA2121\">&quot;%c&quot;</span>, c);\n" +
                "        ungetc(c, stdin);\n" +
                "    }\n" +
                "    <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                "}\n" +
                "</pre></div>", "ddd", "dddd", "dddddd", "d", 4, ""));

        questionList.add(getQuestion(190, "What will be the output of the program?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include&lt;stdio.h&gt;</span>\n" +
                "<span style=\"color: #BC7A00\">#include&lt;stdlib.h&gt;</span>\n" +
                "\n" +
                "<span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "{\n" +
                "    <span style=\"color: #B00040\">char</span> <span style=\"color: #666666\">*</span>i <span style=\"color: #666666\">=</span> <span style=\"color: #BA2121\">&quot;55.555&quot;</span>;\n" +
                "    <span style=\"color: #B00040\">int</span> result1 <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">10</span>;\n" +
                "    <span style=\"color: #B00040\">float</span> result2 <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">11.111</span>;\n" +
                "    result1 <span style=\"color: #666666\">=</span> result1<span style=\"color: #666666\">+</span>atoi(i);\n" +
                "    result2 <span style=\"color: #666666\">=</span> result2<span style=\"color: #666666\">+</span>atof(i);\n" +
                "    printf(<span style=\"color: #BA2121\">&quot;%d, %f&quot;</span>, result1, result2);\n" +
                "    <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                "}\n" +
                "</pre></div>", "55, 55.555", "65, 66.666000", "55, 55", "66, 66.666600", 4, ""));

        options.put("Library Functions", questionList);



        questionList = new ArrayList<>();

        questionList.add(getQuestion(191, "Header file to use functions like malloc() and calloc()?", "string.h", "dos.h", "memory.h", "stdlib.h", 4, ""));

        questionList.add(getQuestion(192, "What is the output of this program?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">   <span style=\"border: 1px solid #FF0000\">#</span>include<span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                " \n" +
                "   <span style=\"color: #B00040\">int</span> main()\n" +
                "   {\n" +
                "       <span style=\"color: #B00040\">int</span> <span style=\"color: #666666\">*</span>ptr;\n" +
                "       ptr <span style=\"color: #666666\">=</span> (<span style=\"color: #B00040\">int</span> <span style=\"color: #666666\">*</span>)calloc(<span style=\"color: #666666\">1</span>,<span style=\"color: #008000; font-weight: bold\">sizeof</span>(<span style=\"color: #B00040\">int</span>));\n" +
                "       <span style=\"color: #666666\">*</span>ptr <span style=\"color: #666666\">=</span> <span style=\"color: #666666\">10</span>;\n" +
                "       printf(<span style=\"color: #BA2121\">&quot;%d</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>,<span style=\"color: #666666\">*</span>ptr);\n" +
                "       <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                "   }\n" +
                "</pre></div>", "1", "0", "-1", "none", 4, "This program will give an error because calloc() requires the header file stdlib.h."));

        questionList.add(getQuestion(193, "In this program the allocated memory block can store\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">    <span style=\"border: 1px solid #FF0000\">#</span>include<span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"border: 1px solid #FF0000\">#</span>include<span style=\"color: #666666\">&lt;</span>stdlib.h<span style=\"color: #666666\">&gt;</span>\n" +
                " \n" +
                "    <span style=\"color: #B00040\">int</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> <span style=\"color: #666666\">*</span>ptr;\n" +
                "        ptr <span style=\"color: #666666\">=</span> malloc(<span style=\"color: #666666\">10</span>);\n" +
                "        <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                "    }\n" +
                "</pre></div>", "char", "float", "int", "all of the mentioned", 4, "When the malloc() is used without typecasting the default type is void*."));

        questionList.add(getQuestion(194, "In which condition this prgram will print the string “Google”?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">   <span style=\"border: 1px solid #FF0000\">#</span>include<span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "   <span style=\"border: 1px solid #FF0000\">#</span>include<span style=\"color: #666666\">&lt;</span>stdlib.h<span style=\"color: #666666\">&gt;</span>\n" +
                " \n" +
                "   <span style=\"color: #B00040\">int</span> main()\n" +
                "   {\n" +
                "       <span style=\"color: #B00040\">int</span> <span style=\"color: #666666\">*</span>ptr;\n" +
                "       ptr <span style=\"color: #666666\">=</span> (<span style=\"color: #B00040\">int</span> <span style=\"color: #666666\">*</span>)malloc(<span style=\"color: #008000; font-weight: bold\">sizeof</span>(<span style=\"color: #B00040\">int</span>)<span style=\"color: #666666\">*10</span>);\n" +
                "       <span style=\"color: #008000; font-weight: bold\">if</span> (ptr <span style=\"color: #666666\">==</span> <span style=\"color: #008000\">NULL</span>)\n" +
                "           printf(<span style=\"color: #BA2121\">&quot;Google</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>);\n" +
                "       <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                "   }\n" +
                "</pre></div>", "if the memory has been allocated to the pointer “ptr” successfully", "it will never print", "none of the mentioned", "if the memory could not be allocated to the pointer “ptr”", 4, "The malloc() returns NULL when the memory is not allocated."));

        questionList.add(getQuestion(195, "In this program the allocated memory block can store\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">    <span style=\"border: 1px solid #FF0000\">#</span>include<span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "    <span style=\"border: 1px solid #FF0000\">#</span>include<span style=\"color: #666666\">&lt;</span>stdlib.h<span style=\"color: #666666\">&gt;</span>\n" +
                " \n" +
                "    <span style=\"color: #B00040\">int</span> main()\n" +
                "    {\n" +
                "        <span style=\"color: #B00040\">int</span> <span style=\"color: #666666\">*</span>ptr;\n" +
                "        ptr <span style=\"color: #666666\">=</span> malloc(<span style=\"color: #666666\">10</span>);\n" +
                "        <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                "    }\n" +
                "</pre></div>", "float", "char", "int", "all", 4, ""));

        questionList.add(getQuestion(196, "What is the output of this program?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">   <span style=\"border: 1px solid #FF0000\">#</span>include<span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "   <span style=\"border: 1px solid #FF0000\">#</span>include<span style=\"color: #666666\">&lt;</span>stdlib.h<span style=\"color: #666666\">&gt;</span>\n" +
                " \n" +
                "   <span style=\"color: #B00040\">int</span> main()\n" +
                "   {\n" +
                "\t   <span style=\"color: #B00040\">char</span> <span style=\"color: #666666\">*</span>ptr;\n" +
                "       free(ptr);\n" +
                "       <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>\t   \n" +
                "   }\n" +
                "</pre></div>", "this program will print nothing after execution", "Aborted (core dumped)", "segmentation fault", "none of the above", 2, ""));

        questionList.add(getQuestion(197, "What is the output of this program?\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\">   <span style=\"border: 1px solid #FF0000\">#</span>include<span style=\"color: #666666\">&lt;</span>stdio.h<span style=\"color: #666666\">&gt;</span>\n" +
                "   <span style=\"border: 1px solid #FF0000\">#</span>inlcude<span style=\"color: #666666\">&lt;</span>stdlib.h<span style=\"color: #666666\">&gt;</span>\n" +
                " \n" +
                "   <span style=\"color: #B00040\">int</span> main()\n" +
                "   {\n" +
                "       <span style=\"color: #B00040\">int</span> <span style=\"color: #666666\">*</span>ptr;\n" +
                "       <span style=\"color: #B00040\">double</span> <span style=\"color: #666666\">*</span>ptr;\n" +
                "       printf(<span style=\"color: #BA2121\">&quot;%d</span><span style=\"color: #BB6622; font-weight: bold\">\\n</span><span style=\"color: #BA2121\">&quot;</span>,<span style=\"color: #008000; font-weight: bold\">sizeof</span>(ptr));\n" +
                "       <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\t   \n" +
                "   }\n" +
                "</pre></div>", "8", "4", "Compiler Error", "segmentaion fault", 3, ""));

        questionList.add(getQuestion(198, "What function should be used to free the memory allocated by calloc() ?", "dealloc();", "free();", "malloc(variable_name, 0)", "memalloc(variable_name, 0)", 2, ""));

        questionList.add(getQuestion(199, "Point out the error in the following program.\n<div style=\"background: #f8f8f8; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;\"><pre style=\"margin: 0; line-height: 125%\"><span style=\"color: #BC7A00\">#include&lt;stdio.h&gt;</span>\n" +
                "<span style=\"color: #BC7A00\">#include&lt;stdlib.h&gt;</span>\n" +
                "\n" +
                "<span style=\"color: #B00040\">int</span> <span style=\"color: #0000FF\">main</span>()\n" +
                "{\n" +
                "    <span style=\"color: #B00040\">int</span> <span style=\"color: #666666\">*</span>a[<span style=\"color: #666666\">3</span>];\n" +
                "    a <span style=\"color: #666666\">=</span> (<span style=\"color: #B00040\">int</span><span style=\"color: #666666\">*</span>) malloc(<span style=\"color: #008000; font-weight: bold\">sizeof</span>(<span style=\"color: #B00040\">int</span>)<span style=\"color: #666666\">*3</span>);\n" +
                "    free(a);\n" +
                "    <span style=\"color: #008000; font-weight: bold\">return</span> <span style=\"color: #666666\">0</span>;\n" +
                "}\n" +
                "</pre></div>", "Error: We cannot store address of allocated memory in a", "Error: unable to allocate memory", "Error: unable to free memory", "No error", 1, "Store the address in a[i]"));

        questionList.add(getQuestion(200, "Specify the 2 library functions to dynamically allocate memory?", "alloc() and memalloc()", "malloc() and calloc()", "memalloc() and faralloc()", "malloc() and memalloc()", 2, ""));

        options.put("Memory Allocation", questionList);


//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(201, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(202, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(203, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(204, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(205, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(206, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(207, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(208, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(209, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(210, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(211, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(212, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(213, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(214, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(215, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(216, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(217, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(218, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(219, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(220, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(221, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(222, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(223, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(224, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(225, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(226, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(227, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(228, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(229, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(230, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(231, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(232, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(233, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(234, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(235, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(236, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(237, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(238, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(239, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(240, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(241, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(242, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(243, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(244, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(245, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(246, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(247, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(248, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(249, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(250, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(251, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(252, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(253, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(254, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(255, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(256, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(257, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(258, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(259, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(260, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(261, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(262, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(263, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(264, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(265, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(266, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(267, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(268, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(269, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(270, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(271, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(272, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(273, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(274, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(275, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(276, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(277, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(278, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(279, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(280, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(281, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(282, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(283, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(284, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(285, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(286, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(287, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(288, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(289, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(290, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(291, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(292, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(293, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(294, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(295, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(296, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(297, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(298, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(299, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(300, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(301, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(302, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(303, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(304, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(305, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(306, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(307, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(308, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(309, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(310, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(311, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(312, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(313, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(314, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(315, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(316, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(317, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(318, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(319, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(320, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(321, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(322, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(323, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(324, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(325, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(326, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(327, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(328, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(329, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(330, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(331, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(332, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(333, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(334, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(335, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(336, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(337, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(338, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(339, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(340, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(341, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(342, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(343, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(344, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(345, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(346, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(347, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(348, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(349, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(350, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(351, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(352, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(353, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(354, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(355, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(356, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(357, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(358, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(359, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(360, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(361, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(362, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(363, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(364, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(365, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(366, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(367, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(368, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(369, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(370, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(371, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(372, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(373, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(374, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(375, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(376, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(377, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(378, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(379, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(380, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(381, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(382, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(383, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(384, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(385, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(386, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(387, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(388, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(389, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(390, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(391, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(392, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(393, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(394, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(395, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(396, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(397, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(398, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(399, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(400, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(401, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(402, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(403, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(404, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(405, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(406, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(407, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(408, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(409, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(410, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(411, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(412, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(413, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(414, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(415, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(416, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(417, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(418, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(419, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(420, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(421, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(422, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(423, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(424, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(425, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(426, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(427, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(428, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(429, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(430, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(431, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(432, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(433, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(434, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(435, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(436, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(437, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(438, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(439, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(440, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(441, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(442, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(443, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(444, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(445, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(446, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(447, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(448, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(449, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(450, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(451, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(452, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(453, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(454, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(455, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(456, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(457, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(458, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(459, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(460, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(461, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(462, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(463, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(464, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(465, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(466, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(467, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(468, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(469, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(470, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(471, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(472, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(473, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(474, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(475, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(476, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(477, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(478, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(479, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(480, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(481, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(482, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(483, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(484, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(485, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(486, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(487, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(488, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(489, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(490, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(491, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(492, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(493, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(494, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(495, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(496, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(497, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(498, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(499, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(500, "", "", "", "", "", 0, ""));
//        options.put("", questionList);

        Utils.logRequestBody(options);
        return options;
    }

    private static Question getQuestion(int questionId, String question, String option1, String option2, String option3, String option4, int answer, String explanation) {
        return new Question(questionId, question, option1, option2, option3, option4, answer, explanation, 0);
    }
}
