package com.company;

import javax.print.DocFlavor;

public class Main {

    private String memberVariable = "I am a member variable, I have class level scope.";
    private int memberInt = 10;
    private int count = 0;

    public static void main(String[] args) {

        Main main = new Main();
//        main.aMethod();
//        main.anotherMethod();
//        main.methodForLoopVaribles();
        main.memberVsLocalVariable();

    }

    private void aMethod() {

        String localVariable = "I am a local variable, I can only be used in this method";
        System.out.println("Inside first method");
        System.out.println(memberVariable);
        System.out.println(localVariable);
    }

    private void anotherMethod() {
        System.out.println("inside second method");
        System.out.println(memberVariable);
    }

    private void methodForLoopVaribles() {
        String localVariable = "just another member variable outside our do while loop";
        boolean runDoLoop = true;
        do {
            String loopVariable = " I am a loop variable inside our do while loop";
            System.out.println("Inside our do while loop: ");
            System.out.println(localVariable);
            runDoLoop = false;
        } while (runDoLoop);
        System.out.println("inside third method, just outside do while loop");
        System.out.println(localVariable);

    }

    private void memberVsLocalVariable() {
        int localInt = 7;
        localInt *= 2;
        memberInt *= 2;
        if (count <= 2) {
            System.out.println("memberInt *= 2 = " + memberInt);
            System.out.println("localInt *= 2 = " + localInt);
            count++;
            memberVsLocalVariable();

        }
    }
}