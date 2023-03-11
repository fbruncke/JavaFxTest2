package com.example.javafxtest2;

import javafx.beans.property.IntegerProperty;
import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleIntegerProperty;

public class Calculator {

    private IntegerProperty digit1 = new SimpleIntegerProperty();
    private IntegerProperty digit2 = new SimpleIntegerProperty();
    private IntegerProperty digitResult = new SimpleIntegerProperty();

    //region Getters/Setters
    public void setDigit1(int digit1) {
        this.digit1.set(digit1);
    }

    public void setDigit2(int digit2) {
        this.digit2.set(digit2);
    }

    public void setDigitResult(int digitResult) {
        this.digitResult.set(digitResult);
    }

    public int getDigit1() {
        return digit1.get();
    }

    public IntegerProperty digit1Property() {
        return digit1;
    }

    public int getDigit2() {
        return digit2.get();
    }

    public IntegerProperty digit2Property() {
        return digit2;
    }

    public int getDigitResult() {
        return digitResult.get();
    }

    public IntegerProperty digitResultProperty() {
        return digitResult;
    }
    //endregion


    public Calculator()
    {
        add();
    }

    public void add()
    {
        digitResult.bind( Bindings.add(digit1,digit2) );

    }

    public void multiply()
    {
        digitResult.bind( Bindings.multiply(digit1,digit2) );
    }
}
