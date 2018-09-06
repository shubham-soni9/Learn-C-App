package com.dexolabs.cprogramming.data;

import java.util.LinkedHashMap;

public class ReferenceData {

    public static LinkedHashMap<String, String> getReferenceData() {
        LinkedHashMap<String, String> options = new LinkedHashMap<>();
        options.put("www.programiz.com", "Learn to code in C, C++, R and Python programming languages using our simplest tutorials for beginners.");
        options.put("www.geeksforgeeks.org", "This portal has been created to provide well written, well thought and well explained solutions for selected questions.");
        options.put("www.indiabix.com", "Learn and practice Aptitude questions and answers with explanation for interview, competitive examination and entrance test.");
        options.put("www.includehelp.com", "This site is specially designed to provide help to students, working professionals and job seekers.");
        options.put("www.tutorialspoint.com", "Tutorials Point originated from the idea that there exists a class of readers who respond better to online content and prefer to learn new skills at their own pace from the comforts of their drawing rooms.");
        options.put("www.examveda.com", "Learn C Programming MCQ questions and answers with explanation for Campus requirement, Interview, competitive examination and entrance test.");
        options.put("Let Us C", "\"Today's challenges\" need \"Today's solutions\". The way this applies to real-word, it equally applies to programming world. To create solutions that meet today's expectations, one needs to use a modern language like C# and technology like .NET. learning C#.");
        return options;
    }
}
