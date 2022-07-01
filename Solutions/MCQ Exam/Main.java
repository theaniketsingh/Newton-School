import java.io.*;
import java.util.*;

class Main{
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		int P = scan.nextInt();
		int Q = scan.nextInt();
		int R = scan.nextInt();
		int S = scan.nextInt();
		if(P>=Q && P>=R && P>=S ){
			System.out.print(P);
		}else if(Q>=P && Q>=R && Q>=S ){
			System.out.print(Q);
		}else if(R>=P && R>=Q && R>=S ){
			System.out.print(R);
		}else if(S>=Q && S>=R && S>=P ){
			System.out.print(S);
		}
	}
}