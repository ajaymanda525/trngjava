import java.util.Scanner;
class Program20
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers:");
int num1=sc.nextInt();
int num2=sc.nextInt();
int i=0;
while(i<5)
{
System.out.println("1:ADDITION");
System.out.println("2:SUBTRACTION");
System.out.println("3:MULTIPICATION");
System.out.println("4:DIVISION");
System.out.println("5:MODULUS DIVISION");
int choice=sc.nextInt();
if(choice==1)System.out.println(num1+"+"+num2+"="+(num1+num2));
else if(choice==2)System.out.println(num2+"-"+num2+"="+(num1-num2));
else if(choice==3)System.out.println(num1+"*"+num2+"="+(num1*num2));
else if(choice==4)System.out.println(num1+"/"+num2+"="+(num1/num2));
else if(choice==5)System.out.println(num1+"%"+num2+"="+(num1%num2));
}
}
}

