class FactorialList{
public static void main (String args[]){
int i=1;
while (1<=10){
int num =i,fact=1;
while (num>0){
fact=fact*num;
num--;
}
System.out.println("Factorial of"+i+"="+fact);
i++;
}
}
}