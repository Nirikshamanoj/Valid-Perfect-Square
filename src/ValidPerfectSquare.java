import java.util.Scanner;
public class ValidPerfectSquare {
    static void findPerfectSquare(int n)
    {
        boolean isSquare=false;
        for (int i=1;i<n;i++)
        {
            if(i*i==n)
                isSquare=true;
        }
        System.out.println(isSquare);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        findPerfectSquare(n);
    }
}
