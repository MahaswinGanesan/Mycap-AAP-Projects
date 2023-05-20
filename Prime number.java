import java.util.Scanner;
class Prime{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:");
int number=sc.nextInt();
boolean check=true;

for(int i=2;i<number;i++){
	if(number/i == 0){
		check=false;
		break;
}
}
if(check==true){
	System.out.println("The number is a prime number")}
else{
	System.out.println("The number is not a prime number")}
}
}