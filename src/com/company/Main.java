package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        int sum1=0, sum2=0;
        /* the sums are assigned the value 0 which is the number of tearing and closing parentheses */
        System.out.println("Enter a parentheses (),the brackets [],and the braces{}: ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            String string = in.readLine();
            /* scanning each character from the first to the end of the string */
            for(int i = 0; i < string.length(); i++){
                /* increasing the first sum if the symbol is an opening parenthesis */
                if('(' == string.charAt(i)){
                    sum1 = sum1+1;
                }
                else if(')' == string.charAt(i)){
                    sum2 = sum2+1;
                }
            }
            if(sum1 == sum2){
                System.out.println("The balance is respected");
            }
            else {
                System.out.println("The balance is not respected");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
