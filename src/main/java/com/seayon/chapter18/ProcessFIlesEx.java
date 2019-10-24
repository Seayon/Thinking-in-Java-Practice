package com.seayon.chapter18;

import net.mindview.util.Directory;
import net.mindview.util.ProcessFiles;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ProcessFIlesEx extends ProcessFiles {
    private ProcessFiles.Strategy strategy;
    private String regex;

    public ProcessFIlesEx(Strategy strategy, String ext) {
        super(strategy, ext);
    }

    @Override
    public void processDirectoryTree(File root) throws IOException {
        Iterator var3 = Directory.walk(root.getAbsolutePath(), regex).iterator();

        while(var3.hasNext()) {
            File file = (File)var3.next();
            this.strategy.process(file.getCanonicalFile());
        }

    }

    public static void main(String[] args) {
        System.out.println("1<<2 = " + (1 << 2));
//        lambda写法
        new ProcessFiles(file -> {
            System.out.println(file);
        }, "gitignore").start(args);


        /*new ProcessFiles(file -> {

        }, "").start(args);*/
    }
}
