package com.seayon.chapter17;

import net.mindview.util.CollectionData;
import net.mindview.util.Generator;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

public class Government implements Generator<String> {

    String[] foundation = ("I am Seayon  who come from Seayon China, with java").split(" ");
    //    inde默认值是 0
    private int index;

    @Override
    public String next() {
        return foundation[index++];
    }

    @Test
    public void CollectionDataTest() {
        Set<String> set = new LinkedHashSet<>(new CollectionData<String>(new Government(), 7));
        set.addAll(CollectionData.list(new Government(), 7));
        System.out.println(set);

    }


}
