package com.seayon.chapter18;

import net.mindview.util.Directory;
import net.mindview.util.TextFile;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;

public class DirListEx1 {
    public static void main(String[] args) {
        File path = new File("./src/main/java/com/seayon/chapter18/");
        String[] list;
        if (args.length == 0) {
            list = path.list();
        } else {
//            list = path.list((dir, name) -> TextFile.read(dir.getPath() + File.separator + name).contains(args[0]));
            list = path.list((dir, name) -> Collections.disjoint(Arrays.asList(args), new TextFile(dir.getPath() + File.separator + name, "\\SECCODE")));
        /*    list = path.list((dir, name) -> false);
            list = path.list((dir, name) -> {
                int x = 0, y = 1;
                if (x < y) {
                    return false;
                } else {
                    return true;
                }
            });*/
//            list = path.list((dir, name) -> name.matches("\\w.*\\.java"));
//            SECCODE
        }
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String s : list) {
            System.out.println("s = " + s);
        }
        System.out.println("Directory.walk(\".\") = " + Directory.walk(".",".*Ex.*"));

    }
}
