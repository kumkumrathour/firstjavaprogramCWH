 import java.util.Scanner;
public class Lecture5 {
    public static void main(String[] args){
System.out.println("hello world ");
 System.out.println(" Take marks from the user ");
Scanner sc = new Scanner(System.in);
int M=500;
System.out.println(" marks of maths");
int a=sc.nextInt();
System.out.println(" marks of hindi ");
int b = sc.nextInt();
System.out.println(" marks of english ");
int c= sc.nextInt();
System.out.println(" marks of social science");
int d= sc.nextInt();
System.out.println(" marks of computer");
int e = sc.nextInt();
int total  = a+b+c+d+e;
System.out.println(" total");
System.out.println(total);
double percentage= total*100/500;
System.out.println("percentage");
System.out.println(percentage);
    }}

