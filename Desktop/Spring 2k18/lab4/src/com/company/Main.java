package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String hexNum;
        long decNum;
        int hexDigit = 0;
        int digitPow;
        long decSum = 0;


        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        hexNum = scnr.next();
        hexNum = hexNum.toLowerCase();
        //get number and convert for common reading


        if (hexNum.startsWith("0x")) {
            hexNum = (hexNum.substring(2));
        }
        digitPow = hexNum.length();
            for (int i = 0; i < hexNum.length(); i ++) {

                if (hexNum.charAt(i) == 'a') {
                    hexDigit = 10;
                }
                else if (hexNum.charAt(i) == 'b') {
                    hexDigit = 11;
                }
                else if (hexNum.charAt(i) == 'c') {
                    hexDigit = 12;
                }
                else if (hexNum.charAt(i) == 'd') {
                    hexDigit = 13;
                }
                else if (hexNum.charAt(i) == 'e') {
                    hexDigit = 14;
                }
                else if (hexNum.charAt(i) == 'f') {
                    hexDigit = 15;
                }
                else if (hexNum.charAt(i) == '0') {
                    hexDigit = 0;
                }
                else if (hexNum.charAt(i) == '1') {
                    hexDigit = 1;
                }
                else if (hexNum.charAt(i) == '2') {
                    hexDigit = 2;
                }
                else if (hexNum.charAt(i) == '3') {
                    hexDigit = 3;
                }
                else if (hexNum.charAt(i) == '4') {
                    hexDigit = 4;
                }
                else if (hexNum.charAt(i) == '5') {
                    hexDigit = 5;
                }
                else if (hexNum.charAt(i) == '6') {
                    hexDigit = 6;
                }
                else if (hexNum.charAt(i) == '7') {
                    hexDigit = 7;
                }
                else if (hexNum.charAt(i) == '8') {
                    hexDigit = 8;
                }
                else if (hexNum.charAt(i) == '9') {
                    hexDigit = 9;
                }
                else {
                    System.out.println("error");
                }

                //System.out.println(hexDigit);

                digitPow --;
            decNum = (long) Math.pow(16, digitPow) * hexDigit;
            //System.out.println(decNum);
            decSum += decNum;
        }
        System.out.println("Your number is " + decSum + " in decimal");
    }
}
