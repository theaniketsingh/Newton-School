import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args){

		Scanner scan = new Scanner(System.in);
		int Num = scan.nextInt();
		
		if(Num<0){
			Num = -1;
		}else if(Num>0){
			Num = 1;
		}else if(Num==0){
			Num = 0;
		}
		
		switch(Num){
			case -1:
			System.out.print("Negative");
			break;
			case 1:
			System.out.print("Positive");
			break;
			case 0:
			System.out.print("Zero");
			break;
		}
	}
}