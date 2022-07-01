import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int assum = 2;
		int A = scan.nextInt();
		assum = assum+A;
		assum = assum*2;
		int B = scan.nextInt();
		assum = assum+B;
		assum = assum/2;
		assum = assum-2;
		System.out.print(assum);
	}
}