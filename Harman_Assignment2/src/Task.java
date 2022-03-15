import java.util.Scanner;
public class Task {
	public int add(int a,int b) {
		int c=a+b;
		return c;
	}
	public int mul(int a,int b) {
		int c=a*b;
		return c;
	}
	public static void main(String args[]) {
		int a,b,add,mul;
		Scanner s=new Scanner(System.in);
		Task x=new Task();
		System.out.println("Num 1:");
		a=s.nextInt();
		System.out.println("Num 2:");
		b=s.nextInt();
		
		add=x.add(a,b);
		System.out.println("Addition : "+add);
		mul=x.mul(a , b);
		System.out.println("Multiplication : "+mul);
		
		if(a%8==0) {
			System.out.println("Num 1 is divisible by 8");
		}
		else {
			System.out.println("Num 1 is not divisible by 8");
		}
	}
}
