import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int marks = 0;
		for(int i=0; i<len; i++){
			int A = scan.nextInt();
			marks = marks + (A*A);
		}
		double mean = marks/(double)len;
		double result = Math.sqrt(mean);
		System.out.printf("%.6f",result);
	}
}