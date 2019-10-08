package za.co.diputu.Model;

import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

    public void isHighestDegree(String[] x)
    {
        ArrayList<String> str = new ArrayList<String>();
//        str.add(x);
        x = new String[]{"5 * X^0 + 4 * X^1 = 4 * X^0"};
        for()
        {

        }
    }

    public void isCoefficient(String equation)
    {
        String[] test = equation.split(" ");
        String numRegex   = ".*[0-9].*";
        String alphaRegex = ".*[a-zA-Z].*";

        for (int i = 0; i < test.length; i++)
        {
            if (test[i].matches(numRegex) && test[i].matches(alphaRegex))
            {
                System.out.println("isCoefficient: " + test[i]);
            }
            else
            {
                System.out.println("Something isn't right");
            }
        }
    }

    public void isPower(int basenumber, int exponent)
    {
        long temp = 1;

        while (exponent != 0) {
            temp *= basenumber;
            --exponent;
            System.out.println("Result " + temp);
        }
    }

    public static void main(String[] args) {
        Main x = new Main();
//        x.isPower(9,5);
//        Scanner myObj = new Scanner(System.in);
//        x.isCoefficient("12Bw");
        x.isHighestDegree(new String[]{"5 * X^0 + 4 * X^1 = 4 * X^0"});


    }
}
