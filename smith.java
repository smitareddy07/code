import java.util.*;
class smith{
public static void main(String args[]){
System.out.println("enter a number");
Scanner s=new Scanner(System.in);
int n=s.nextInt(); 

int flag=0;
for(int i=1;i<=n;i++){
if( n %i == 0){

flag = flag+1;
}}
if(flag ==2){
System.out.println("it is a prime num");
}
else {
System.out.println("it is not a prime");
}
}
}
