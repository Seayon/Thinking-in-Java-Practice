package com.seayon.chapter07;

import static net.mindview.util.Print.print;

public class Bath {
    private String
            s1 = "Happy",
            s2 = "Happy",
            s3, s4;
    private Soap castitle;
    private int i;
    private float toy;

    public Bath() {
        print("Inside Bath(");
        s3 = "Joy";
        toy = 3.14f;
        castitle = new Soap();
    }
    {
        i = 47;
    }

    @Override
    public String toString() {
        if (s4 == null) {
            s4 = "s4";
        }
        return "Bath{" +
                "s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                ", s3='" + s3 + '\'' +
                ", s4='" + s4 + '\'' +
                ", castitle=" + castitle +
                ", i=" + i +
                ", toy=" + toy +
                '}';
    }
}
