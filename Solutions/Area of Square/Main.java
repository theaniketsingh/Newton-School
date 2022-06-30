import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		int side = scan.nextInt();
		int area = side*side;
		System.out.print(area);
	}
}