package com.seayon.chapter16;

import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2019/9/1 18:24
 * @Description
 */
public class Ex19 {
    class Arr{
        private int n;

        public int getN() {
            return n;
        }

        public void setN(int n) {
            this.n = n;
        }

        public Arr(int n) {
            this.n = n;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Arr arr = (Arr) o;
            return n == arr.n;
        }

        @Override
        public int hashCode() {
            return Objects.hash(n);
        }
    }
    @Test
    public void testi() {
        Arr[] arrs = new Arr[10];
        Arrays.fill(arrs, new Arr(1));
        Arr[] arrs1 = new Arr[10];
        Arrays.fill(arrs1, new Arr(1));
        System.out.println(Arrays.equals(arrs, arrs1));


    }
}
