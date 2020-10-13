package com.softhinkers.calculator.addition;

import com.softhinkers.calculator.arithemetic.Arithemetic;

public class Addition extends Arithemetic {

    public int addition(int a, int b) {
        return a + b;
    }

    @Override
    public float addition(float a, float b) {
        return a + b;
    }
}
