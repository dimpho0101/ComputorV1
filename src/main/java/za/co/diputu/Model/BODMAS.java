package za.co.diputu.Model;

public class BODMAS {

    public int division(int a, int b)
    {
        return a / b;
    }

    public int addition(int a, int b)
    {
        return a + b;
    }

    public int subtract(int a, int b)
    {
        return a - b;
    }

    public int multiplication(int a, int b)
    {
        return a * b;
    }

    public static void main(String[] args) {
        BODMAS x = new BODMAS();
        int answer = x.multiplication(2, 4);
        System.out.println(answer);
    }
}
