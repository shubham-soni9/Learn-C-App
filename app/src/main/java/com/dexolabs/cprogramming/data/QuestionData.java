package com.dexolabs.cprogramming.data;

import java.util.LinkedHashMap;

public class QuestionData {
    public static LinkedHashMap<String, String> getQuestionData() {
        LinkedHashMap<String, String> options = new LinkedHashMap<>();

        options.put("What are different storage class specifiers in C?", "auto, register, static, extern");

        options.put("What is scope of a variable? How are variables scoped in C?", "Scope of a variable is the part of the program where" +
                " the variable may directly be accessible. In C, all identifiers are lexically (or statically) scoped. See this for more" +
                " details.");

        options.put("What is NULL pointer?", "NULL is used to indicate that the pointer doesn’t point to a valid location. Ideally, we" +
                " should initialize pointers as NULL if we don’t know their value at the time of declaration. Also, we should make a " +
                "" +
                "pointer NULL when memory pointed by it is deallocated in the middle of a program.");

        options.put("What is Dangling pointer?", "Dangling Pointer is a pointer that doesn’t point to a valid memory location. Dangling pointers arise when an object is deleted or deallocated, without modifying the value of the pointer, so that the pointer still points to the memory location of the deallocated memory. ");

        options.put("What are the key features in C programming language?", "<ul>\n" +
                "<li><strong>Portability</strong>&nbsp;&ndash; Platform independent language.</li>\n" +
                "<li><strong>Modularity</strong>&nbsp;&ndash; Possibility to break down large programs into small modules.</li>\n" +
                "<li><strong>Flexibility</strong>&nbsp;&ndash; The possibility to a programmer to control the language.</li>\n" +
                "<li><strong>Speed</strong>&nbsp;&ndash; C comes with support for system programming and hence it is compiling and executes with high speed when comparing with other high-level languages.</li>\n" +
                "<li><strong>Extensibility</strong>&nbsp;&ndash; Possibility to add new features by the programmer.</li>\n" +
                "</ul>");


        return options;
    }
}
