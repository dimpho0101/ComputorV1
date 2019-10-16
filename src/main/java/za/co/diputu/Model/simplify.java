package za.co.diputu.Model;

import java.util.*;

public class simplify {

    public  void simplify(String x)
    {
        ArrayList<String> str = new ArrayList<String>();
        String [] a = x.split("[-+*/]");
        for (int c = 0; c < a.length; c++)
        {
            System.out.println("A test " +  a[c]);
            String test = a[c];
            str.add(test);
        }
        for (int i = 0;i < a.length; i++) {
            if (a[i].matches(".*[a-zA-Z].*"))
            {
                System.out.println("Fierce " + a[i]);
//                System.out.println("List index " + str.get(i));
            }
        }
    }
    public static void main(String[] args) {
        simplify x = new simplify();
        x.simplify("3x - 4y + 8x + 2");
    }
}
