package com.seayon.chapter18;

import net.mindview.util.ProcessFiles;
import org.junit.Test;

import java.io.*;

public class BufferedInputFile {
    public static String read(String fileName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String s = null;
        StringBuilder stringBuilder = new StringBuilder();
        while ((s = bufferedReader.readLine()) != null) {
            stringBuilder.append(s + "\n");
        }
        bufferedReader.close();
        return stringBuilder.toString();

    }

    public static void main(String[] args) throws IOException {
        System.out.println(read("/Users/seayon/IdeaProjects/Thinking-in-Java-Practice/src/main/java/com/seayon/chapter18/BufferedInputFile.java"));
    }

    @Test
    public void testr() throws IOException {
        System.out.println("我的臒");
        String read = BufferedInputFile.read("/Users/seayon/IdeaProjects/Thinking-in-Java-Practice/src/main/java/com/seayon/chapter18/BufferedInputFile.java");
        StringReader stringReader = new StringReader(read);
        int c;
        while ((c = stringReader.read()) != -1) {
            System.out.print("" + (char) c);
        }


    }
}
