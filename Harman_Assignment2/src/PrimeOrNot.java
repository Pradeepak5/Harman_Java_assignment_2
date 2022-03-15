import java.util.Scanner;
public class PrimeOrNot {

	public static void main(String[] args) {
		int min;
        int max;
        Scanner s=new Scanner(System.in);
        System.out.println("Min Value :");
        min=s.nextInt();
        System.out.println("Max Value :");
        max=s.nextInt();
        
        for(int n=min;n<=max;n++) {
            if(isPrime(n)) {
                System.out.println(n);
            }

	}

}
	public static boolean isPrime(int num) {    
        for(int i = 2; i <= num/i; ++i) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}