package com.example.erin.howdrunkareyou;

import java.util.Random;

/**
 * Created by Nikhil on 4/8/2017.
 */

public class MyGenerator {

    private static Random rand = new Random();
    private static String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz()[]{}^*!@#$";
    private static int numChars = 64;
    private static char [] ops = {'+', '-', '*'};


    private MyGenerator(){}


    public static String genWord(int length){

        char[] word = new char[length];

        for (int i = 0; i < length; i++){
            int index = (int) (rand.nextFloat() * numChars);
            word[i] = charset.charAt(index);
        }
        return new String(word);
    }

    public static String[] genMath(){

        int term1 = rand.nextInt(15);
        int term2 = rand.nextInt(15);
        int term3 = rand.nextInt(300);
        int answer = term1;

        char op1 = ops[rand.nextInt(2)];
        char op2 = ops[rand.nextInt(2)];

        String eqn = "(" + term1 + " " + op1 + " " + term2 + " ) " +  op2 + " " + term3;

        if (op1 == '+') answer += term2;
        else if (op1 == '-') answer -= term2;
        else answer *= term2;

        if (op2 == '+') answer += term3;
        else if (op1 == '-') answer -= term3;
        else answer *= term3;


        String[] output = new String[2];
        output[0] = eqn;
        output[1] = Integer.toString(answer);
        return output;
    }

}
