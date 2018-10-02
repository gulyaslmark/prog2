/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author L4Vulture
 */
public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    
    public double getDiscriminant(){
        return b*b-4*a*c;
    }
    
    public double getRoot1(){
        if(this.getDiscriminant()>=0)
        return -b+Math.sqrt(b*b-(4*a*c))/2*a;
        else
            return 0;
    }
    
    public double getRoot2(){
        if(this.getDiscriminant()>=0)
        return -b-Math.sqrt(b*b-(4*a*c))/2*a;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "QuadraticEquation{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }

   
    
}
