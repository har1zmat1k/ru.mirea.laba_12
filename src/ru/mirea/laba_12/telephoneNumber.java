package ru.mirea.laba_12;

import java.util.Scanner;

public class telephoneNumber {
    public telephoneNumber(String number) {
        StringBuilder format = new StringBuilder();
        format.append("+<");
        for(int i = 0; i < number.length(); ++i){
            if ('+' == number.charAt(i)) {
                ++i;
            }
            if( Character.isDigit( number.charAt(i) ) && number.length()-i > 10 ){
                if(Character.isDigit(number.charAt(0))){
                    format.append(Character.getNumericValue(number.charAt(0))-1);
                }
                else {
                    format.append(number.charAt(i));
                }
            }
            else if( Character.isDigit( number.charAt(i))){
                if(number.length()-i == 10 || number.length()-i == 7 || number.length()-i == 4){
                    format.append("><");
                }
                format.append(number.charAt(i));
            }
        }
        format.append('>');
        System.out.println(format);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String tn1 = "+79175655655";
        String tn2 = "89175655655";
        new telephoneNumber(tn1);
        new telephoneNumber(tn2);
    }
}
