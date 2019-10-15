package za.co.diputu.Model;

import java.util.*;

public class Main {

    public void isHighestDegree(String x)
    {
        ArrayList<String> str = new ArrayList<String>();
//        str.add(x);
        String [] str1 = x.split("\\Q^\\E");
//        String [] str2 = x.;
        ///////////////////////////////////////////
              String equation = "5x^0 - 2 + 3y^1";
        String [] arr = equation.split("\\Q^\\E");
        
        for (int c = 1;c < arr.length;c++){
            System.out.println(arr[c].split(" ")[0]);
        }
        ///////////////////////////////////////////
        for (String a : str1)
        {
            System.out.println("A test " + a);
            for (int i = 0; i < str1.length;i++)
            {
                System.out.println("Another test " + str1[i]);
            }
//            System.out.println("yo " + str1);
        }
        String [] r;
        for (int i = 0; i < str1.length;i++)
        {
//            char ch = '^';
//            int ascii = ch;
//            int castAscii = (int) ch;
//            System.out.println(castAscii);
            System.out.println("yoo "  + str1[i]);
            System.out.println("yoo aaaah "  + str1[1]);
            if (str1[i] == str1[1])
            {
                System.out.println(str1[1] + "yoo");
            }
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
        x.isHighestDegree("5 * X^0 + 4 * X^1 = 4 * X^0");


    }
}
