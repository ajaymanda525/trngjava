import java.util.Scanner;
class Program18
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
switch(num)
{
case 1:{System.out.print("JAN");break;}
case 2:{System.out.print("FEB");break;}
case 3:{System.out.print("MAR");break;}
case 4:{System.out.print("APR");break;}
case 5:{System.out.print("MAY");break;}
case 6:{System.out.print("JUNE");break;}
case 7:{System.out.print("JULY");break;}
case 8:{System.out.print("AUG");break;}
case 9:{System.out.print("SEP");break;}
case 10:{System.out.print("OCT");break;}
case 11:{System.out.print("NOV");break;}
case 12:{System.out.print("DEC");break;}
default: {System.out.print("INVALID");break;}
}
}
} 