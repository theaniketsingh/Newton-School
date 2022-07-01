import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		if(A <= 10 && B >= 10){
			System.out.print("true ");
		}else{
			System.out.print("false ");
		}
		if(A%2==0 || B%2==0){
			System.out.print("true ");
		}else{
			System.out.print("false ");
		}
		if(A!=B){
			System.out.print("true ");
		}else{
			System.out.print("false ");
		}
	}
}