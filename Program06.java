import java.util.Scanner;
class Program06
{
public static void main(String args[]){
Scanner scob = new Scanner(System.in);
int num1=scob.nextInt();
int i;
i=0;
while(i<=10)
{
	System.out.println(num1+"*"+i+"="+num1*i);
	i=i+1;
}//close while loop
}//main()
}//program06
