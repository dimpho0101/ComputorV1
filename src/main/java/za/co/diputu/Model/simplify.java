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
        //you are trying to create like terms to simplify equation
//        for (int i = 0;i < a.length; i++) {
//            if (a[i].matches(".*[a-zA-Z].*")) {
//                System.out.println("Fierce " + a[i]);
//                if ()
//                {
//                    System.out.println("");
//                }
////                System.out.println("List index " + str.get(i));
//            }
            System.out.println("yoooo" + str);
        String [] storage = x.split(".*[a-zA-Z].*");
        for (int k = 0; k < str.size(); k++) {
            if (str.get(k).contains("y")) {
                System.out.println(str.get(k));
            }
        }
            boolean num;
    }
    public static void main(String[] args) {
        simplify x = new simplify();
        x.simplify("3x - 4y + 8x + 2");
    }
}
