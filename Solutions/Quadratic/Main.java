import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int X = scan.nextInt();
		int result = (A*(X*X))+(B*X)+C;
		System.out.print(result);
	}
}