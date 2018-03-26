package com.example.renuka.login.Utils;


/**
 * Created by hp on 18-02-2018.
 */

public class StringManipulation {

    public static String expandUsername(String username){
        return username.replace(".", " ");
    }

    public static String condenseUsername(String username){
        return username.replace(" " , ".");
    }
}
