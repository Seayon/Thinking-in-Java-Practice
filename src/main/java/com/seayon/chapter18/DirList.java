package com.seayon.chapter18;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class DirList {
    public static void main(String[] args) {
        File path = new File(".");
        String[] list;
        if (args.length == 0) {
            list = path.list();
        } else {
            /*λ表达式本质上是一个匿名方法。让我们来看下面这个例子：

            public int add(int x, int y) {
                return x + y;
            }

            转成λ表达式后是这个样子：

            (int x, int y) -> x + y;

            参数类型也可以省略，Java编译器会根据上下文推断出来：

    (x, y) -> x + y; //返回两数之和
            */


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
        }
    }
}
