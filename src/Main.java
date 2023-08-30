import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        calculate c=new calculate();
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        System.out.println(c.check(num));
    }
}
class calculate
{
    String check(int n)
    {
        int count=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0){
                count+=1;
            }
        }
        if(count>0){
            return("The number is not a prime.");
        }
        else{
            return("The number is prime.");
        }
    }
}