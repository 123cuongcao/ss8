package com.example.demo7.entity;

public class Calculator {
    public static double calculate(double FO,double SO,String operator){
        switch (operator){
            case "MULTIPLY":
                return FO*SO;
            case "DIVIDE":
                if(SO==0){
                    throw new ArithmeticException("số chia k dc bằng không");
                }
                return FO/SO;
            case "PLUS":
                return FO+SO;
            case "MINUS":
                return FO-SO;
        }
        return 0;
    }
}
