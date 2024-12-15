import java.util.Scanner;
class PN{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
if (a<0){
System.out.println("Negative number"); 
}
else if (a>0){
System.out.println("Positive");}
else {
System.out.println("not positive not negative");}
sc.close();
}
}
