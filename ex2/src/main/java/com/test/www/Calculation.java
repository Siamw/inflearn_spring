package com.test.www;

public class Calculation {

    private int firstNum;
    private int secondNum;


    public void addition(int a, int b){
        System.out.println("add()");
        System.out.println(a +" + "+ b+" = "+(a+b));
    }
    public void substraction(int a, int b){ System.out.println("sub()");
        System.out.println(a +" - "+ b+" = "+(a-b));
    }
    public void multiplication(int a, int b){ System.out.println("mul()");
        System.out.println(a +" * "+ b+" = "+(a*b));
    }
    public void division(int a, int b){ System.out.println("div()");
        System.out.println(a +" / "+ b+" = "+(a/b));
    }
}
