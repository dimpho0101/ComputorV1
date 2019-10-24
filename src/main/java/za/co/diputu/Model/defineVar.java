package za.co.diputu.Model;

public class defineVar {
    public double isNumber(String num)
    {
        int numParsed;
        if (num.contains(".*[0-9].*"))
        {
            System.out.println(num);
        }
        numParsed = Integer.parseInt(num);
        return numParsed;
    }

    public static void main(String[] args) {
        defineVar x = new defineVar();
        x.isNumber("12x - 12");
    }
}
