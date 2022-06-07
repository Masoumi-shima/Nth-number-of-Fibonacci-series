import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int number = getNumber();
        int sum = 0;
        List<Integer> fiboSeries = getFibonacci(number * 2);
        for(int i = 0; i <= number * 2; i+=2)
        {
            sum += fiboSeries.get(i);
        }
        System.out.println(sum);
    }

    private static int getNumber()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        return sc.nextInt();
    }

    private static List<Integer> getFibonacci (int counter)
    {
        List<Integer> fiboSeries = new ArrayList<>();
        fiboSeries.add(0);
        fiboSeries.add(1);

        for (int i = 2; i <= counter; i++)
        {
            fiboSeries.add(i, (fiboSeries.get(i-1) + fiboSeries.get(i-2)));
        }
        return fiboSeries;
    }
}
