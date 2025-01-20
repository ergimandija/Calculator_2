package org.example;

public class Calculator {
    public int add(int a,int b){
        return a+b;

    }

    public int subtract(int a,int b){
        return a-b;
    }

    public int multiplication(int a, int b){

        return a*b;
    }

    public double division(double a, double b) throws DivideByZeroException{
        if(b==0){
            throw new DivideByZeroException();
        }
        return a/b;

    }
    public double quadratwurzel(int a){
        return Math.sqrt(a);
    }

    public int quadrierung(int a){
        return (int)Math.pow(a, 2);
    }

    public double sin(double a){
        return Math.sin(a);
    }

    public double cos(double a){
        return Math.cos(a);
    }

}
