package com.seayon.chapter18;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FormattedMemoryInput {
    @Test
    public static void main(String[] args){
        DataInputStream dataInputStream = null;
        try {
            dataInputStream = new DataInputStream(new ByteArrayInputStream(
                    BufferedInputFile.read("/Users/seayon/IdeaProjects/MyAutoPy/AutoRebootYd/AutoRebootYd.py").getBytes()
            ));
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (true) {
            try {
                System.out.print((char) dataInputStream.readByte());
            } catch (IOException e) {
                System.out.println("结束啦");
                e.printStackTrace();
                break;
            }
        }
    }
}
