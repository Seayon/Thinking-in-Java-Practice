package com.seayon.chapter18;

import org.junit.Test;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class SortedDirList {
    @Test
    public static void main(String[] args) {
        System.out.println(System.getProperty("file.encoding"));
        File path = new File(".");
        String[] list;
        if (args.length == 0) {
            list = path.list();
        } else {

//              java 8 lambda 表达式写法
            list = path.list((dir, name) -> name.matches("\\w.*\\.java"));
            list = path.list((File dir, String name) -> name.matches("\\w.*\\.java"));
            list = path.list((File dir, String name) -> {
                return name.matches("\\w.*\\.java");
            });
            list = path.list(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.matches("\\w.*\\.java");
                }
            });
        }
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String s : list) {
            System.out.println("s = " + s);
            Thread.yield();
        }
    }
}
