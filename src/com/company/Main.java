package com.company;
public class Main {
    public static void main(String[] args) {
        String str = "kajak";
        if(czToPalindrom(str)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    static boolean czToPalindrom(String str){
        int i = 0;
        int j = str.length() - 1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}