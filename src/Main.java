import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while(sc.hasNextInt())
        {
            int play = sc.nextInt();
            double p = sc.nextDouble();
            int win = sc.nextInt();
            double pi = 0;
            for(int i = 0;i < cases;i++)
            {
                if(p == 0.0)
                {
                    System.out.println("0.0000");
                    break;
                }
                else
                {
                    pi = Math.pow(1-p,win-1)*p/(1-Math.pow(1-p,play));
                    System.out.printf("%.4f\n",pi);
                    break;
                }
            }
        }
    }
}
