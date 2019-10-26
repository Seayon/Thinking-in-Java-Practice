package com.seayon.chapter18;

import java.io.*;

public class Redirecting {
    public static void main(String[] args) throws IOException {
        PrintStream console = System.out;
        FileInputStream fileInputStream = new FileInputStream("/Users/seayon/IdeaProjects/Thinking-in-Java-Practice/src/main/java/com/seayon/chapter18/Redirecting.java");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        FileOutputStream fileOutputStream = new FileOutputStream("/Users/seayon/IdeaProjects/Thinking-in-Java-Practice/src/main/java/com/seayon/chapter18/t.txt");
        PrintStream out = new PrintStream(new BufferedOutputStream(fileOutputStream));
        System.setIn(bufferedInputStream);
        System.setOut(out);
//        System.setErr(out);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s;

        while ((s = bufferedReader.readLine()) != null) {
            System.out.println(s);
            System.setOut(console);
        }
        out.close();
        System.setOut(console);
        System.err.println("        FileOutputStream fileOutputStream = new FileOutputStream(\"/Users/seayon/IdeaProjects/Thinking-in-Java-Practice/src/main/java/com/seayon/chapter18/t.txt\");\n");

    }
}
