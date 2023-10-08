package org.example;

public class NullExceptionExample {
    public static void main(String[] args) {
        String s = "abc";

        printWithCatch(null);
        printWithCatch(s);

        printWithIfElse(null);
        printWithIfElse(s);
    }

    static void printWithCatch(String str) {
        try {
            str.charAt(0);
            System.out.println(str);
            //System.out.println("First character: " + str.charAt(0));
        } catch (NullPointerException e) {
            System.out.println("NullPointerException thrown!");
        }
    }

    static void printWithIfElse(String str) {
        // != ! och =
        if(str != null) {
            System.out.println(str);
        } else {
            System.out.println("NullPointerException thrown!");
        }
    }










}
