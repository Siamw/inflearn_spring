package com.test.www;

public class MyCalculator {

    private Calculation calculation;
    private int firstNum;
    private int secondNum;

    public Calculation getCalculation() {
        return calculation;
    }

    public void setCalculation(Calculation calculation) {
        this.calculation = calculation;
    }

    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }
    public void add(){calculation.addition(firstNum,secondNum);}
    public void sub(){calculation.substraction(firstNum,secondNum);}
    public void mul(){calculation.multiplication(firstNum,secondNum);}
    public void div(){calculation.division(firstNum,secondNum);}
}
