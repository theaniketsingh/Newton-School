import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		int marks = 0;
		for(int i=0; i<5; i++){
			int sub = scan.nextInt();
			marks = marks + sub;
		}
		marks = (marks*100)/500;
		if(marks >= 80){
			System.out.print("A");
		}else if(marks <80 && marks >=60){
			System.out.print("B");
		}else if(marks <60 && marks >=40){
			System.out.print("C");
		}else{
			System.out.print("D");
		}
	}
}