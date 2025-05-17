import java.util.*;
class p1{
public static void main(String args[]){
System.out.println("enter a num");
Scanner s=new Scanner (System.in);
int n =s.nextInt();
int rem=0,rev=0,n1=0;
n1=n;
while(n>0){
rem = n%10;
rev = rev*10+rem;
n=n/10;
}
System.out.println(rev);
}
}
