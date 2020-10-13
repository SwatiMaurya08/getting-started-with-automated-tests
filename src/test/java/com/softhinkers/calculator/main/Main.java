package com.softhinkers.calculator.main;


import com.softhinkers.calculator.addition.TestAddition;
import com.softhinkers.calculator.division.TestDivision;
import com.softhinkers.calculator.multiplication.TestMultiplication;
import com.softhinkers.calculator.substraction.TestSubstraction;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestAddition.class, TestSubstraction.class ,
                TestDivision.class, TestMultiplication.class);

        List<Failure>failureList = result.getFailures();
        for(Failure failed: failureList){
            System.out.println(failed.getDescription());
            System.out.println(failed.getMessage());
            System.out.println(failed.getException());
            System.out.println(failed.getTestHeader());
            System.out.println(failed.getTrace());
        }

    }

}


