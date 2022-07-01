import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double determinant = b * b - 4 * a * c;
		double root1;
		double root2;
		int cases;
		if(determinant > 0){
			cases = 1;
		}else if(determinant == 0){
			cases = 2;
		}else{
			cases = 3;
		}
		
		switch(cases){
			case 1:
			root1 = (-b + Math.sqrt(determinant)) / (2 * a);
			root2 = (-b - Math.sqrt(determinant)) / (2 * a);
			System.out.format("%.2f\n",root1);
			System.out.format("%.2f",root2);
			break;
			case 2:
			root1 = -b / (2 * a);
			root2 = root1;
			System.out.format("%.2f\n",root1);
			System.out.format("%.2f",root2);
			break;
			case 3:
			double real = -b / (2 * a);
			double imaginary = Math.sqrt(-determinant) / (2 * a);
			System.out.format("%.2f+i%.2f", real, imaginary);
			System.out.format("\n%.2f-i%.2f", real, imaginary);
			break;
		}
	}
}