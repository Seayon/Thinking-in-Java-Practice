package com.seayon.chapter19;

import net.mindview.util.Generator;

import java.util.Random;

enum CartoonCharacter implements Generator<CartoonCharacter> {
    BOB,NUTTY,SLIYY;
    public Random random = new Random(47);

    @Override
    public CartoonCharacter next() {
        return values()[random.nextInt(3)];
    }
}
