import java.util.Scanner;
class Program11
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int num1 = sc.nextInt();
int inc= sc.nextInt();
int i;
i=0;
while(i<=num1)
{
	System.out.println(i+ ",");
	i=i+inc;
}
}
}