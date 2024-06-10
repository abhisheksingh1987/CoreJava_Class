package com.abhi.oops;

public class Main3
{
    double overloadedMethod(double d)
    {
        return d *= d;
    }
 
    int overloadedMethod(int i)
    {
        return overloadedMethod(i *= i);
    }
 
    float overloadedMethod(float f)
    {
        return overloadedMethod(f *= f);
    }
 
    public static void main(String[] args)
    {
        Main3 main = new Main3();
 
        System.out.println(main.overloadedMethod(100));
    }
}
