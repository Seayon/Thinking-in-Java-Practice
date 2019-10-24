package com.seayon.chapter18;

import java.io.File;
import java.io.FilenameFilter;

public class DirFileFilter implements FilenameFilter {
    @Override
    public boolean accept(File dir, String name) {
        if (name.matches("\\w.*\\.java")) {
            return true;
        } else {
            return false;
        }
    }
}
