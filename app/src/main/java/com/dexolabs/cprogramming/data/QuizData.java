package com.dexolabs.cprogramming.data;

import com.dexolabs.cprogramming.model.Question;

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

//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(71, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(72, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(73, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(74, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(75, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(76, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(77, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(78, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(79, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(80, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(81, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(82, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(83, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(84, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(85, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(86, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(87, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(88, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(89, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(90, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(91, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(92, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(93, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(94, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(95, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(96, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(97, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(98, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(99, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(100, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(101, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(102, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(103, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(104, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(105, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(106, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(107, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(108, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(109, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(110, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(111, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(112, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(113, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(114, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(115, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(116, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(117, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(118, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(119, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(120, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(121, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(122, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(123, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(124, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(125, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(126, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(127, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(128, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(129, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(130, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(131, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(132, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(133, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(134, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(135, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(136, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(137, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(138, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(139, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(140, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(141, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(142, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(143, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(144, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(145, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(146, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(147, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(148, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(149, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(150, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(151, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(152, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(153, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(154, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(155, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(156, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(157, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(158, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(159, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(160, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(161, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(162, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(163, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(164, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(165, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(166, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(167, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(168, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(169, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(170, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(171, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(172, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(173, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(174, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(175, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(176, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(177, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(178, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(179, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(180, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(181, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(182, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(183, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(184, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(185, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(186, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(187, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(188, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(189, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(190, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(191, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(192, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(193, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(194, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(195, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(196, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(197, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(198, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(199, "", "", "", "", "", 0, ""));
//        questionList.add(getQuestion(200, "", "", "", "", "", 0, ""));
//        options.put("", questionList);
//
//
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


        return options;
    }

    private static Question getQuestion(int questionId, String question, String option1, String option2, String option3, String option4, int answer, String explanation) {
        return new Question(questionId, question, option1, option2, option3, option4, answer, explanation, 0);
    }
}
