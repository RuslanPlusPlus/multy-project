package com.ruslan.task1;

import org.example.task1.CustomStringUtils;

public class Utils {
    public static boolean isAllPositiveNumbers(String ...numbers){
        boolean result = true;
        for (String number: numbers){
            if (!CustomStringUtils.isPositiveNumber(number)){
                result = false;
            }
        }
        return result;
    }
}
